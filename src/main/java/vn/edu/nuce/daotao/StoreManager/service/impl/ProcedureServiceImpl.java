/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureResponseBigDecimal;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureResponseBigInteger;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureResponseEarnByTime;
import vn.edu.nuce.daotao.StoreManager.respository.Procedure;
import vn.edu.nuce.daotao.StoreManager.service.ProcedureService;

/**
 *
 * @author Anh
 */
@Service
public class ProcedureServiceImpl implements ProcedureService {

    @Autowired
    private Procedure procedure;

    @Override
    public String sumDCashInMounth() {
        List<Object> objects = procedure.sumDCashInMounth();
        ProcedureResponseBigDecimal commonProcedureResponse = null;
        for (int i = 0; i < objects.size(); i++) {
            commonProcedureResponse = new ProcedureResponseBigDecimal((BigDecimal) objects.get(i));
        }
        return commonProcedureResponse.getValueConcurrent();
    }

    @Override
    public String countBillInMount() {
        List<Object> objects = procedure.countBillInMount();
        ProcedureResponseBigInteger responseBigInteger = null;
        for (int i = 0; i < objects.size(); i++) {
            responseBigInteger = new ProcedureResponseBigInteger((BigInteger) objects.get(i));
        }
        return responseBigInteger.getValueInteger();
    }

    @Override
    public String countProductInMount() {
        List<Object> objects = procedure.countProductInMount();
        ProcedureResponseBigDecimal commonProcedureResponse = null;
        for (int i = 0; i < objects.size(); i++) {
            commonProcedureResponse = new ProcedureResponseBigDecimal((BigDecimal) objects.get(i));
        }
        return commonProcedureResponse.getValueInteger();
    }

    @Override
    public String countReceiptInMount() {
        List<Object> objects = procedure.countReceiptInMount();
        ProcedureResponseBigInteger responseBigInteger = null;
        for (int i = 0; i < objects.size(); i++) {
            responseBigInteger = new ProcedureResponseBigInteger((BigInteger) objects.get(i));
        }
        return responseBigInteger.getValueInteger();
    }

    @Override
    public List<ProcedureResponseEarnByTime> turnoverByTime() {
        List<Object> objects = procedure.turnoverByTime();
        List<ProcedureResponseEarnByTime> earnByTimes = new ArrayList<>();
        for (int i = 0; i < objects.size(); i++) {
            earnByTimes.add(new ProcedureResponseEarnByTime((Object[]) objects.get(i)));
        }
        return earnByTimes;
    }

}
