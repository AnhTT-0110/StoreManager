/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import vn.edu.nuce.daotao.StoreManager.controller.ProcedureController;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureResponseEarnByTime;
import vn.edu.nuce.daotao.StoreManager.service.ProcedureService;

/**
 *
 * @author Anh
 */
@Controller
public class ProcedureControllerImpl implements ProcedureController {

    @Autowired
    private ProcedureService procedureService;

    @Override
    public String sumDCashInMounth() {
        return procedureService.sumDCashInMounth();
    }

    @Override
    public String countBillInMount() {
        return procedureService.countBillInMount();
    }

    @Override
    public String countProductInMount() {
        return procedureService.countProductInMount();
    }

    @Override
    public String countReceiptInMount() {
        return procedureService.countReceiptInMount();
    }

    @Override
    public List<ProcedureResponseEarnByTime> turnoverByTime() {
        return procedureService.turnoverByTime();
    }
    

}
