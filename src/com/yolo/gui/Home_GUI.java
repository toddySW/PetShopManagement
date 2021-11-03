/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yolo.gui;

import javax.swing.ImageIcon;

/**
 *
 * @author User
 */
public class Home_GUI extends javax.swing.JFrame {
    private QLLoaiSanPhamPanel_GUI qlLoaiSanPhamPanel;
    private QLSanPhamPanel_GUI qlSanPhamPanel;
    private QLNguonPhamPanel_GUI qLNguonPhamPanel;
    private QLKhachHangPanel_GUI qLKhachHangPanel;
    private QLDonDatHangPanel_GUI qLDonDatHangPanel;
    private IntroductionPanel_GUI gioithieuPanel;
    /**
     * Creates new form Management_GUI
     */
    public Home_GUI() {
        initComponents();
        // set logo app
        setIconImage(new ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/logo.png")).getImage());
        //canh giữa màn hình khi run form
        setLocationRelativeTo(null); 
        if (gioithieuPanel == null){ 
            gioithieuPanel = new IntroductionPanel_GUI();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/Apps-preferences-desktop-user-password-icon-16.png"));
            tabpaneMainBroad.addTab("Giới thiệu", icon, gioithieuPanel, "Giới thiệu");
        }
        tabpaneMainBroad.setSelectedComponent(gioithieuPanel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        jButton3 = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jButton5 = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jButton6 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        jButton7 = new javax.swing.JButton();
        tabpaneMainBroad = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        mnitem_Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnItem_qlLoaiSanPham = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnItem_qlSanPham = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnItem_qlNguonPham = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnItem_QLDonHang = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mnItem_QLNhanVien = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        mnITemGioiThieu = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/logout-icon-32.png"))); // NOI18N
        jButton1.setText("Đăng Xuất");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator8);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/gpa-icon-32.png"))); // NOI18N
        jButton2.setText("Quản lý loại sản phẩm");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator9);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/gpa-icon-32.png"))); // NOI18N
        jButton3.setText("Quản lý sản phẩm ");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);
        jToolBar1.add(jSeparator10);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/gpa-icon-32.png"))); // NOI18N
        jButton4.setText("Quản lý nguồn phẩm");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);
        jToolBar1.add(jSeparator11);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/gpa-icon-32.png"))); // NOI18N
        jButton5.setText("Quản lý khách hàng");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);
        jToolBar1.add(jSeparator12);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/gpa-icon-32.png"))); // NOI18N
        jButton6.setText("Quản lý đơn hàng");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton6);
        jToolBar1.add(jSeparator13);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/Actions-help-about-icon-32.png"))); // NOI18N
        jButton7.setText("Giới thiệu");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jMenu1.setText("Hệ Thống ");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/logout-icon-16.png"))); // NOI18N
        jMenuItem1.setText("Đăng xuất ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator2);

        mnitem_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnitem_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/Button-Close-icon-16.png"))); // NOI18N
        mnitem_Exit.setText("Thoát");
        mnitem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitem_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(mnitem_Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        mnItem_qlLoaiSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/gpa-icon.png"))); // NOI18N
        mnItem_qlLoaiSanPham.setText("Quản lý loại sản phẩm ");
        mnItem_qlLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_qlLoaiSanPhamActionPerformed(evt);
            }
        });
        jMenu2.add(mnItem_qlLoaiSanPham);
        jMenu2.add(jSeparator3);

        mnItem_qlSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/gpa-icon.png"))); // NOI18N
        mnItem_qlSanPham.setText("Quản lý sản phẩm ");
        mnItem_qlSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_qlSanPhamActionPerformed(evt);
            }
        });
        jMenu2.add(mnItem_qlSanPham);
        jMenu2.add(jSeparator1);

        mnItem_qlNguonPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/gpa-icon.png"))); // NOI18N
        mnItem_qlNguonPham.setText("Quản lý nguồn gốc sản phẩm ");
        mnItem_qlNguonPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_qlNguonPhamActionPerformed(evt);
            }
        });
        jMenu2.add(mnItem_qlNguonPham);
        jMenu2.add(jSeparator5);

        mnItem_QLDonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/Apps-preferences-desktop-user-password-icon-16.png"))); // NOI18N
        mnItem_QLDonHang.setText("Quản lý đơn đặt hàng ");
        mnItem_QLDonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_QLDonHangActionPerformed(evt);
            }
        });
        jMenu2.add(mnItem_QLDonHang);
        jMenu2.add(jSeparator7);

        mnItem_QLNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/Apps-preferences-desktop-user-password-icon-16.png"))); // NOI18N
        mnItem_QLNhanVien.setText("Quản lý nhân viên");
        mnItem_QLNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnItem_QLNhanVienActionPerformed(evt);
            }
        });
        jMenu2.add(mnItem_QLNhanVien);
        jMenu2.add(jSeparator15);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Trợ giúp");
        jMenu3.add(jSeparator4);

        mnITemGioiThieu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnITemGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/Help-icon-16.png"))); // NOI18N
        mnITemGioiThieu.setText("Giới thiệu");
        mnITemGioiThieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnITemGioiThieuActionPerformed(evt);
            }
        });
        jMenu3.add(mnITemGioiThieu);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
            .addComponent(tabpaneMainBroad)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabpaneMainBroad, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnItem_qlSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_qlSanPhamActionPerformed
        // TODO add your handling code here:
        if (qlSanPhamPanel == null){ 
            qlSanPhamPanel = new QLSanPhamPanel_GUI();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/gpa-icon-24.png"));
            tabpaneMainBroad.addTab("Quản lý sản phẩm", icon, qlSanPhamPanel, "Quản lý sản phẩm");
            
        }
        tabpaneMainBroad.setSelectedComponent(qlSanPhamPanel);
    }//GEN-LAST:event_mnItem_qlSanPhamActionPerformed

    private void mnitem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitem_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnitem_ExitActionPerformed

    private void mnItem_qlLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_qlLoaiSanPhamActionPerformed
        // Hiện trang quản lý loại sản phẩm lên trang Home
        if (qlLoaiSanPhamPanel == null){ 
            qlLoaiSanPhamPanel = new QLLoaiSanPhamPanel_GUI();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/gpa-icon-24.png"));
            tabpaneMainBroad.addTab("Quản lý loại sản phẩm", icon, qlLoaiSanPhamPanel, "Quản lý loại sản phẩm");
        }
        tabpaneMainBroad.setSelectedComponent(qlLoaiSanPhamPanel);
        
    }//GEN-LAST:event_mnItem_qlLoaiSanPhamActionPerformed

    private void mnItem_qlNguonPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_qlNguonPhamActionPerformed
        // Hiện trang quản lý nguồn gốc sản phẩm lên trang Home
        if (qLNguonPhamPanel == null){ 
            qLNguonPhamPanel = new QLNguonPhamPanel_GUI();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/gpa-icon-24.png"));
            tabpaneMainBroad.addTab("Quản lý nguồn gốc sản phẩm", icon, qLNguonPhamPanel, "Quản lý nguồn gốc sản phẩm");
        }
        tabpaneMainBroad.setSelectedComponent(qLNguonPhamPanel);
    }//GEN-LAST:event_mnItem_qlNguonPhamActionPerformed

    private void mnItem_QLDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_QLDonHangActionPerformed
        // Hiện trang quản lý đơn hàng lên trang Home
        if (qLDonDatHangPanel== null){ 
            qLDonDatHangPanel = new QLDonDatHangPanel_GUI();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/Apps-preferences-desktop-user-password-icon-16.png"));
            tabpaneMainBroad.addTab("Quản lý đơn hàng", icon,  qLDonDatHangPanel, "Quản lý đơn hàng");
        }
        tabpaneMainBroad.setSelectedComponent( qLDonDatHangPanel);
        
    }//GEN-LAST:event_mnItem_QLDonHangActionPerformed

    private void mnItem_QLNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnItem_QLNhanVienActionPerformed
        //Hiện trang Thống kê lên trang Home
    }//GEN-LAST:event_mnItem_QLNhanVienActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (qlLoaiSanPhamPanel == null){ 
            qlLoaiSanPhamPanel = new QLLoaiSanPhamPanel_GUI();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/gpa-icon-24.png"));
            tabpaneMainBroad.addTab("Quản lý loại sản phẩm", icon, qlLoaiSanPhamPanel, "Quản lý loại sản phẩm");
        }
        tabpaneMainBroad.setSelectedComponent(qlLoaiSanPhamPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (qlSanPhamPanel == null){ 
            qlSanPhamPanel = new QLSanPhamPanel_GUI();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/gpa-icon-24.png"));
            tabpaneMainBroad.addTab("Quản lý sản phẩm", icon, qlSanPhamPanel, "Quản lý sản phẩm");
        }
        tabpaneMainBroad.setSelectedComponent(qlSanPhamPanel);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (qLNguonPhamPanel == null){ 
            qLNguonPhamPanel = new QLNguonPhamPanel_GUI();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/gpa-icon-24.png"));
            tabpaneMainBroad.addTab("Quản lý nguồn gốc sản phẩm", icon, qLNguonPhamPanel, "Quản lý nguồn gốc sản phẩm");
        }
        tabpaneMainBroad.setSelectedComponent(qLNguonPhamPanel);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (qLKhachHangPanel == null){ 
            qLKhachHangPanel = new QLKhachHangPanel_GUI();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/Apps-preferences-desktop-user-password-icon-16.png"));
            tabpaneMainBroad.addTab("Quản lý khách hàng", icon, qLKhachHangPanel, "Quản lý khách hàng");
        }
        tabpaneMainBroad.setSelectedComponent(qLKhachHangPanel);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (qLDonDatHangPanel== null){ 
            qLDonDatHangPanel = new QLDonDatHangPanel_GUI();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/Apps-preferences-desktop-user-password-icon-16.png"));
            tabpaneMainBroad.addTab("Quản lý đơn hàng", icon,  qLDonDatHangPanel, "Quản lý đơn hàng");
        }
        tabpaneMainBroad.setSelectedComponent( qLDonDatHangPanel);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void mnITemGioiThieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnITemGioiThieuActionPerformed
        // TODO add your handling code here:
        if (gioithieuPanel == null){ 
            gioithieuPanel = new IntroductionPanel_GUI();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/Apps-preferences-desktop-user-password-icon-16.png"));
            tabpaneMainBroad.addTab("Giới thiệu", icon, gioithieuPanel, "Giới thiệu");
        }
        tabpaneMainBroad.setSelectedComponent(gioithieuPanel);
    }//GEN-LAST:event_mnITemGioiThieuActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if (gioithieuPanel == null){ 
            gioithieuPanel = new IntroductionPanel_GUI();
            ImageIcon icon = new ImageIcon(getClass().getResource("/com/yolo/gui/iconset4/Apps-preferences-desktop-user-password-icon-16.png"));
            tabpaneMainBroad.addTab("Giới thiệu", icon, gioithieuPanel, "Giới thiệu");
        }
        tabpaneMainBroad.setSelectedComponent(gioithieuPanel);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Login_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new Login_GUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
//    public static void main(String[] args) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Home_GUI().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnITemGioiThieu;
    private javax.swing.JMenuItem mnItem_QLDonHang;
    private javax.swing.JMenuItem mnItem_QLNhanVien;
    private javax.swing.JMenuItem mnItem_qlLoaiSanPham;
    private javax.swing.JMenuItem mnItem_qlNguonPham;
    private javax.swing.JMenuItem mnItem_qlSanPham;
    private javax.swing.JMenuItem mnitem_Exit;
    private javax.swing.JTabbedPane tabpaneMainBroad;
    // End of variables declaration//GEN-END:variables
}
