/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.nuce.daotao.StoreManager.view.jpanel;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Trieu Anh
 */
public class CustomerJpanel extends javax.swing.JPanel {

    
     Connection conn;
    PreparedStatement stmt;
    DefaultTableModel md = new DefaultTableModel();
//    ArrayList<Khachhang> arrkh = new ArrayList<>();
    
    /**
     * Creates new form khachhang
     */
    private void doDuLieuComBONV(String bang, String tencanlay, JComboBox cb) {
        String sql = "select * from " + bang;
//        ResultSet rs = Main.connect.ExcuteQueryGetTable(sql);
//        try {
//            while (rs.next()) {
//                cb.addItem(rs.getNString(tencanlay));
//            }
//        } catch (SQLException ex) {
////            Logger.getLogger(nhanvien.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
    
     public void ThongBao(String noiDungThongBao, String tieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(new JFrame(), noiDungThongBao,
                tieuDeThongBao, icon);
    }
      public void setSelectedCombobox(String cbbselected, JComboBox cbb) {
//        for (int i = 0; i < cbb.getItemCount(); i++) {
//            Object obj = cbb.getItemAt(i);
//            if (obj != null) {
////                display m = (display) obj;
//                if (cbbselected.trim().equals(m.displayMember)) {
//                    cbb.setSelectedItem(m);
//                }
//            }
//        }
    }
       public void ResKhachHang() {
        String MaKhachHang, TenKhachHang, NgaySinh, GioiTinh, DiaChi, SDT, LoaiKhachHang, ChuThich;
        text_maKH.setText("");
        text_tenKH.setText("");
        text_ngaysinh.setText("");
        text_diachi.setText("");
        text_sdt.setText("");
        cb_loaiKH.setSelectedIndex(1);
        text_ghichu.setText("");
    }
    
    public CustomerJpanel() {
        initComponents();
        layDuLieuKhachHang();
        doDuLieuComBONV("LoaiKhachHang","TenLoaiKhachHang" , cb_loaiKH);
    }
    
    public void layDuLieuKhachHang() {
//        String cautruyvan = "";
//        cautruyvan = "select * from KhachHang,LoaiKhachHang "
//                + "where KhachHang.LoaiKhachHang=LoaiKhachHang.MaLoaiKhachHang";
//        ResultSet rs = Main.connect.ExcuteQueryGetTable(cautruyvan);
//        Object[] obj = new Object[]{"STT", "Mã Khách Hàng", "Tên Khách Hàng", "Ngày Sinh", "Giới Tính", "Dịa Chỉ", "SDT", "Loại Khách Hàng", "Chú Thích"};
//        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//        tbl__khachhang.setModel(tableModel);
//        int c = 0;
//        try {
//            while (rs.next()) {
//                c++;
//                Object[] item = new Object[9];
//                item[0] = c;
//                item[1] = rs.getInt("MaKhachHang");
//                item[2] = rs.getString("TenKhachHang");
//                item[3] = rs.getString("NgaySinh");
//                if (rs.getInt("GioiTinh") == 1) {
//                    item[4] = "Nam";
//                } else {
//                    item[4] = "Nữ";
//                }
//                item[5] = rs.getString("DiaChi");
//                item[6] = rs.getString("SDT");
//                item[7] = rs.getString("TenLoaiKhachHang");
//                item[8] = rs.getString("GhiChu");
//                tableModel.addRow(item);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
    }
    
    //Kieemr tra
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel8 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        text_maKH = new javax.swing.JTextField();
        text_tenKH = new javax.swing.JTextField();
        text_ngaysinh = new javax.swing.JFormattedTextField();
        jRadioButton_nam = new javax.swing.JRadioButton();
        jRadioButton_nu = new javax.swing.JRadioButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        text_diachi = new javax.swing.JTextField();
        text_sdt = new javax.swing.JTextField();
        cb_loaiKH = new javax.swing.JComboBox();
        text_ghichu = new javax.swing.JTextField();
        jPanel36 = new javax.swing.JPanel();
        text_timkiem = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jToggleButton_resetkhachhang = new javax.swing.JToggleButton();
        jToggleButton_xoakhachhang = new javax.swing.JToggleButton();
        jToggleButton_suakhachhang = new javax.swing.JToggleButton();
        jToggleButton_themkhachhang = new javax.swing.JToggleButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl__khachhang = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel32.setBackground(new java.awt.Color(204, 204, 255));

        jPanel34.setBackground(new java.awt.Color(204, 204, 255));

        jLabel31.setText("Mã KH:");

        jLabel32.setText("Tên KH:");

        jLabel33.setText("Ngày sinh:");

        jLabel34.setText("Giới rính:");

        text_maKH.setEditable(false);
        text_maKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_maKHActionPerformed(evt);
            }
        });

        text_ngaysinh.setText(" ");

        buttonGroup1.add(jRadioButton_nam);
        jRadioButton_nam.setText("Nam");

        buttonGroup1.add(jRadioButton_nu);
        jRadioButton_nu.setText("Nữ");

        jLabel35.setText("Địa chỉ:");

        jLabel36.setText("Số điện thoại:");

        jLabel37.setText("Loại khách:");

        jLabel38.setText("Ghi chú:");

        text_diachi.setText(" ");

        text_sdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_sdtActionPerformed(evt);
            }
        });

        cb_loaiKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_loaiKHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34))
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_maKH)
                                    .addComponent(text_tenKH)))
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(text_ngaysinh)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jRadioButton_nam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton_nu)
                        .addGap(168, 168, 168)))
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(text_ghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_loaiKH, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(text_sdt)
                            .addComponent(text_diachi, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_maKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(text_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31))
                .addGap(30, 30, 30)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(text_tenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(text_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(text_ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(cb_loaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jRadioButton_nam)
                            .addComponent(jRadioButton_nu)
                            .addComponent(jLabel38)))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(text_ghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel36.setBackground(new java.awt.Color(204, 204, 255));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/timkiem.png"))); // NOI18N
        jButton14.setText("Tìm kiếm");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jButton14)
                .addContainerGap(96, Short.MAX_VALUE))
            .addComponent(text_timkiem)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(text_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        jToggleButton_resetkhachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        jToggleButton_resetkhachhang.setText("Reset");
        jToggleButton_resetkhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_resetkhachhangActionPerformed(evt);
            }
        });

        jToggleButton_xoakhachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        jToggleButton_xoakhachhang.setText("Xóa");
        jToggleButton_xoakhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_xoakhachhangActionPerformed(evt);
            }
        });

        jToggleButton_suakhachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sua.png"))); // NOI18N
        jToggleButton_suakhachhang.setText("Sửa ");
        jToggleButton_suakhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_suakhachhangActionPerformed(evt);
            }
        });

        jToggleButton_themkhachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        jToggleButton_themkhachhang.setText("Thêm ");
        jToggleButton_themkhachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton_themkhachhangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jToggleButton_themkhachhang)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton_suakhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton_xoakhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton_resetkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton_resetkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton_xoakhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton_suakhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton_themkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tbl__khachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl__khachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl__khachhangMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(tbl__khachhang);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Khách hàng");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void text_sdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_sdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_sdtActionPerformed

    private void cb_loaiKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_loaiKHActionPerformed

    }//GEN-LAST:event_cb_loaiKHActionPerformed

    private void jToggleButton_themkhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_themkhachhangActionPerformed
                                                   
