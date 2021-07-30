/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.view.jpanel;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Anh
 */
public interface CommonJpanel {

    void initData();

    default void setButtonsEnable(JButton btnUpdate, boolean valueU,
            JButton btnAdd, boolean valueA,
            JButton btnEdit, boolean valueE,
            JButton btnDelete, boolean valueD,
            JButton btnCancel, boolean valueC) {
        btnUpdate.setEnabled(valueU);
        btnAdd.setEnabled(valueA);
        btnEdit.setEnabled(valueE);
        btnDelete.setEnabled(valueD);
        btnCancel.setEnabled(valueC);
    }

    default void setErrorMsg(String text) {
        JOptionPane optionPane = new JOptionPane(text, JOptionPane.ERROR_MESSAGE);
        JDialog dialog = optionPane.createDialog("Error!");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
}
