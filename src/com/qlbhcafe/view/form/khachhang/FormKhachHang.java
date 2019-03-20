/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbhcafe.view.form.khachhang;

import com.qlbhcafe.view.form.login.FormLogin;
import com.qlbhcafe.view.Run;
import com.qlbhcafe.view.form.menu.FormMenu;
import static com.qlbhcafe.view.form.menu.FormMenu.jfMain;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;

/**
 *
 * @author baotri1998
 */
public class FormKhachHang extends javax.swing.JPanel {

    /**
     * Creates new form FormLogin
     */
    public static FormKhachHang login;

    public FormKhachHang() {
        initComponents();
        // jpnLogin1.setBackground(new Color(0, 0, 0, 134));
        //jpnNenButton_login1.setBackground(new Color(0, 0, 0, 64));
        login = this;
        tblKhachHang.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 13));
        tblKhachHang.setFont(new Font("Tohoma", Font.PLAIN, 12));
        tblKhachHang.getTableHeader().setOpaque(false);
        tblKhachHang.getTableHeader().setBackground(new Color(0, 0, 0));
        tblKhachHang.getTableHeader().setForeground(new Color(255, 255, 255));
        tblKhachHang.setRowHeight(25);

        jpnBack_button.hide();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfKhachHang = new javax.swing.JPanel();
        jpnShowMenuOut = new javax.swing.JPanel();
        jpnQuayVe = new javax.swing.JPanel();
        lblQuayVeBangHang = new javax.swing.JLabel();
        jpnTenDangNhap = new javax.swing.JPanel();
        lblTenDangNhapBangHang = new javax.swing.JLabel();
        jpnDangXuat = new javax.swing.JPanel();
        lblDangXuatBangHang = new javax.swing.JLabel();
        jpnToolbar19 = new javax.swing.JPanel();
        lblAn_BanHang = new javax.swing.JLabel();
        lblOutBangHang = new javax.swing.JLabel();
        jpnBack_button = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();
        jpnGiaoDien = new javax.swing.JPanel();
        jpnDangKyHV_Buuton = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnKHOnline_Button = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jpnHV_button = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jpnTimKiem = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jpnBack_TableChinh_Button = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        CardLayout = new javax.swing.JPanel();
        jscDanhSachKH = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        jpnHV_button1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jpnDangKyForm = new javax.swing.JPanel();
        lblFormDangKy = new javax.swing.JLabel();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jfKhachHang.setBackground(new java.awt.Color(255, 255, 255));
        jfKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jfKhachHang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnShowMenuOut.setBackground(new java.awt.Color(255, 255, 255));
        jpnShowMenuOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jpnShowMenuOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpnShowMenuOutMouseExited(evt);
            }
        });
        jpnShowMenuOut.setLayout(null);

        jpnQuayVe.setBackground(new java.awt.Color(255, 255, 255));

        lblQuayVeBangHang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblQuayVeBangHang.setForeground(new java.awt.Color(51, 102, 255));
        lblQuayVeBangHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuayVeBangHang.setText("Quay Về");
        lblQuayVeBangHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblQuayVeBangHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblQuayVeBangHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblQuayVeBangHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblQuayVeBangHangMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpnQuayVeLayout = new javax.swing.GroupLayout(jpnQuayVe);
        jpnQuayVe.setLayout(jpnQuayVeLayout);
        jpnQuayVeLayout.setHorizontalGroup(
            jpnQuayVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQuayVeBangHang, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jpnQuayVeLayout.setVerticalGroup(
            jpnQuayVeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQuayVeBangHang, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpnShowMenuOut.add(jpnQuayVe);
        jpnQuayVe.setBounds(10, 90, 150, 40);

        jpnTenDangNhap.setBackground(new java.awt.Color(255, 255, 255));

        lblTenDangNhapBangHang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTenDangNhapBangHang.setForeground(new java.awt.Color(51, 102, 255));
        lblTenDangNhapBangHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTenDangNhapBangHang.setText("Tên NV");
        lblTenDangNhapBangHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblTenDangNhapBangHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTenDangNhapBangHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTenDangNhapBangHangMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpnTenDangNhapLayout = new javax.swing.GroupLayout(jpnTenDangNhap);
        jpnTenDangNhap.setLayout(jpnTenDangNhapLayout);
        jpnTenDangNhapLayout.setHorizontalGroup(
            jpnTenDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTenDangNhapBangHang, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jpnTenDangNhapLayout.setVerticalGroup(
            jpnTenDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTenDangNhapBangHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpnShowMenuOut.add(jpnTenDangNhap);
        jpnTenDangNhap.setBounds(10, 9, 150, 40);

        jpnDangXuat.setBackground(new java.awt.Color(255, 255, 255));

        lblDangXuatBangHang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDangXuatBangHang.setForeground(new java.awt.Color(51, 102, 255));
        lblDangXuatBangHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDangXuatBangHang.setText("Đăng Xuất");
        lblDangXuatBangHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDangXuatBangHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangXuatBangHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDangXuatBangHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDangXuatBangHangMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpnDangXuatLayout = new javax.swing.GroupLayout(jpnDangXuat);
        jpnDangXuat.setLayout(jpnDangXuatLayout);
        jpnDangXuatLayout.setHorizontalGroup(
            jpnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDangXuatBangHang, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jpnDangXuatLayout.setVerticalGroup(
            jpnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDangXuatBangHang, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpnShowMenuOut.add(jpnDangXuat);
        jpnDangXuat.setBounds(10, 50, 150, 40);

        jfKhachHang.add(jpnShowMenuOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 170, 140));
        jpnShowMenuOut.hide();

        jpnToolbar19.setBackground(new java.awt.Color(255, 255, 255));
        jpnToolbar19.setOpaque(false);

        lblAn_BanHang.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lblAn_BanHang.setForeground(new java.awt.Color(255, 255, 255));
        lblAn_BanHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAn_BanHang.setText("-");
        lblAn_BanHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAn_BanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAn_BanHangMouseClicked(evt);
            }
        });

        lblOutBangHang.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblOutBangHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOutBangHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbhcafe/img/logout.png"))); // NOI18N
        lblOutBangHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOutBangHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOutBangHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOutBangHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOutBangHangMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblOutBangHangMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblOutBangHangMouseReleased(evt);
            }
        });

        jpnBack_button.setBackground(new java.awt.Color(51, 51, 255));

        lblBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBack.setForeground(new java.awt.Color(255, 255, 255));
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setText("Back");
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnBack_buttonLayout = new javax.swing.GroupLayout(jpnBack_button);
        jpnBack_button.setLayout(jpnBack_buttonLayout);
        jpnBack_buttonLayout.setHorizontalGroup(
            jpnBack_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBack, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jpnBack_buttonLayout.setVerticalGroup(
            jpnBack_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBack, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnToolbar19Layout = new javax.swing.GroupLayout(jpnToolbar19);
        jpnToolbar19.setLayout(jpnToolbar19Layout);
        jpnToolbar19Layout.setHorizontalGroup(
            jpnToolbar19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnToolbar19Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jpnBack_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 873, Short.MAX_VALUE)
                .addComponent(lblAn_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOutBangHang)
                .addGap(17, 17, 17))
        );
        jpnToolbar19Layout.setVerticalGroup(
            jpnToolbar19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAn_BanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(lblOutBangHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnToolbar19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnBack_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jfKhachHang.add(jpnToolbar19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 50));

        jpnGiaoDien.setBackground(new java.awt.Color(255, 255, 255));

        jpnDangKyHV_Buuton.setBackground(new java.awt.Color(255, 255, 255));
        jpnDangKyHV_Buuton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng Ký Hội Viên");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnDangKyHV_BuutonLayout = new javax.swing.GroupLayout(jpnDangKyHV_Buuton);
        jpnDangKyHV_Buuton.setLayout(jpnDangKyHV_BuutonLayout);
        jpnDangKyHV_BuutonLayout.setHorizontalGroup(
            jpnDangKyHV_BuutonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
        );
        jpnDangKyHV_BuutonLayout.setVerticalGroup(
            jpnDangKyHV_BuutonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jpnKHOnline_Button.setBackground(new java.awt.Color(51, 51, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Khách Hàng Online");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnKHOnline_ButtonLayout = new javax.swing.GroupLayout(jpnKHOnline_Button);
        jpnKHOnline_Button.setLayout(jpnKHOnline_ButtonLayout);
        jpnKHOnline_ButtonLayout.setHorizontalGroup(
            jpnKHOnline_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jpnKHOnline_ButtonLayout.setVerticalGroup(
            jpnKHOnline_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnHV_button.setBackground(new java.awt.Color(255, 255, 255));
        jpnHV_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hội Viên");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnHV_buttonLayout = new javax.swing.GroupLayout(jpnHV_button);
        jpnHV_button.setLayout(jpnHV_buttonLayout);
        jpnHV_buttonLayout.setHorizontalGroup(
            jpnHV_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        );
        jpnHV_buttonLayout.setVerticalGroup(
            jpnHV_buttonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpnTimKiem.setBackground(new java.awt.Color(51, 51, 255));

        jTextField1.setText("Tìm kiếm khách hàng");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tìm Kiếm");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jpnTimKiemLayout = new javax.swing.GroupLayout(jpnTimKiem);
        jpnTimKiem.setLayout(jpnTimKiemLayout);
        jpnTimKiemLayout.setHorizontalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnTimKiemLayout.setVerticalGroup(
            jpnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel8.setText("<<");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnBack_TableChinh_ButtonLayout = new javax.swing.GroupLayout(jpnBack_TableChinh_Button);
        jpnBack_TableChinh_Button.setLayout(jpnBack_TableChinh_ButtonLayout);
        jpnBack_TableChinh_ButtonLayout.setHorizontalGroup(
            jpnBack_TableChinh_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBack_TableChinh_ButtonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnBack_TableChinh_ButtonLayout.setVerticalGroup(
            jpnBack_TableChinh_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        CardLayout.setLayout(new java.awt.CardLayout());

        jscDanhSachKH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tblKhachHang.setForeground(new java.awt.Color(51, 51, 51));
        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Khách Hàng", "Tên", "Email", "Địa Chỉ", "Điện Thoại", "Loại Khách"
            }
        ));
        tblKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblKhachHang.setFocusable(false);
        tblKhachHang.setGridColor(new java.awt.Color(0, 0, 0));
        tblKhachHang.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblKhachHang.setRowHeight(25);
        tblKhachHang.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblKhachHang.setShowHorizontalLines(false);
        tblKhachHang.setShowVerticalLines(false);
        tblKhachHang.setSurrendersFocusOnKeystroke(true);
        tblKhachHang.getTableHeader().setReorderingAllowed(false);
        jscDanhSachKH.setViewportView(tblKhachHang);
        if (tblKhachHang.getColumnModel().getColumnCount() > 0) {
            tblKhachHang.getColumnModel().getColumn(2).setResizable(false);
            tblKhachHang.getColumnModel().getColumn(4).setResizable(false);
        }

        CardLayout.add(jscDanhSachKH, "card2");

        jpnHV_button1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Thêm KH");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpnHV_button1Layout = new javax.swing.GroupLayout(jpnHV_button1);
        jpnHV_button1.setLayout(jpnHV_button1Layout);
        jpnHV_button1Layout.setHorizontalGroup(
            jpnHV_button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );
        jpnHV_button1Layout.setVerticalGroup(
            jpnHV_button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnGiaoDienLayout = new javax.swing.GroupLayout(jpnGiaoDien);
        jpnGiaoDien.setLayout(jpnGiaoDienLayout);
        jpnGiaoDienLayout.setHorizontalGroup(
            jpnGiaoDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnGiaoDienLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jpnDangKyHV_Buuton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jpnKHOnline_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jpnHV_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jpnHV_button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jpnBack_TableChinh_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jpnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
            .addComponent(CardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jpnGiaoDienLayout.setVerticalGroup(
            jpnGiaoDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnGiaoDienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnGiaoDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnGiaoDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jpnDangKyHV_Buuton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jpnHV_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnKHOnline_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnTimKiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpnHV_button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jpnBack_TableChinh_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jfKhachHang.add(jpnGiaoDien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1080, 620));

        jpnDangKyForm.setOpaque(false);
        jpnDangKyForm.setLayout(new javax.swing.BoxLayout(jpnDangKyForm, javax.swing.BoxLayout.LINE_AXIS));
        jfKhachHang.add(jpnDangKyForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 450, 530));

        lblFormDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbhcafe/img/nenLogin.png"))); // NOI18N
        jfKhachHang.add(lblFormDangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1100, 710));

        add(jfKhachHang);
    }// </editor-fold>//GEN-END:initComponents

    private void lblAn_BanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAn_BanHangMouseClicked
        // TODO add your handling code here:
        Run.main.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblAn_BanHangMouseClicked

    private void lblOutBangHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOutBangHangMouseClicked
        // TODO add your handling code here:
        jpnShowMenuOut.show();
        lblOutBangHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbhcafe/img/logout.png")));

    }//GEN-LAST:event_lblOutBangHangMouseClicked

    private void lblOutBangHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOutBangHangMouseEntered
        // TODO add your handling code here:
        lblOutBangHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbhcafe/img/logout_hover.png")));
    }//GEN-LAST:event_lblOutBangHangMouseEntered

    private void lblOutBangHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOutBangHangMouseExited
        // TODO add your handling code here:
        lblOutBangHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbhcafe/img/logout.png")));
    }//GEN-LAST:event_lblOutBangHangMouseExited

    private void lblOutBangHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOutBangHangMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblOutBangHangMousePressed

    private void lblOutBangHangMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOutBangHangMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lblOutBangHangMouseReleased

    private void lblQuayVeBangHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuayVeBangHangMouseClicked
        // TODO add your handling code here:

        FormLogin.login.Card.removeAll();
        FormLogin.login.Card.add(new FormMenu());
        FormLogin.login.Card.repaint();
        FormLogin.login.Card.revalidate();
        FormLogin.login.Card.show();
        /*jpnDangXuat.setBackground(Color.white);
        lblDangXuat.setForeground(new Color(51, 102, 255));
        jpnBanHang_Button.setBackground(new Color(0, 0, 0));
        jpnBanHang_Button.setOpaque(false);
        lblBanHang_txt.setForeground(Color.WHITE);*/
        jpnQuayVe.setBackground(Color.white);
        lblQuayVeBangHang.setForeground(new Color(51, 102, 255));
    }//GEN-LAST:event_lblQuayVeBangHangMouseClicked

    private void lblQuayVeBangHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuayVeBangHangMouseEntered
        // TODO add your handling code here:
        jpnQuayVe.setBackground(new Color(51, 102, 255));
        lblQuayVeBangHang.setForeground(Color.white);
        jpnShowMenuOut.show();
    }//GEN-LAST:event_lblQuayVeBangHangMouseEntered

    private void lblQuayVeBangHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblQuayVeBangHangMouseExited
        // TODO add your handling code here:
        jpnQuayVe.setBackground(Color.white);
        lblQuayVeBangHang.setForeground(new Color(51, 102, 255));
    }//GEN-LAST:event_lblQuayVeBangHangMouseExited

    private void lblTenDangNhapBangHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTenDangNhapBangHangMouseEntered
        // TODO add your handling code here:
        jpnTenDangNhap.setBackground(new Color(51, 102, 255));
        lblTenDangNhapBangHang.setForeground(Color.white);
        jpnShowMenuOut.show();
    }//GEN-LAST:event_lblTenDangNhapBangHangMouseEntered

    private void lblTenDangNhapBangHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTenDangNhapBangHangMouseExited
        // TODO add your handling code here:

        jpnTenDangNhap.setBackground(Color.white);
        lblTenDangNhapBangHang.setForeground(new Color(51, 102, 255));
    }//GEN-LAST:event_lblTenDangNhapBangHangMouseExited

    private void lblDangXuatBangHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatBangHangMouseClicked
        // TODO add your handling code here:
        FormLogin.login.Card.removeAll();
        FormLogin.login.Card.add(FormLogin.login.jfLogin);
        FormLogin.login.Card.repaint();
        FormLogin.login.Card.revalidate();
        FormLogin.login.Card.show();
        jfMain.hide();
        jfKhachHang.hide();
        /* jpnNenButton_login.setBackground(new Color(0, 0, 0));
        jpnNenButton_login.setOpaque(false);
        lblLogin.setForeground(Color.white);
        jpnDangXuat.setBackground(Color.white);
        lblDangXuat.setForeground(new Color(51, 102, 255));*/
        jpnShowMenuOut.hide();
        jpnDangXuat.setBackground(Color.white);
        lblDangXuatBangHang.setForeground(new Color(51, 102, 255));
    }//GEN-LAST:event_lblDangXuatBangHangMouseClicked

    private void lblDangXuatBangHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatBangHangMouseEntered
        // TODO add your handling code here:

        jpnDangXuat.setBackground(new Color(51, 102, 255));
        lblDangXuatBangHang.setForeground(Color.white);
        jpnShowMenuOut.show();
    }//GEN-LAST:event_lblDangXuatBangHangMouseEntered

    private void lblDangXuatBangHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatBangHangMouseExited
        // TODO add your handling code here:

        jpnDangXuat.setBackground(Color.white);
        lblDangXuatBangHang.setForeground(new Color(51, 102, 255));
    }//GEN-LAST:event_lblDangXuatBangHangMouseExited

    private void jpnShowMenuOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnShowMenuOutMouseExited
        // TODO add your handling code here:
        jpnShowMenuOut.hide();
    }//GEN-LAST:event_jpnShowMenuOutMouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        CardLayout.removeAll();
        CardLayout.add(new KhachHangOnline());
        CardLayout.repaint();
        CardLayout.revalidate();
        CardLayout.show();
        jscDanhSachKH.hide();

    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        CardLayout.removeAll();
        CardLayout.add(new DanhSachHoiVien());
        CardLayout.repaint();
        CardLayout.revalidate();
        CardLayout.show();
        jscDanhSachKH.hide();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        CardLayout.removeAll();
        CardLayout.add(jscDanhSachKH);
        CardLayout.repaint();
        CardLayout.revalidate();
        CardLayout.show();


    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jpnDangKyForm.removeAll();
        jpnDangKyForm.add(new DangKyHoiVien());
        jpnDangKyForm.repaint();
        jpnDangKyForm.revalidate();
        jpnDangKyForm.show();
        jpnGiaoDien.hide();
        jpnBack_button.show();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:

        jpnGiaoDien.show();
        jpnBack_button.hide();
    }//GEN-LAST:event_lblBackMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
        jpnDangKyForm.removeAll();
        jpnDangKyForm.add(new ThemKH());
        jpnDangKyForm.repaint();
        jpnDangKyForm.revalidate();
        jpnDangKyForm.show();
        jpnGiaoDien.hide();
        jpnBack_button.show();

    }//GEN-LAST:event_jLabel6MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardLayout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    protected static javax.swing.JPanel jfKhachHang;
    private javax.swing.JPanel jpnBack_TableChinh_Button;
    private javax.swing.JPanel jpnBack_button;
    protected static javax.swing.JPanel jpnDangKyForm;
    private javax.swing.JPanel jpnDangKyHV_Buuton;
    private javax.swing.JPanel jpnDangXuat;
    private javax.swing.JPanel jpnGiaoDien;
    private javax.swing.JPanel jpnHV_button;
    private javax.swing.JPanel jpnHV_button1;
    private javax.swing.JPanel jpnKHOnline_Button;
    private javax.swing.JPanel jpnQuayVe;
    private javax.swing.JPanel jpnShowMenuOut;
    private javax.swing.JPanel jpnTenDangNhap;
    private javax.swing.JPanel jpnTimKiem;
    private javax.swing.JPanel jpnToolbar19;
    private javax.swing.JScrollPane jscDanhSachKH;
    private javax.swing.JLabel lblAn_BanHang;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDangXuatBangHang;
    private javax.swing.JLabel lblFormDangKy;
    private javax.swing.JLabel lblOutBangHang;
    private javax.swing.JLabel lblQuayVeBangHang;
    private javax.swing.JLabel lblTenDangNhapBangHang;
    private javax.swing.JTable tblKhachHang;
    // End of variables declaration//GEN-END:variables
}