//        String MaKhachHang, TenKhachHang, NgaySinh, GioiTinh, DiaChi, SDT, GhiChu;
//        MaKhachHang = text_maKH.getText();
//        TenKhachHang = text_tenKH.getText();
//        NgaySinh =  text_ngaysinh.getText();
//        if (jRadioButton_nam.isSelected()) {
//            GioiTinh = "1";
//        } else {
//            GioiTinh = "0";
//        }
//       
//       
//        DiaChi = text_diachi.getText();
//        SDT = text_sdt.getText();
//        int LoaiKhachHang = cb_loaiKH.getSelectedIndex() + 1;
//        GhiChu = text_ghichu.getText();
//        String cautruyvan = "insert into KhachHang values("
//                + " N'" + TenKhachHang + "' , '" + NgaySinh + "' ," + GioiTinh
//                + ",N'" + DiaChi + "','" + SDT + "'," + LoaiKhachHang + ", N'" + GhiChu + "')";
//      
//        if (TenKhachHang.equals("")) {
//             System.out.println("Thêm Thất Bại");
//        } else {
//          
//             Main.connect.ExcuteQueryUpdateDB(cautruyvan);
//            System.out.println("Đã Thêm Thành Công");
//              System.out.println(cautruyvan);
//
//        }
//        layDuLieuKhachHang();

                                     
    }//GEN-LAST:event_jToggleButton_themkhachhangActionPerformed

    private void jToggleButton_suakhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_suakhachhangActionPerformed
