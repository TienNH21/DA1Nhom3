/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SWING;

import DAO.DichVuDAO;
import HELPER.DateHelper;
import HELPER.DialogHelper;
import HELPER.ShareHelper;
import MODEL.DichVu;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DuongNVPH
 */
public class MainFrame extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        lblDongHo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnHoaDon = new javax.swing.JButton();
        btnDatLich = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnDichVu = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        pnlMain = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        mnuTrangChu = new javax.swing.JMenuItem();
        mnuDangXuat = new javax.swing.JMenuItem();
        mnuDoiMatKhau = new javax.swing.JMenuItem();
        mnuKetThucChuongTrinh = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        mnuTroGiup_mniHuongDanSuDung = new javax.swing.JMenuItem();
        mnuTroGiup_mniGioiThieuSanPham = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDongHo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblDongHo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 640, 100, 30));

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btnHoaDon.setBackground(new java.awt.Color(0, 153, 153));
        btnHoaDon.setText("QUẢN LÝ HÓA ĐƠN");
        btnHoaDon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });
        jPanel3.add(btnHoaDon);

        btnDatLich.setBackground(new java.awt.Color(0, 153, 153));
        btnDatLich.setText("QUẢN LÝ ĐẶT LỊCH");
        btnDatLich.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDatLich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatLichActionPerformed(evt);
            }
        });
        jPanel3.add(btnDatLich);

        btnKhachHang.setBackground(new java.awt.Color(0, 153, 153));
        btnKhachHang.setText("QUẢN LÝ KHÁCH HÀNG");
        btnKhachHang.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });
        jPanel3.add(btnKhachHang);

        btnNhanVien.setBackground(new java.awt.Color(0, 153, 153));
        btnNhanVien.setText("QUẢN LÝ NHÂN VIÊN");
        btnNhanVien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        jPanel3.add(btnNhanVien);

        btnDichVu.setBackground(new java.awt.Color(0, 153, 153));
        btnDichVu.setText("DỊCH VỤ");
        btnDichVu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDichVuActionPerformed(evt);
            }
        });
        jPanel3.add(btnDichVu);

        btnThongKe.setBackground(new java.awt.Color(0, 153, 153));
        btnThongKe.setText("THỐNG KÊ");
        btnThongKe.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        jPanel3.add(btnThongKe);

        btnThoat.setBackground(new java.awt.Color(0, 153, 153));
        btnThoat.setText("THOÁT");
        btnThoat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel3.add(btnThoat);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 70));

        pnlMain.setLayout(new java.awt.CardLayout());
        jPanel1.add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 1340, 570));

        jMenu3.setText("Hệ thống");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        mnuTrangChu.setText("Trang Chủ");
        mnuTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTrangChuActionPerformed(evt);
            }
        });
        jMenu3.add(mnuTrangChu);

        mnuDangXuat.setText("Đăng Xuất");
        mnuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangXuatActionPerformed(evt);
            }
        });
        jMenu3.add(mnuDangXuat);

        mnuDoiMatKhau.setText("Đổi Mật Khẩu");
        mnuDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDoiMatKhauActionPerformed(evt);
            }
        });
        jMenu3.add(mnuDoiMatKhau);

        mnuKetThucChuongTrinh.setText("Kết Thúc Chương Trình");
        mnuKetThucChuongTrinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuKetThucChuongTrinhActionPerformed(evt);
            }
        });
        jMenu3.add(mnuKetThucChuongTrinh);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Quản lý");

        jMenu1.setText("jMenu1");
        jMenu4.add(jMenu1);

        jMenu2.setText("jMenu2");
        jMenu4.add(jMenu2);

        jMenuBar2.add(jMenu4);

        jMenu5.setText("Thống kê");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Trợ giúp");

        mnuTroGiup_mniHuongDanSuDung.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnuTroGiup_mniHuongDanSuDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Globe.png"))); // NOI18N
        mnuTroGiup_mniHuongDanSuDung.setText("Hướng dẫn sử dụng");
        mnuTroGiup_mniHuongDanSuDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTroGiup_mniHuongDanSuDungActionPerformed(evt);
            }
        });
        jMenu6.add(mnuTroGiup_mniHuongDanSuDung);

        mnuTroGiup_mniGioiThieuSanPham.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        mnuTroGiup_mniGioiThieuSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Home.png"))); // NOI18N
        mnuTroGiup_mniGioiThieuSanPham.setText("Giới thiệu sản phẩm");
        mnuTroGiup_mniGioiThieuSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTroGiup_mniGioiThieuSanPhamActionPerformed(evt);
            }
        });
        jMenu6.add(mnuTroGiup_mniGioiThieuSanPham);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuTroGiup_mniHuongDanSuDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTroGiup_mniHuongDanSuDungActionPerformed

    }//GEN-LAST:event_mnuTroGiup_mniHuongDanSuDungActionPerformed

    private void mnuTroGiup_mniGioiThieuSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTroGiup_mniGioiThieuSanPhamActionPerformed

    }//GEN-LAST:event_mnuTroGiup_mniGioiThieuSanPhamActionPerformed

    private void mnuDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDoiMatKhauActionPerformed
        new QuenMatKhauJDialog(this,true).setVisible(true);
    }//GEN-LAST:event_mnuDoiMatKhauActionPerformed

    private void mnuKetThucChuongTrinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuKetThucChuongTrinhActionPerformed
        // TODO add your handling code here:
        openThoat();
        
    }//GEN-LAST:event_mnuKetThucChuongTrinhActionPerformed

    private void mnuDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangXuatActionPerformed
        openDangXuat();
    }//GEN-LAST:event_mnuDangXuatActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        openQuanLyHoaDon();
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnDatLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatLichActionPerformed
        // TODO add your handling code here:
        openLichHen();
    }//GEN-LAST:event_btnDatLichActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
        openQuanLyKhachHang();
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        openQuanLyNhanVien();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDichVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDichVuActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void mnuTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTrangChuActionPerformed
        // TODO add your handling code here:
        openTrangChu();
    }//GEN-LAST:event_mnuTrangChuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatLich;
    private javax.swing.JButton btnDichVu;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JMenuItem mnuDangXuat;
    private javax.swing.JMenuItem mnuDoiMatKhau;
    private javax.swing.JMenuItem mnuKetThucChuongTrinh;
    private javax.swing.JMenuItem mnuTrangChu;
    private javax.swing.JMenuItem mnuTroGiup_mniGioiThieuSanPham;
    private javax.swing.JMenuItem mnuTroGiup_mniHuongDanSuDung;
    private javax.swing.JPanel pnlMain;
    // End of variables declaration//GEN-END:variables
    DichVuDAO dvdao = new DichVuDAO();
    
    void init(){
        setLocationRelativeTo(null);
        Thread t = new Thread(this);
        t.start();
        openManHinhChaoJDialog();
        openLogin();
        if (ShareHelper.isManager()){
            btnNhanVien.setEnabled(true);
            btnThongKe.setEnabled(true);
        }else{
            btnNhanVien.setEnabled(false);
            btnThongKe.setEnabled(false);
        }
        openTrangChu();
    }
    void openTrangChu(){
        TrangChuPanel trangChu = new TrangChuPanel();
        pnlMain.add(trangChu,"TrangChu");
        CardLayout car = (CardLayout) pnlMain.getLayout();
        car.show(pnlMain, "TrangChu");
    }
    
    void openLogin(){
        if (ShareHelper.isLogin()) {
            this.setVisible(true);
        }else{
            new DangNhapJDialog(this, true).setVisible(true);
        }
    }
    void openDangXuat(){if (DialogHelper.confirm(this, "Bạn có muốn đăng xuất không?")) {
            ShareHelper.clear();
            this.dispose();
        new DangNhapJDialog(this, true).setVisible(true);
    }}
    
    void openQuanLyHoaDon(){
        QuanLyHoaDonPanel qlhd = new QuanLyHoaDonPanel();
        pnlMain.add(qlhd,"QuanLyHoaDon");
        CardLayout car = (CardLayout) pnlMain.getLayout();
        car.show(pnlMain, "QuanLyHoaDon");
    }
    void openLichHen(){
        QuanLyLichDatPanel lichDat = new QuanLyLichDatPanel();
        pnlMain.add(lichDat,"LichDat");
        CardLayout car = (CardLayout) pnlMain.getLayout();
        car.show(pnlMain, "LichDat");
    }
    
    void openQuanLyKhachHang(){
        QuanLyKhachHangPanel khachHang = new QuanLyKhachHangPanel();
        pnlMain.add(khachHang,"KhachHang");
        CardLayout car = (CardLayout) pnlMain.getLayout();
        car.show(pnlMain, "KhachHang");
    }
    void openQuanLyNhanVien(){
        QuanLyNhanVienPanel nhanVien = new QuanLyNhanVienPanel();
        pnlMain.add(nhanVien,"NhanVien");
        CardLayout car = (CardLayout) pnlMain.getLayout();
        car.show(pnlMain, "NhanVien");
    }
    void openThoat(){
        if (DialogHelper.confirm(this, "Bạn có muốn thoát chương trình ?")) {
            System.exit(0);
        }
    }
    void openManHinhChaoJDialog(){
        new ManHinhChaoJDialog(this, true).setVisible(true);
    }
    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
        while (true) {            
            lblDongHo.setText(sdf.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    
    }
   
