/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import vn.edu.nuce.daotao.StoreManager.view.jpanel.BillJpanel;
import vn.edu.nuce.daotao.StoreManager.view.jpanel.CustomerJpanel;
import vn.edu.nuce.daotao.StoreManager.view.jpanel.DistributorJpanel;
import vn.edu.nuce.daotao.StoreManager.view.jpanel.LangueJpanel;
import vn.edu.nuce.daotao.StoreManager.view.jpanel.ProductJpanel;
import vn.edu.nuce.daotao.StoreManager.view.jpanel.StaffJpanel;

/**
 *
 * @author Trieu Anh
 */
@Component
public class MainFrame extends javax.swing.JFrame {

    static ConfigurableApplicationContext applicationContext;

    public static void thongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao, tieuDeThongBao, icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btSanpham = new javax.swing.JButton();
        btHoaDon = new javax.swing.JButton();
        btKhachhang = new javax.swing.JButton();
        btNhanvien = new javax.swing.JButton();
        btDoitac = new javax.swing.JButton();
        btDoanhthu = new javax.swing.JButton();
        btTTCH = new javax.swing.JButton();
        btDangxuat = new javax.swing.JButton();
        btNgonNgu = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manager Store");

        btSanpham.setBackground(new java.awt.Color(255, 255, 204));
        btSanpham.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSanpham.setForeground(new java.awt.Color(51, 51, 255));
        btSanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sanpham.png"))); // NOI18N
        btSanpham.setText("SẢN PHẨM");
        btSanpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSanphamActionPerformed(evt);
            }
        });

        btHoaDon.setBackground(new java.awt.Color(255, 255, 204));
        btHoaDon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btHoaDon.setForeground(new java.awt.Color(51, 51, 255));
        btHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hoadon.png"))); // NOI18N
        btHoaDon.setText("HOÁ ĐƠN");
        btHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHoaDonActionPerformed(evt);
            }
        });

        btKhachhang.setBackground(new java.awt.Color(255, 255, 204));
        btKhachhang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btKhachhang.setForeground(new java.awt.Color(51, 51, 255));
        btKhachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/khachhang.png"))); // NOI18N
        btKhachhang.setText("KHÁCH HÀNG");
        btKhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKhachhangActionPerformed(evt);
            }
        });

        btNhanvien.setBackground(new java.awt.Color(255, 255, 204));
        btNhanvien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btNhanvien.setForeground(new java.awt.Color(51, 51, 255));
        btNhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/nhanvien.png"))); // NOI18N
        btNhanvien.setText("NHÂN VIÊN");
        btNhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNhanvienActionPerformed(evt);
            }
        });

        btDoitac.setBackground(new java.awt.Color(255, 255, 204));
        btDoitac.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btDoitac.setForeground(new java.awt.Color(51, 51, 255));
        btDoitac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doitac.png"))); // NOI18N
        btDoitac.setText("ĐỐI TÁC");
        btDoitac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoitacActionPerformed(evt);
            }
        });

        btDoanhthu.setBackground(new java.awt.Color(255, 255, 204));
        btDoanhthu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btDoanhthu.setForeground(new java.awt.Color(51, 51, 255));
        btDoanhthu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/doanhthu.png"))); // NOI18N
        btDoanhthu.setText("DOANH THU");
        btDoanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDoanhthuActionPerformed(evt);
            }
        });

        btTTCH.setBackground(new java.awt.Color(255, 255, 204));
        btTTCH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btTTCH.setForeground(new java.awt.Color(51, 51, 255));
        btTTCH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thongtin.png"))); // NOI18N
        btTTCH.setText("THÔNG TIN CỬA HÀNG");
        btTTCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTTCHActionPerformed(evt);
            }
        });

        btDangxuat.setBackground(new java.awt.Color(255, 255, 204));
        btDangxuat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btDangxuat.setForeground(new java.awt.Color(51, 51, 255));
        btDangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dangxuat.png"))); // NOI18N
        btDangxuat.setText("ĐĂNG XUẤT");
        btDangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangxuatActionPerformed(evt);
            }
        });

        btNgonNgu.setBackground(new java.awt.Color(255, 255, 204));
        btNgonNgu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btNgonNgu.setForeground(new java.awt.Color(51, 51, 255));
        btNgonNgu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/language.png"))); // NOI18N
        btNgonNgu.setText("NGÔN NGỮ");
        btNgonNgu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNgonNguActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btSanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btNhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btKhachhang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btDoanhthu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btDoitac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btTTCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btDangxuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btNgonNgu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSanpham)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btKhachhang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNhanvien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDoitac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDoanhthu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btDangxuat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btTTCH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btNgonNgu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        mainPanel.setPreferredSize(new java.awt.Dimension(903, 475));
        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user-male-edit-icon.png"))); // NOI18N
        jLabel7.setText("chưa có gì");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        mainPanel.add(jLabel7, "card6");
        jLabel7.getAccessibleContext().setAccessibleName("dfgdfgdf");

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTTCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTTCHActionPerformed
//        jpanel.thongtin b = new thongtin();
//        mainPanel.removeAll();
//        mainPanel.add(b);
//        mainPanel.repaint();
//        mainPanel.revalidate();
    }//GEN-LAST:event_btTTCHActionPerformed

    private void btHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHoaDonActionPerformed
        BillJpanel billJpanel = applicationContext.getBean(BillJpanel.class);
        billJpanel.init();
        setValueToMainFrame(billJpanel);
    }//GEN-LAST:event_btHoaDonActionPerformed

    private void btSanphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSanphamActionPerformed
        ProductJpanel productJpanel = applicationContext.getBean(ProductJpanel.class);
        productJpanel.init();
        setValueToMainFrame(productJpanel);
    }//GEN-LAST:event_btSanphamActionPerformed

    private void btKhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKhachhangActionPerformed
        CustomerJpanel customerJpanel = applicationContext.getBean(CustomerJpanel.class);
        customerJpanel.init();
        setValueToMainFrame(customerJpanel);
    }//GEN-LAST:event_btKhachhangActionPerformed

    private void btNhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNhanvienActionPerformed
        StaffJpanel staffJpanel = applicationContext.getBean(StaffJpanel.class);
        staffJpanel.init();
        setValueToMainFrame(staffJpanel);
    }//GEN-LAST:event_btNhanvienActionPerformed

    private void btDoitacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoitacActionPerformed
        DistributorJpanel distributorJpanel = applicationContext.getBean(DistributorJpanel.class);
        distributorJpanel.init();
        setValueToMainFrame(distributorJpanel);
    }//GEN-LAST:event_btDoitacActionPerformed

    private void btDoanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDoanhthuActionPerformed
