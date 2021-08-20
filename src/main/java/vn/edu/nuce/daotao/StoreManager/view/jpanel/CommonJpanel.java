/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.view.jpanel;

import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
    
    default void setSuccessMsg(String text) {
        JOptionPane optionPane = new JOptionPane(text, JOptionPane.INFORMATION_MESSAGE);
        JDialog dialog = optionPane.createDialog("Info");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    default void checkNumber(java.awt.event.KeyEvent evt, JTextField textField) {

        if (!validate(evt.getKeyChar())) { //get char or keytyped
            evt.consume();
        }
        if (evt.getKeyChar() == KeyEvent.VK_DECIMAL || evt.getKeyChar() == KeyEvent.VK_PERIOD) {
            String field = textField.getText();
            int index = field.indexOf(".");
            if (!(index == -1)) {
                evt.consume();
            }

        }
    }

    static boolean validate(char ch) {
        return Character.isDigit(ch)
                || ch == KeyEvent.VK_BACK_SPACE
                || ch == KeyEvent.VK_DELETE
                || ch == KeyEvent.VK_DECIMAL
                || ch == KeyEvent.VK_PERIOD;
    }
}
