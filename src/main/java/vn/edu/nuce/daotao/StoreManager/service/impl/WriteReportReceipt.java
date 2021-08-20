/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.service.impl;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import lombok.extern.log4j.Log4j2;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.BuiltinFormats;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureReportBill;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;

@Log4j2
public class WriteReportReceipt {

    public static final int COLUMN_INDEX_ID = 0;
    public static final int COLUMN_INDEX_DISTRIBUTORCODE = 1;
    public static final int COLUMN_INDEX_DISTRIBUTOR_NAME = 2;
    public static final int COLUMN_INDEX_TIME = 3;
    public static final int COLUMN_INDEX_AMOUNT = 4;
    public static final int COLUMN_INDEX_STAFF = 5;
    public static final int COLUMN_INDEX_DESCRIPTION = 6;
    private static CellStyle cellStyleFormatNumber = null;

    public static CodeSystem writeExcel(List<ProcedureReportBill> procedureReportBills, String excelFilePath) {
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HHmmss");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            String filed = excelFilePath+dtf.format(now)+".xlsx";
            Workbook workbook = getWorkbook(filed);
            Sheet sheet = workbook.createSheet("Receipt");
            int rowIndex = 0;
            writeHeader(sheet, rowIndex);
            rowIndex++;
            for (ProcedureReportBill book : procedureReportBills) {
                Row row = sheet.createRow(rowIndex);
                writeBook(book, row);
                rowIndex++;
            }
            int numberOfColumn = sheet.getRow(0).getPhysicalNumberOfCells();
            autosizeColumn(sheet, numberOfColumn);
//            System.out.println("FIELD: " + excelFilePath+dtf.format(now)+".xlsx");
            createOutputFile(workbook, filed);
            cellStyleFormatNumber = null;
            return CodeSystem.SUCCESS05;
        } catch (IOException exception) {
            log.error("Có lỗi xảy ra " + exception.getMessage());
            return CodeSystem.ERROR21;
        }
    }

    private static Workbook getWorkbook(String excelFilePath) throws IOException {
        Workbook workbook = null;

        if (excelFilePath.endsWith("xlsx")) {
            workbook = new XSSFWorkbook();
        } else if (excelFilePath.endsWith("xls")) {
            workbook = new HSSFWorkbook();
        } else {
            throw new IllegalArgumentException("The specified file is not Excel file");
        }

        return workbook;
    }

    private static void writeHeader(Sheet sheet, int rowIndex) {
        CellStyle cellStyle = createStyleForHeader(sheet);
        Row row = sheet.createRow(rowIndex);

        Cell cell = row.createCell(COLUMN_INDEX_ID);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Mã phiếu nhập");

        cell = row.createCell(COLUMN_INDEX_DISTRIBUTORCODE);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Mã nhà phân phối");

        cell = row.createCell(COLUMN_INDEX_DISTRIBUTOR_NAME);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Tên nhà phân phối");

        cell = row.createCell(COLUMN_INDEX_TIME);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Thời gian");

        cell = row.createCell(COLUMN_INDEX_AMOUNT);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Tổng tiền");

        cell = row.createCell(COLUMN_INDEX_STAFF);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Nhân viên");

        cell = row.createCell(COLUMN_INDEX_DESCRIPTION);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Mô tả");
    }

    private static void writeBook(ProcedureReportBill reportBill, Row row) {
        if (cellStyleFormatNumber == null) {
            short format = (short) BuiltinFormats.getBuiltinFormat("#,##0");
            Workbook workbook = row.getSheet().getWorkbook();
            cellStyleFormatNumber = workbook.createCellStyle();
            cellStyleFormatNumber.setDataFormat(format);
        }

        Cell cell = row.createCell(COLUMN_INDEX_ID);
        cell.setCellValue(reportBill.getBillCode());

        cell = row.createCell(COLUMN_INDEX_DISTRIBUTORCODE);
        cell.setCellValue(reportBill.getCustomerCode());

        cell = row.createCell(COLUMN_INDEX_DISTRIBUTOR_NAME);
        cell.setCellValue(reportBill.getCustomerName());

        cell = row.createCell(COLUMN_INDEX_TIME);
        cell.setCellValue(reportBill.getDate().toString());

        cell = row.createCell(COLUMN_INDEX_AMOUNT);
        cell.setCellValue(Double.valueOf(reportBill.getAmount().toString()));
        cell.setCellStyle(cellStyleFormatNumber);

        cell = row.createCell(COLUMN_INDEX_STAFF);
        cell.setCellValue(reportBill.getStaffName());

        cell = row.createCell(COLUMN_INDEX_DESCRIPTION);
        cell.setCellValue(reportBill.getDescription());
    }

    private static CellStyle createStyleForHeader(Sheet sheet) {
        Font font = sheet.getWorkbook().createFont();
        font.setFontName("Times New Roman");
        font.setBold(true);
        font.setFontHeightInPoints((short) 14);
        font.setColor(IndexedColors.WHITE.getIndex());

        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
        cellStyle.setFont(font);
        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        cellStyle.setBorderBottom(BorderStyle.THIN);
        return cellStyle;
    }

    private static void autosizeColumn(Sheet sheet, int lastColumn) {
        for (int columnIndex = 0; columnIndex < lastColumn; columnIndex++) {
            sheet.autoSizeColumn(columnIndex);
        }
    }

    private static void createOutputFile(Workbook workbook, String excelFilePath) throws IOException {
        try (OutputStream os = new FileOutputStream(excelFilePath)) {
            workbook.write(os);
        }
    }

}