//        jpanel.doanhthu b = new doanhthu();
//        mainPanel.removeAll();
//        mainPanel.add(b);
//        mainPanel.repaint();
//        mainPanel.revalidate();
    }//GEN-LAST:event_btDoanhthuActionPerformed

    private void btDangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangxuatActionPerformed
        // TODO add your handling code here:
//        MainFrame mf = new MainFrame();
//          mf.removeAll();
//          mf.dispose();
//          Frame.DangNhap b = new DangNhap();
//          b.show();      
    }//GEN-LAST:event_btDangxuatActionPerformed

    private void btNgonNguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNgonNguActionPerformed
        LangueJpanel jpanel = new LangueJpanel();
        setValueToMainFrame(jpanel);
    }//GEN-LAST:event_btNgonNguActionPerformed

    public void init() {
        applicationContext = Application.applicationContext;
        initComponents();
        java.awt.EventQueue.invokeLater(() -> {
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.setVisible(true);
        });

    }

    private void setValueToMainFrame(JPanel panel) {
        mainPanel.removeAll();
        mainPanel.add(panel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    public JButton getBtDangxuat() {
        return btDangxuat;
    }

    public void setBtDangxuat(JButton btDangxuat) {
        this.btDangxuat = btDangxuat;
    }

    public JButton getBtDoanhthu() {
        return btDoanhthu;
    }

    public void setBtDoanhthu(JButton btDoanhthu) {
        this.btDoanhthu = btDoanhthu;
    }

    public JButton getBtDoitac() {
        return btDoitac;
    }

    public void setBtDoitac(JButton btDoitac) {
        this.btDoitac = btDoitac;
    }

    public JButton getBtHoaDon() {
        return btHoaDon;
    }

    public void setBtHoaDon(JButton btHoaDon) {
        this.btHoaDon = btHoaDon;
    }

    public JButton getBtKhachhang() {
        return btKhachhang;
    }

    public void setBtKhachhang(JButton btKhachhang) {
        this.btKhachhang = btKhachhang;
    }

    public JButton getBtNgonNgu() {
        return btNgonNgu;
    }

    public void setBtNgonNgu(JButton btNgonNgu) {
        this.btNgonNgu = btNgonNgu;
    }

    public JButton getBtNhanvien() {
        return btNhanvien;
    }

    public void setBtNhanvien(JButton btNhanvien) {
        this.btNhanvien = btNhanvien;
    }

    public JButton getBtSanpham() {
        return btSanpham;
    }

    public void setBtSanpham(JButton btSanpham) {
        this.btSanpham = btSanpham;
    }

    public JButton getBtTTCH() {
        return btTTCH;
    }

    public void setBtTTCH(JButton btTTCH) {
        this.btTTCH = btTTCH;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDangxuat;
    private javax.swing.JButton btDoanhthu;
    private javax.swing.JButton btDoitac;
    private javax.swing.JButton btHoaDon;
    private javax.swing.JButton btKhachhang;
    private javax.swing.JButton btNgonNgu;
    private javax.swing.JButton btNhanvien;
    private javax.swing.JButton btSanpham;
    private javax.swing.JButton btTTCH;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables

}