//        String MaKhachHang, TenKhachHang, NgaySinh, GioiTinh, DiaChi, SDT, GhiChu;
//        MaKhachHang = text_maKH.getText();
//        TenKhachHang = text_tenKH.getText();
//        NgaySinh = text_ngaysinh.getText();
//        if (jRadioButton_nam.isSelected()) {
//            GioiTinh = "1";
//        } else {
//            GioiTinh = "0";
//        }
//        DiaChi = text_diachi.getText();
//        SDT = text_sdt.getText();
//        int LoaiKhachHang = cb_loaiKH.getSelectedIndex() + 1;
//        GhiChu = text_ghichu.getText();
//        String cautruyvan = "update  KhachHang set "
//                + "TenKhachHang= N'" + TenKhachHang + "' , NgaySinh='" + NgaySinh + "' ,GioiTinh=" + GioiTinh
//                + ",DiaChi=N'" + DiaChi + "',SDT='" + SDT + "',LoaiKhachHang=" + LoaiKhachHang + ",GhiChu= N'" + GhiChu + "'where MaKhachHang=" + MaKhachHang;
//        System.out.println(cautruyvan);
//        
//       
//        if (TenKhachHang.equals("")) {
//             System.out.println("Thêm Thất Bại");
//        } else {
//          
//             Main.connect.ExcuteQueryUpdateDB(cautruyvan);
//            System.out.println("Đã Thêm Thành Công");
//              System.out.println(cautruyvan);
//
//        }
//        layDuLieuKhachHang();
    }//GEN-LAST:event_jToggleButton_suakhachhangActionPerformed

    private void jToggleButton_xoakhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_xoakhachhangActionPerformed
//         String MaKhachHang = text_maKH.getText();
//        if (!MaKhachHang.equals("")) {
//            String cautruyvan = "delete KhachHang where MaKhachHang=" + MaKhachHang;
//            String ctvKiemThu = "select count(MaHoaDon) as SoPhieuMua"
//                    + " from KhachHang,HoaDon where KhachHang.MaKhachHang=HoaDon.MaKhachHang"
//                    + " and  KhachHang.MaKhachHang=" + MaKhachHang;
//            ResultSet rs1 = Main.connect.ExcuteQueryGetTable(cautruyvan);
//            System.out.println(ctvKiemThu);
//            int so1 = 0;
//            try {
//                if (rs1.next()) {
//                    so1 = rs1.getInt("SoPhieuMua");
//                    if (rs1.getInt("SoPhieuMua") == 0) {
//                       Main.connect.ExcuteQueryUpdateDB(cautruyvan);
//                        System.out.println("đã xóa");
//                        layDuLieuKhachHang();
//                        ResKhachHang();
//                    } else {
//                        ThongBao("không thể xóa bởi Khách Hàng đã có " + so1 + " hóa đơn!", "báo lỗi", 2);
//                    }
//                }
//            } catch (SQLException ex) {
//                Logger.getLogger(CustomerJpanel.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//        } else {
//            ThongBao("bạn chưa nhập Mã khách hàng", "lỗi khi cố muốn xóa mà không thèm nhập mã", 2);
//        }
                                                    
    }//GEN-LAST:event_jToggleButton_xoakhachhangActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
