/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import vn.edu.nuce.daotao.StoreManager.model.Receipt;
import vn.edu.nuce.daotao.StoreManager.model.Distributor;
import vn.edu.nuce.daotao.StoreManager.model.Staff;
import vn.edu.nuce.daotao.StoreManager.response.ReceiptResponse;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureReportBill;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureResponseBigDecimal;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureResponseBigInteger;
import vn.edu.nuce.daotao.StoreManager.respository.ReceiptRespository;
import vn.edu.nuce.daotao.StoreManager.respository.DetailInvoiceRepository;
import vn.edu.nuce.daotao.StoreManager.respository.DistributorRespository;
import vn.edu.nuce.daotao.StoreManager.respository.StaffRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.ReceiptTransformer;

/**
 *
 * @author Anh
 */
@Service
public class ReceiptServiceImpl implements ReceiptService {

    @Autowired
    private ReceiptRespository receiptRespository;

    @Autowired
    private ReceiptTransformer receiptTransfomer;

    @Autowired
    private StaffRespository staffRespository;

    @Autowired
    private DistributorRespository distributorRespository;

    @Autowired
    private DetailInvoiceRepository detailInvoiceRepository;

    @Override
    public List<ReceiptResponse> getAllReceiptResponses() {
        return receiptRespository
                .findAll()
                .stream()
                .map(receiptTransfomer::transformToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public List<Object[]> getAllReceiptResponseObjects() {
        return receiptRespository
                .findAll(new Sort(Sort.Direction.DESC, "date"))
                .stream()
                .map(Receipt -> receiptTransfomer.transform(Receipt))
                .collect(Collectors.toList());
    }

    @Override
    public boolean updateReceipt(int statusBtn, ReceiptResponse response) {
        int checkBtn = statusBtn;
        List<Distributor> distributors = distributorRespository.findAll();
        List<Staff> staffs = staffRespository.findAll();
        Receipt Receipt = receiptTransfomer.transformToEntity(response, staffs, distributors);
        switch (checkBtn) {
            case 2:
            case 3:
                receiptRespository.save(Receipt);
                return true;
            case 4:
                receiptRespository.delete(Receipt);
                return true;
        }
        return false;
    }

    @Override
    public boolean deleteReceipt(ReceiptResponse response) {
        List<Distributor> distributors = distributorRespository.findAll();
        List<Staff> staffs = staffRespository.findAll();
        Receipt receipt = receiptTransfomer.transformToEntity(response, staffs, distributors);
        boolean checkInCus = detailInvoiceRepository.findAll().stream().anyMatch(item -> item.getReceipt().getCodeReceipt() == receipt.getCodeReceipt());
        if (checkInCus) {
            return false;
        }
        receiptRespository.delete(receipt);
        return true;
    }
    
    @Override
    public Object[] getReceiptCreated() {
        return receiptRespository
                .findAll(new Sort(Sort.Direction.DESC, "date"))
                .stream()
                .map(Receipt -> receiptTransfomer.transform(Receipt))
                .findFirst().get();
    }

    @Override
    public ReceiptResponse getReceiptResponseById(String id) {
        return receiptRespository
                .findAll()
                .stream()
                .filter(item -> item.getCodeReceipt()== Integer.valueOf(id))
                .map(Receipt -> receiptTransfomer.transformToResponse(Receipt))
                .findFirst().get();
    }
   @Override
    public List<ProcedureReportBill> getReportReceipt(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate) {
        List<Object> objects = null;
        if (StringUtils.isEmpty(startDate) && StringUtils.isEmpty(endDate)) {
            startDate = "2021-01-01";
            objects = receiptRespository.getReport(ReceiptCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(LocalDate.now()));
        } else {
            objects = receiptRespository.getReport(ReceiptCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(endDate));
        }
        List<ProcedureReportBill> earnByTimes = new ArrayList<>();
        for (int i = 0; i < objects.size(); i++) {
            earnByTimes.add(new ProcedureReportBill((Object[]) objects.get(i)));
        }
        return earnByTimes;
    }

    @Override
    public String getReportReceiptQtty(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate) {
        List<Object> objects = null;
        ProcedureResponseBigInteger responseBigInteger = null;
        if (StringUtils.isEmpty(startDate) && StringUtils.isEmpty(endDate)) {
            startDate = "2021-01-01";
            objects = receiptRespository.getReportCount(ReceiptCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(LocalDate.now()));
        } else {
            objects = receiptRespository.getReportCount(ReceiptCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(endDate));
        }

        for (int i = 0; i < objects.size(); i++) {
            responseBigInteger = new ProcedureResponseBigInteger((BigInteger) objects.get(i));
        }
        return responseBigInteger.getValueInteger();
    }

    @Override
    public String getReportReceiptSum(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate) {
        List<Object> objects = null;
        ProcedureResponseBigDecimal responseBigInteger = null;
        if (StringUtils.isEmpty(startDate) && StringUtils.isEmpty(endDate)) {
            startDate = "2021-01-01";
            objects = receiptRespository.getReportSum(ReceiptCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(LocalDate.now()));
        } else {
            objects = receiptRespository.getReportSum(ReceiptCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(endDate));
        }
        for (int i = 0; i < objects.size(); i++) {
            responseBigInteger = new ProcedureResponseBigDecimal((BigDecimal) objects.get(i));
        }
        return responseBigInteger.getValueConcurrent();
    }

    @Override
    public List<Object[]> getReportReceiptObject(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate) {
       List<Object> objects = null;
        if (StringUtils.isEmpty(startDate) && StringUtils.isEmpty(endDate)) {
            startDate = "2021-01-01";
            objects = receiptRespository.getReport(ReceiptCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(LocalDate.now()));
        } else {
            objects = receiptRespository.getReport(ReceiptCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(endDate));
        }
        List<Object[]> earnByTimes = new ArrayList<>();
        for (int i = 0; i < objects.size(); i++) {
            earnByTimes.add((Object[]) objects.get(i));
        }
        return earnByTimes;
    }

    @Override
    public void writerReport(String ReceiptCode, String nameCus, String nameStaff, String startDate, String endDate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
