/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING;

import DAO.ChiTietHoaDonDAO;
import DAO.DichVuDAO;
import DAO.HoaDonDAO;
import HELPER.DateHelper;
import HELPER.DialogHelper;
import HELPER.ShareHelper;
import MODEL.ChiTietHoaDon;
import MODEL.DichVu;
import MODEL.HoaDon;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DuongNVPH
 */
public class QuanLyHoaDonPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyHoaDonPanel
     */
    public QuanLyHoaDonPanel() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSachHoaDon = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnTaoMoi = new javax.swing.JButton();
        btnTaoHoaDon = new javax.swing.JButton();
        btnXemChiTietHoaDon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JTextField();
        txtMaKhachHang = new javax.swing.JTextField();
        txtNguoiTao = new javax.swing.JTextField();
        dcNgayLap = new com.toedter.calendar.JDateChooser();
        dcNgayThanhToan = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachDichVu = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMaHoaDon2 = new javax.swing.JTextField();
        txtGiamGia = new javax.swing.JTextField();
        txtThanhTien = new javax.swing.JTextField();
        txtDichVu = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn5 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn20 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTienKhachDua = new javax.swing.JTextField();
        txtThanhTien2 = new javax.swing.JTextField();
        txtTienThoiLai = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTienGiam = new javax.swing.JTextField();
        txtTongTien = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtMaDichVu = new javax.swing.JTextField();
        txtTienKhachThieu = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDanhSachHoaDon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblDanhSachHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Ngày lập hóa đơn", "Ngày thanh toán", "Mã khách hàng", "Người tạo", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDanhSachHoaDon);
        if (tblDanhSachHoaDon.getColumnModel().getColumnCount() > 0) {
            tblDanhSachHoaDon.getColumnModel().getColumn(0).setResizable(false);
            tblDanhSachHoaDon.getColumnModel().getColumn(1).setResizable(false);
            tblDanhSachHoaDon.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 1040, 340));

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        btnTaoMoi.setText("TẠO MỚI");
        btnTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnTaoMoi);

        btnTaoHoaDon.setText("TẠO HÓA ĐƠN");
        btnTaoHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoHoaDonActionPerformed(evt);
            }
        });
        jPanel1.add(btnTaoHoaDon);

        btnXemChiTietHoaDon.setText("Xem chi tiết hóa đơn");
        btnXemChiTietHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemChiTietHoaDonActionPerformed(evt);
            }
        });
        jPanel1.add(btnXemChiTietHoaDon);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 300, 140));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("TÌM KIẾM MÃ KHÁCH HÀNG :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });
        add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 380, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Mã hóa đơn :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Ngày lập :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Ngày thanh toán :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Mã khách hàng :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Người tạo :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 30));
        add(txtMaHoaDon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, 30));
        add(txtMaKhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 120, 30));
        add(txtNguoiTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 120, 30));
        add(dcNgayLap, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 160, 40));
        add(dcNgayThanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 160, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Danh Sách Dịch Vụ");

        tblDanhSachDichVu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tblDanhSachDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Giá tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachDichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachDichVuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSachDichVu);
        if (tblDanhSachDichVu.getColumnModel().getColumnCount() > 0) {
            tblDanhSachDichVu.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 150, 300, 170));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Chi Tiết Hóa Đơn");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 11, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Mã hóa đơn:");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Giảm giá:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Thành tiền:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 143, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Dịch vụ :");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 193, -1, -1));
        jPanel4.add(txtMaHoaDon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 42, 210, 30));
        jPanel4.add(txtGiamGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 210, 30));
        jPanel4.add(txtThanhTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 210, 30));
        jPanel4.add(txtDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 210, 30));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 330, 300, 250));

        jPanel2.setLayout(new java.awt.GridLayout(2, 2));

        btn5.setText("Giảm 5%");
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5);

        btn10.setText("Giảm 10%");
        btn10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn10MouseClicked(evt);
            }
        });
        jPanel2.add(btn10);

        btn15.setText("Giảm 15%");
        btn15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn15MouseClicked(evt);
            }
        });
        jPanel2.add(btn15);

        btn20.setText("Giảm 20%");
        btn20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn20MouseClicked(evt);
            }
        });
        jPanel2.add(btn20);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 170, 140));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel13.setText("Thành tiền :");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel14.setText("Tiền khách đưa :");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel15.setText("Tiền thối lại :");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, -1));

        txtTienKhachDua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTienKhachDuaKeyReleased(evt);
            }
        });
        add(txtTienKhachDua, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, 120, 30));
        add(txtThanhTien2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 120, 120, 30));
        add(txtTienThoiLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 160, 120, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel16.setText("Tiền giảm :");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        txtTienGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienGiamActionPerformed(evt);
            }
        });
        add(txtTienGiam, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 120, 30));
        add(txtTongTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 120, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel17.setText("Tổng tiền :");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setText("Mã dịch vụ :");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));
        add(txtMaDichVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 140, 30));
        add(txtTienKhachThieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 120, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel19.setText("Tiền khách thiếu :");
        add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 210, -1, -1));

        jButton1.setText("Thanh Toán");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        fillTableHoaDon();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void tblDanhSachHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachHoaDonMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() ==2 ) {
            edit();
        }
    }//GEN-LAST:event_tblDanhSachHoaDonMouseClicked

    private void btnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoiActionPerformed
        // TODO add your handling code here:
        clearHoaDon();
        clearHoaDonChiTiet();
    }//GEN-LAST:event_btnTaoMoiActionPerformed

    private void btnXemChiTietHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemChiTietHoaDonActionPerformed
        // TODO add your handling code here:
        xemChiTietHoaDon();
    }//GEN-LAST:event_btnXemChiTietHoaDonActionPerformed

    private void btnTaoHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoHoaDonActionPerformed
        // TODO add your handling code here:
        taoHoaDon();
    }//GEN-LAST:event_btnTaoHoaDonActionPerformed
    
    private void txtTienGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienGiamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienGiamActionPerformed

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        // TODO add your handling code here:
        
        String tongTien = txtTongTien.getText();
        float tongtien = Float.parseFloat(tongTien);
        float thanhtien = tongtien * 5/100 ;
        float tiengiam = tongtien - thanhtien ;
        txtThanhTien2.setText(tiengiam+"");
        txtTienGiam.setText(thanhtien+"");
        
    }//GEN-LAST:event_btn5MouseClicked
    
    private void btn10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn10MouseClicked
        // TODO add your handling code here:
        String tongTien = txtTongTien.getText();
        float tongtien = Float.parseFloat(tongTien);
        float thanhtien = tongtien * 10/100 ;
        float tiengiam = tongtien - thanhtien ;
        txtThanhTien2.setText(tiengiam+"");
        txtTienGiam.setText(thanhtien+"");
    }//GEN-LAST:event_btn10MouseClicked

    private void btn15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn15MouseClicked
        // TODO add your handling code here:
        String tongTien = txtTongTien.getText();
        float tongtien = Float.parseFloat(tongTien);
        float thanhtien = tongtien * 15/100 ;
        float tiengiam = tongtien - thanhtien ;
        txtThanhTien2.setText(tiengiam+"");
        txtTienGiam.setText(thanhtien+"");
    }//GEN-LAST:event_btn15MouseClicked

    private void btn20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn20MouseClicked
        // TODO add your handling code here:
        String tongTien = txtTongTien.getText();
        float tongtien = Float.parseFloat(tongTien);
        float thanhtien = tongtien * 20/100 ;
        float tiengiam = tongtien - thanhtien ;
        txtThanhTien2.setText(tiengiam+"");
        txtTienGiam.setText(thanhtien+"");
    }//GEN-LAST:event_btn20MouseClicked

    private void tblDanhSachDichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachDichVuMouseClicked
        // TODO add your handling code here:
        int viTri = tblDanhSachDichVu.getSelectedRow();
        if (viTri ==-1 ) {
            return ;
        }else{
            txtTongTien.setText(tblDanhSachDichVu.getValueAt(viTri, 2).toString());
            txtMaDichVu.setText(tblDanhSachDichVu.getValueAt(viTri, 0).toString());
        }
    }//GEN-LAST:event_tblDanhSachDichVuMouseClicked

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void txtTienKhachDuaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTienKhachDuaKeyReleased
        // TODO add your handling code here:
        String tienKhachDua = txtTienKhachDua.getText();
        String thanhTien = txtThanhTien2.getText();
        float tienkhachdua = Float.parseFloat(tienKhachDua);
        float thanhtien = Float.parseFloat(thanhTien);
        float tienthoilai = (tienkhachdua-thanhtien);
        float tienkhachthieu = (thanhtien-tienkhachdua);
        if (tienthoilai > 0) {
            txtTienThoiLai.setText(tienthoilai+"");
        }else{
            txtTienThoiLai.setText("");
        }
        if(tienkhachthieu >0 ){
            txtTienKhachThieu.setText(tienkhachthieu+"");
        }else{
            txtTienKhachThieu.setText("");
        }
    }//GEN-LAST:event_txtTienKhachDuaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn20;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btnTaoHoaDon;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnXemChiTietHoaDon;
    private com.toedter.calendar.JDateChooser dcNgayLap;
    private com.toedter.calendar.JDateChooser dcNgayThanhToan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDanhSachDichVu;
    private javax.swing.JTable tblDanhSachHoaDon;
    private javax.swing.JTextField txtDichVu;
    private javax.swing.JTextField txtGiamGia;
    private javax.swing.JTextField txtMaDichVu;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtMaHoaDon2;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtNguoiTao;
    private javax.swing.JTextField txtThanhTien;
    private javax.swing.JTextField txtThanhTien2;
    private javax.swing.JTextField txtTienGiam;
    private javax.swing.JTextField txtTienKhachDua;
    private javax.swing.JTextField txtTienKhachThieu;
    private javax.swing.JTextField txtTienThoiLai;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
    int row = -1 ;
    DichVuDAO dvdao = new DichVuDAO();
    HoaDonDAO hddao = new HoaDonDAO();
    void init(){
        fillTableDichVu();
        fillTableHoaDon();
        status(true);
    }
    void fillTableDichVu(){
        DefaultTableModel dtm = (DefaultTableModel) tblDanhSachDichVu.getModel();
        dtm.setRowCount(0);
        ArrayList<DichVu> list = dvdao.selectAll();
        for (DichVu dichVu : list) {
            Object[] data = {dichVu.getMaDichVu(),dichVu.getTenDichVu(),dichVu.getGiaTien()};
            dtm.addRow(data);
        }
    }
    void fillTableHoaDon(){
        DefaultTableModel dtm = (DefaultTableModel) tblDanhSachHoaDon.getModel();
        dtm.setRowCount(0);
        String timKiem = txtTimKiem.getText();
        ArrayList<HoaDon> list = hddao.selectByKeyword(timKiem);
        for (HoaDon hoaDon : list) {
            Object[] data = {hoaDon.getMaHoaDon(),DateHelper.toString(hoaDon.getNgayLapHoaDon(), "yyyy-MM-dd hh:mm:ss"),
            DateHelper.toString(hoaDon.getNgayThanhToan(), "yyyy-MM-dd hh:mm:ss"),
            hoaDon.getMaKhachHang(),hoaDon.getMaNhanVien(),hoaDon.getTrangThai()};
            dtm.addRow(data);
        }
    }
    void status(boolean trangThai){
        txtMaHoaDon.setEnabled(trangThai);
        txtMaKhachHang.setEnabled(trangThai);
        txtNguoiTao.setEnabled(false);
        dcNgayLap.setEnabled(trangThai);
        txtNguoiTao.setText(ShareHelper.user.getMaNhanVien());
        dcNgayThanhToan.setEnabled(trangThai);
    }
    void edit(){
        DefaultTableModel dtm = (DefaultTableModel) tblDanhSachHoaDon.getModel();
        int viTri = tblDanhSachHoaDon.getSelectedRow();
        if (viTri == -1) {
            return ;
        }
        txtMaHoaDon.setText(dtm.getValueAt(viTri, 0).toString());
        dcNgayLap.setDate(DateHelper.toDate(dtm.getValueAt(viTri, 1).toString()));
        dcNgayThanhToan.setDate(DateHelper.toDate(dtm.getValueAt(viTri, 2).toString()));
        txtMaKhachHang.setText(dtm.getValueAt(viTri, 3).toString());
        txtNguoiTao.setText(dtm.getValueAt(viTri, 4).toString());
        status(false);
    }
    HoaDon getFormForHoaDon(){
        HoaDon hd = new HoaDon();
        
        if (txtMaHoaDon.getText().equals("")) {
            return null;
        }
        if (dcNgayLap.getDate().equals("")) {
            return null;
        }
        if (dcNgayThanhToan.getDate().equals("")) {
            return null;
        }
        if (txtMaKhachHang.getText().equals("")) {
            return null;
        }
        if (txtMaHoaDon.getText().equals("")) {
            return null;
        }

        hd.setMaHoaDon(txtMaHoaDon.getText());
        hd.setNgayLapHoaDon(dcNgayLap.getDate());
        hd.setNgayThanhToan(dcNgayThanhToan.getDate());
        hd.setMaKhachHang(txtMaKhachHang.getText());
        hd.setMaNhanVien(txtNguoiTao.getText());
        hd.setTrangThai(true);
        return hd ;
    }
    
    
    void setFormHoaDon(HoaDon hd){
        txtMaHoaDon.setText(hd.getMaHoaDon());
        dcNgayLap.setDate(DateHelper.now());
        dcNgayThanhToan.setDate(hd.getNgayThanhToan());
        txtMaKhachHang.setText(hd.getMaKhachHang());
        txtNguoiTao.setText(hd.getMaNhanVien());
    }
    void setFormChiTietHoaDon(ChiTietHoaDon ct){
        txtGiamGia.setText(ct.getGiamGia()+"");
        txtTongTien.setText(ct.getTongTien()+"");
        txtTienKhachDua.setText("");
        txtThanhTien2.setText(ct.getThanhTien()+"");
        txtTienThoiLai.setText("");
        txtTienKhachThieu.setText("");
        txtMaDichVu.setText(ct.getMaDichVu());
    }
    void clearHoaDon(){
        HoaDon hd = new HoaDon();
        setFormHoaDon(hd);
        status(true);
    }
    void clearHoaDonChiTiet(){
        ChiTietHoaDon ct = new ChiTietHoaDon();
        setFormChiTietHoaDon(ct);
        status(true);
    }
    
    ChiTietHoaDonDAO cthddao = new ChiTietHoaDonDAO();
    void xemChiTietHoaDon(){
        int viTri = tblDanhSachHoaDon.getSelectedRow();
        if (viTri ==-1) {
            return ;
        }
        ArrayList<ChiTietHoaDon> list = cthddao.xemChiTietHoaDon(tblDanhSachHoaDon.getValueAt(viTri, 0).toString());
        for (ChiTietHoaDon ct : list) {
            txtMaHoaDon2.setText(ct.getMaHoaDon());
            txtThanhTien.setText(ct.getThanhTien()+"");
            txtGiamGia.setText(ct.getGiamGia()+"");
            txtDichVu.setText(ct.getMaDichVu());
        }
    }
    ChiTietHoaDon getFormForHoaDonChiTiet(){
        ChiTietHoaDon ct = new ChiTietHoaDon();
        if (txtGiamGia.getText().equals("")) {
            return null;
        }
        if (txtTongTien.getText().equals("")) {
            return null;
        }
        if (txtThanhTien2.getText().equals("")) {
            return null;
        }
        if (txtMaHoaDon.getText().equals("")) {
            return null;
        }
        if (txtMaDichVu.getText().equals("")) {
            return null;
        }
        ct.setGiamGia(Float.parseFloat(txtGiamGia.getText()));
        ct.setTongTien(Float.parseFloat(txtTongTien.getText()));
        ct.setThanhTien(Float.parseFloat(txtThanhTien2.getText()));
        ct.setMaHoaDon(txtMaHoaDon.getText());
        ct.setMaDichVu(txtMaDichVu.getText());
        return ct ;
    }
    
    void taoHoaDon(){
        HoaDon hd = getFormForHoaDon();
        if (hd == null) {
            return ;
        }
        try {
            hddao.insert(hd);
            DialogHelper.alert(this, "Tạo hóa đơn thành công !");
            clearHoaDon();
            fillTableHoaDon();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void thanhToan(){
        
    }
}