//         String timkiem = text_timkiem.getText();
//        Object[] obj = new Object[]{"STT", "Mã Khách Hàng", "Tên Khách Hàng", "Ngày Sinh", "Giới Tính", "Dịa Chỉ", "SDT", "Loại Khách Hàng", "Chú Thích"};
//        DefaultTableModel tableModel = new DefaultTableModel(obj, 0);
//        tbl__khachhang.setModel(tableModel);
//        String sql = "select * from KhachHang,LoaiKhachHang where KhachHang.LoaiKhachHang=LoaiKhachHang.MaLoaiKhachHang and TenKhachHang  LIKE N'%" +timkiem +"%'";
//        ResultSet rs = Main.connect.ExcuteQueryGetTable(sql);
//        int c = 0;
//          try {
//            while (rs.next()) {
//                c++;
//                Object[] item = new Object[9];
//                item[0] = c;
//                item[1] = rs.getInt("MaKhachHang");
//                item[2] = rs.getString("TenKhachHang");
//                item[3] = rs.getString("NgaySinh");
//                if (rs.getInt("GioiTinh") == 1) {
//                    item[4] = "Nam";
//                } else {
//                    item[4] = "Nữ";
//                }
//                item[5] = rs.getString("DiaChi");
//                item[6] = rs.getString("SDT");
//                item[7] = rs.getString("TenLoaiKhachHang");
//                item[8] = rs.getString("GhiChu");
//                tableModel.addRow(item);
//            }
//        } catch (SQLException ex) {
//            System.out.println(ex.toString());
//        }
//        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void text_maKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_maKHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_maKHActionPerformed

    private void tbl__khachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl__khachhangMouseClicked
          int viTriDongVuaBam = tbl__khachhang.getSelectedRow();

        text_maKH.setText(tbl__khachhang.getValueAt(viTriDongVuaBam, 1).toString());
        text_tenKH.setText(tbl__khachhang.getValueAt(viTriDongVuaBam, 2).toString());
        text_diachi.setText(tbl__khachhang.getValueAt(viTriDongVuaBam, 5).toString());
        text_sdt.setText(tbl__khachhang.getValueAt(viTriDongVuaBam, 6).toString());
        text_ghichu.setText(tbl__khachhang.getValueAt(viTriDongVuaBam, 8).toString());
        
        String gioitinh = tbl__khachhang.getValueAt(viTriDongVuaBam, 4).toString();
        cb_loaiKH.setSelectedItem(tbl__khachhang.getValueAt(viTriDongVuaBam, 7).toString());
        
        text_ngaysinh.setText(tbl__khachhang.getValueAt(viTriDongVuaBam, 3).toString());
        if (gioitinh.equals("Nam")) {
            jRadioButton_nam.setSelected(true);
            jRadioButton_nu.setSelected(false);
        } else {
            jRadioButton_nam.setSelected(false);
            jRadioButton_nu.setSelected(true);
        }
        String ngaysinh = tbl__khachhang.getValueAt(viTriDongVuaBam, 3).toString();
        System.out.println("" + ngaysinh);
       
       
        
      
        text_maKH.setForeground(Color.black);
        text_tenKH.setForeground(Color.black);
        text_diachi.setForeground(Color.black);
        text_sdt.setForeground(Color.black);
    }//GEN-LAST:event_tbl__khachhangMouseClicked

    private void jToggleButton_resetkhachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton_resetkhachhangActionPerformed
        ResKhachHang();
    }//GEN-LAST:event_jToggleButton_resetkhachhangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cb_loaiKH;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton_nam;
    private javax.swing.JRadioButton jRadioButton_nu;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JToggleButton jToggleButton_resetkhachhang;
    private javax.swing.JToggleButton jToggleButton_suakhachhang;
    private javax.swing.JToggleButton jToggleButton_themkhachhang;
    private javax.swing.JToggleButton jToggleButton_xoakhachhang;
    private javax.swing.JTable tbl__khachhang;
    private javax.swing.JTextField text_diachi;
    private javax.swing.JTextField text_ghichu;
    private javax.swing.JTextField text_maKH;
    private javax.swing.JFormattedTextField text_ngaysinh;
    private javax.swing.JTextField text_sdt;
    private javax.swing.JTextField text_tenKH;
    private javax.swing.JTextField text_timkiem;
    // End of variables declaration//GEN-END:variables
}
