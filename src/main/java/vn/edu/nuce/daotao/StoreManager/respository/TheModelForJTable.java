/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.respository;

import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

/**
 *
 * @author Anh
 */
@ToString
@Log4j2
public class TheModelForJTable extends AbstractTableModel{
    private String[] columns;
    private Object[][] rows;
    
    public TheModelForJTable(){}
    
    public TheModelForJTable(Object[][] data, String[] columnName){
        this.rows = data;
        this.columns = columnName;
    }
    
    public Class getColumnClass(int column){
        if(column == 4){
            return Icon.class;
        }
        else{
            return getValueAt(0,column).getClass();
        }
    }
    
    
    public int getRowCount() {
     return this.rows.length;
    }

    public int getColumnCount() {
     return this.columns.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
        log.info("Value At" + rowIndex +" : "+columnIndex );
        log.info("ROWS " + this );
    return this.rows[rowIndex][columnIndex];
    }
    public String getColumnName(int col){
        return this.columns[col];
    }
}
