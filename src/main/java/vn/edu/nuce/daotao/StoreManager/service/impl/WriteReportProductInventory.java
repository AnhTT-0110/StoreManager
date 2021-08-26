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
import vn.edu.nuce.daotao.StoreManager.response.procedure.ProcedureReportProductInventory;
import vn.edu.nuce.daotao.StoreManager.validator.CodeSystem;

@Log4j2
public class WriteReportProductInventory {

    public static final int COLUMN_INDEX_ID = 0;
    public static final int COLUMN_INDEX_NAME = 1;
    public static final int COLUMN_INDEX_PRICE = 2;
    public static final int COLUMN_INDEX_QUANTITY = 3;
    public static final int COLUMN_INDEX_DCASH = 4;
    private static CellStyle cellStyleFormatNumber = null;

    public static CodeSystem writeExcel(List<ProcedureReportProductInventory> reportProductInventorys, String excelFilePath) {
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HHmmss");
            LocalDateTime now = LocalDateTime.now();
            System.out.println(dtf.format(now));
            String filed = excelFilePath + dtf.format(now) + ".xlsx";
            Workbook workbook = getWorkbook(filed);
            Sheet sheet = workbook.createSheet("ProductInventory");
            int rowIndex = 0;
            writeHeader(sheet, rowIndex);
            rowIndex++;
            for (ProcedureReportProductInventory book : reportProductInventorys) {
                Row row = sheet.createRow(rowIndex);
                writeBook(book, row);
                rowIndex++;
            }
            int numberOfColumn = sheet.getRow(0).getPhysicalNumberOfCells();
            autosizeColumn(sheet, numberOfColumn);
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
        cell.setCellValue("Mã sản phẩm");

        cell = row.createCell(COLUMN_INDEX_NAME);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Tên sản phẩm");

        cell = row.createCell(COLUMN_INDEX_PRICE);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Gía");

        cell = row.createCell(COLUMN_INDEX_QUANTITY);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Số lượng");

        cell = row.createCell(COLUMN_INDEX_DCASH);
        cell.setCellStyle(cellStyle);
        cell.setCellValue("Tổng tiền");

    }

    private static void writeBook(ProcedureReportProductInventory reportProductInventory, Row row) {
        if (cellStyleFormatNumber == null) {
            short format = (short) BuiltinFormats.getBuiltinFormat("#,##0");
            Workbook workbook = row.getSheet().getWorkbook();
            cellStyleFormatNumber = workbook.createCellStyle();
            cellStyleFormatNumber.setDataFormat(format);
        }

        Cell cell = row.createCell(COLUMN_INDEX_ID);
        cell.setCellValue(reportProductInventory.getProductCode());

        cell = row.createCell(COLUMN_INDEX_NAME);
        cell.setCellValue(reportProductInventory.getProductName());

        cell = row.createCell(COLUMN_INDEX_PRICE);
        cell.setCellValue(Double.valueOf(reportProductInventory.getPrice().toString()));
        cell.setCellStyle(cellStyleFormatNumber);

        cell = row.createCell(COLUMN_INDEX_QUANTITY);
        cell.setCellValue(reportProductInventory.getQuantity());

        cell = row.createCell(COLUMN_INDEX_DCASH);
        cell.setCellValue(Double.valueOf(reportProductInventory.getTotal().toString()));
        cell.setCellStyle(cellStyleFormatNumber);

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
