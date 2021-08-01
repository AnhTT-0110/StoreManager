/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.view.jpanel;

import java.util.Locale;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author Trieu Anh
 */


public class LangueJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ngonngu
     */
    public LangueJpanel() {
        initComponents();
    }

    private void changeLanguage(Locale local) {
//        MainFrame mn = new MainFrame();
//        ResourceBundle bundle = ResourceBundle.getBundle("resource/i18n", local);
//        mn.getBtHoaDon().setText(bundle.getString("hoadon"));
//        mn.getBtDangxuat().setText(bundle.getString("dangxuat"));
//        mn.getBtKhachhang().setText(bundle.getString("khachhang"));
//        mn.getBtNhanvien().setText(bundle.getString("nhanvien"));
//        mn.getBtSanpham().setText(bundle.getString("sanpham"));
//        jLabel7.setText(bundle.getString("loaive"));
//        jLabel8.setText(bundle.getString("nguoiLon"));
//        jLabel9.setText(bundle.getString("treem"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbbNN = new javax.swing.JComboBox();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ngonngu.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Chọn ngôn ngữ : ");

        cbbNN.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tiếng Việt", "Tiếng Anh", "Tiếng Trung", "Tiếng Pháp", "..." }));
        cbbNN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbNNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbbNN, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(204, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbbNNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbNNMouseClicked
        if (cbbNN.getSelectedItem().toString().compareTo("Tiếng Việt") == 0) {
            Locale vietnam = new Locale("vi", "VN");
            changeLanguage(vietnam);
        } else {
            Locale Eng = new Locale("en", "US");
            changeLanguage(Eng);
        }
    }//GEN-LAST:event_cbbNNMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbbNN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
