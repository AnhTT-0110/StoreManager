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
import vn.edu.nuce.daotao.StoreManager.model.Bill;
import vn.edu.nuce.daotao.StoreManager.model.Customer;
import vn.edu.nuce.daotao.StoreManager.model.Staff;
import vn.edu.nuce.daotao.StoreManager.response.BillResponse;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureReportBill;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureResponseBigDecimal;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureResponseBigInteger;
import vn.edu.nuce.daotao.StoreManager.respository.BillDetailRespository;
import vn.edu.nuce.daotao.StoreManager.respository.BillRespository;
import vn.edu.nuce.daotao.StoreManager.respository.CustomerRespository;
import vn.edu.nuce.daotao.StoreManager.respository.StaffRespository;
import vn.edu.nuce.daotao.StoreManager.service.*;
import vn.edu.nuce.daotao.StoreManager.transfomer.BillTransfomer;

/**
 *
 * @author Anh
 */
@Service
public class BillServiceImpl implements BillService {

    @Autowired
    private BillRespository billRespository;

    @Autowired
    private BillTransfomer billTransfomer;

    @Autowired
    private StaffRespository staffRespository;

    @Autowired
    private CustomerRespository customerRespository;

    @Autowired
    private BillDetailRespository billDetailRespository;

    @Override
    public List<BillResponse> getAllBillResponses() {

        return null;
    }

    @Override
    public List<Object[]> getAllBillResponseObjects() {
        return billRespository
                .findAll(new Sort(Sort.Direction.DESC, "date"))
                .stream()
                .map(bill -> billTransfomer.transform(bill))
                .collect(Collectors.toList());
    }

    @Override
    public boolean updateBill(int statusBtn, BillResponse response) {
        int checkBtn = statusBtn;
        List<Customer> customers = customerRespository.findAll();
        List<Staff> staffs = staffRespository.findAll();
        Bill bill = billTransfomer.transformToEntity(response, customers, staffs);
        switch (checkBtn) {
            case 2:
            case 3:
                billRespository.save(bill);
                return true;
            case 4:
                billRespository.delete(bill);
                return true;
        }
        return false;
    }

    @Override
    public boolean deleteBill(BillResponse response) {
        List<Customer> customers = customerRespository.findAll();
        List<Staff> staffs = staffRespository.findAll();
        Bill bill = billTransfomer.transformToEntity(response, customers, staffs);
        boolean checkInCus = billDetailRespository.findAll().stream().anyMatch(item -> item.getBill().getCodeBill() == bill.getCodeBill());
        if (checkInCus) {
            return false;
        }
        billRespository.delete(bill);
        return true;
    }

    @Override
    public Object[] getBillCreated() {
        return billRespository
                .findAll(new Sort(Sort.Direction.DESC, "date"))
                .stream()
                .map(bill -> billTransfomer.transform(bill))
                .findFirst().get();
    }

    @Override
    public BillResponse getBillResponseById(String id) {
        return billRespository
                .findAll()
                .stream()
                .filter(item -> item.getCodeBill() == Integer.valueOf(id))
                .map(bill -> billTransfomer.transformToReponse(bill))
                .findFirst().get();
    }

    @Override
    public List<ProcedureReportBill> getReportBill(String billCode, String nameCus, String nameStaff, String startDate, String endDate) {
        List<Object> objects = null;
        if (StringUtils.isEmpty(startDate) && StringUtils.isEmpty(endDate)) {
            startDate = "2021-01-01";
            objects = billRespository.getReport(billCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(LocalDate.now()));
        } else {
            objects = billRespository.getReport(billCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(endDate));
        }
        List<ProcedureReportBill> earnByTimes = new ArrayList<>();
        for (int i = 0; i < objects.size(); i++) {
            earnByTimes.add(new ProcedureReportBill((Object[]) objects.get(i)));
        }
        return earnByTimes;
    }

    @Override
    public String getReportBillQtty(String billCode, String nameCus, String nameStaff, String startDate, String endDate) {
        List<Object> objects = null;
        ProcedureResponseBigInteger responseBigInteger = null;
        if (StringUtils.isEmpty(startDate) && StringUtils.isEmpty(endDate)) {
            startDate = "2021-01-01";
            objects = billRespository.getReportCount(billCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(LocalDate.now()));
        } else {
            objects = billRespository.getReportCount(billCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(endDate));
        }

        for (int i = 0; i < objects.size(); i++) {
            responseBigInteger = new ProcedureResponseBigInteger((BigInteger) objects.get(i));
        }
        return responseBigInteger.getValueInteger();
    }

    @Override
    public String getReportBillSum(String billCode, String nameCus, String nameStaff, String startDate, String endDate) {
        List<Object> objects = null;
        ProcedureResponseBigDecimal responseBigInteger = null;
        if (StringUtils.isEmpty(startDate) && StringUtils.isEmpty(endDate)) {
            startDate = "2021-01-01";
            objects = billRespository.getReportSum(billCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(LocalDate.now()));
        } else {
            objects = billRespository.getReportSum(billCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(endDate));
        }
        for (int i = 0; i < objects.size(); i++) {
            responseBigInteger = new ProcedureResponseBigDecimal((BigDecimal) objects.get(i));
        }
        return responseBigInteger.getValueConcurrent();
    }

    @Override
    public List<Object[]> getReportBillObject(String billCode, String nameCus, String nameStaff, String startDate, String endDate) {
       List<Object> objects = null;
        if (StringUtils.isEmpty(startDate) && StringUtils.isEmpty(endDate)) {
            startDate = "2021-01-01";
            objects = billRespository.getReport(billCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(LocalDate.now()));
        } else {
            objects = billRespository.getReport(billCode, nameCus, nameStaff, Date.valueOf(startDate), Date.valueOf(endDate));
        }
        List<Object[]> earnByTimes = new ArrayList<>();
        for (int i = 0; i < objects.size(); i++) {
            earnByTimes.add((Object[]) objects.get(i));
        }
        return earnByTimes;
    }

}
