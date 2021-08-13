/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.controller;

import java.util.List;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureResponseEarnByTime;

/**
 *
 * @author Anh
 */
public interface ProcedureController {

    String sumDCashInMounth();

    String countBillInMount();

    String countProductInMount();

    String countReceiptInMount();

    List<ProcedureResponseEarnByTime> turnoverByTime();

}
