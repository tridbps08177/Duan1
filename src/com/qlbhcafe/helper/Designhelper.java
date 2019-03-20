/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbhcafe.helper;

import com.qlbhcafe.view.form.banhang.Datmon;
import com.qlbhcafe.model.CTHoaDon;

import com.qlbhcafe.model.SanPham;
import com.sun.corba.se.impl.naming.cosnaming.InterOperableNamingImpl;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author baotri1998
 */
public class Designhelper implements DesignInterFace {

    private JLabel lblgia, lbltenSP, lblImg;
    public JLabel lblsoluong;
    String tenspString, giaSP, img, so;

    @Override
    public void DesignSanPham(JPanel sanphamUI, List<SanPham> data, List<CTHoaDon> CTHD, JPanel donhang) {
        sanphamUI.removeAll();
        sanphamUI.updateUI();
        sanphamUI.setVisible(true);
        JPanel[] pnlSanPham = new JPanel[data.size()];
        int x = Integer.parseInt(String.valueOf(data.size() / 4));
        sanphamUI.setLayout(new GridLayout(x + 1, 3, 15, 15));

        for (int i = 0; i < data.size(); i++) {
            pnlSanPham[i] = new JPanel();
            lbltenSP = new JLabel(data.get(i).getTenSp());
            lblImg = new JLabel();
            lblgia = new JLabel(String.valueOf(data.get(i).getGiaBan()));
            lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlbhcafe/img/" + data.get(i).getHinhAnh())));
            pnlSanPham[i].setName(data.get(i).getMaSP());
            pnlSanPham[i].setPreferredSize(new Dimension(140, 175)); //w = 200 hei = 250
            pnlSanPham[i].setLayout(new BoxLayout(pnlSanPham[i], javax.swing.BoxLayout.LINE_AXIS));
            pnlSanPham[i].setBackground(new Color(255, 255, 255));
            pnlSanPham[i].setBorder(new LineBorder(Color.BLUE, 1));
            //Action
            pnlSanPham[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            pnlSanPham[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {

                    if (CTHD.isEmpty()) {
                        Datmon dt = new Datmon(null, true, e.getComponent().getName(), giaSP, tenspString, img);
                        dt.setVisible(true);
                    } else {
                        Datmon dt = new Datmon(null, true, e.getComponent().getName(), giaSP, tenspString, img, so);
                        dt.setVisible(true);

                    }

                    DesigDonHang(donhang, CTHD);

                }
            ;
            });
            DesigMenuThucDon(lblgia, lbltenSP, lblImg);
            pnlSanPham[i].add(DesigMenuThucDon(lblgia, lbltenSP, lblImg));
            sanphamUI.add(pnlSanPham[i]);
            sanphamUI.updateUI();
        }
    }

    @Override
    public List<SanPham> LimitPage(List<SanPham> LimitUI, int start, int end) {
        ArrayList<SanPham> list = new ArrayList<>();
        for (int i = start; i < end; i++) {
            list.add(LimitUI.get(i));
        }
        return list;
    }

    @Override
    public void DesignPage(JPanel PageUI, List<SanPham> limit) {

        PageUI.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        PageUI.removeAll();
        PageUI.updateUI();
        PageUI.setVisible(true);
        int gioihan = limit.size() / 9;
        if (gioihan * 9 < limit.size()) {
            gioihan += 1;
        }
        JPanel[] jplNext = new JPanel[limit.size()];

        for (int i = 0; i < gioihan; i++) {
            jplNext[i] = new JPanel();
            jplNext[i].setBorder(new LineBorder(Color.gray));
            jplNext[i].setCursor(new Cursor(Cursor.HAND_CURSOR));
            jplNext[i].setBackground(Color.WHITE);
            JLabel next = new JLabel();
            next.setText(String.valueOf(i + 1));
            jplNext[i].add(next);
            jplNext[i].addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    int size = Integer.parseInt(next.getText());
                    int start = (size - 1) * 9;
                    int end = start + 9;
                    if (end > limit.size()) {
                        end = limit.size();
                    }
                    LimitPage(limit, start, end);
                    System.out.println(LimitPage(limit, start, end));
                }

            });
            PageUI.add(jplNext[i]);
            PageUI.updateUI();

        }

    }

    @Override
    public void DesigDonHang(JPanel donhangUI, List<CTHoaDon> CTHD) {
        donhangUI.removeAll();
        donhangUI.updateUI();
        donhangUI.setVisible(true);
        donhangUI.setLayout(new BoxLayout(donhangUI, BoxLayout.PAGE_AXIS));
        JPanel[] pnl = new JPanel[CTHD.size()];
        //   donhangUI.removeAll();
        for (int i = 0; i < CTHD.size(); i++) {
            pnl[i] = new JPanel();
            // pnl[i].setBorder(BorderFactory.createLineBorder(new Color(204, 7, 140), 1));
            pnl[i].setBackground(Color.WHITE);
            pnl[i].setLayout(new GridLayout(2, 4, 1, 3));
            pnl[i].setPreferredSize(new Dimension(600, 35));
            pnl[i].setMaximumSize(new Dimension(600, 35));
            pnl[i].setMinimumSize(new Dimension(600, 35));

            lblsoluong = new JLabel();
            lblsoluong = new JLabel(String.valueOf(CTHD.get(i).getSoLuong()));
            lblsoluong.setFont(new Font("Tahoma", 1, 11));
            lblsoluong.setPreferredSize(new Dimension(50, 20));
            JLabel lbltenSP = new JLabel(CTHD.get(i).getMaSanPham().getTenSp());
            JLabel lblmaSP = new JLabel(CTHD.get(i).getMaSanPham().getMaSP());
            JLabel lbltenSPmaSP = new JLabel(lbltenSP.getText() + " (" + lblmaSP.getText() + ")");
            lbltenSPmaSP.setName(CTHD.get(i).getMaSanPham().getMaSP());
            lbltenSPmaSP.setForeground(Color.BLUE);
            lbltenSPmaSP.setFont(new Font("Tahoma", 1, 11));
            double tongtien = CTHD.get(i).getMaSanPham().getGiaBan();
            if (tongtien == CTHD.get(i).getMaSanPham().getGiaBan()) {
                tongtien += CTHD.get(i).getMaSanPham().getGiaBan() * CTHD.get(i).getSoLuong();
            }
            JLabel lblXoa = new JLabel("Xóa");
            int index = i;
            lblXoa.setName(String.valueOf(index));
            lblXoa.setToolTipText(String.valueOf(index));
            lblXoa.setCursor(new Cursor(Cursor.HAND_CURSOR));
            JLabel lblgiaSP = new JLabel(String.valueOf(CTHD.get(i).getMaSanPham().getGiaBan()));
            lblgiaSP.setFont(new Font("Tahoma", 1, 11));
            JLabel lblTongTien = new JLabel(String.valueOf(tongtien - CTHD.get(i).getMaSanPham().getGiaBan()) + "/" + lblsoluong.getText());
            lblTongTien.setFont(new Font("Tahoma", 1, 11));
            lblTongTien.setForeground(Color.RED);
            JLabel lblghiChu = new JLabel("Ghi Chú: " + CTHD.get(i).getMaSanPham().getExtra());
            lblghiChu.setForeground(Color.GRAY);
            lblghiChu.setFont(new Font("Tahoma", 2, 11));
            pnl[i].add(lbltenSPmaSP);
            pnl[i].add(lblgiaSP);
            pnl[i].add(lblTongTien);
            pnl[i].add(lblghiChu);
            pnl[i].add(lblXoa).addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {

                    //filling the cartItems
                    //   CTHoaDon ci = new CTHoaDon(itemcode, itemQuantity);//the one I want to remove
                    /*  Iterator<CTHoaDon> itr = CTHD.iterator();
                    while (itr.hasNext()) {
                        CTHoaDon ci_itr = itr.next();
                        if (ci_itr.getMaSanPham().getMaSP().equalsIgnoreCase(e.getComponent().getName())) {
                            itr.remove();
                            System.out.println("Thanh cong");
                        }
                        DesigDonHang(donhangUI, CTHD);
                    }*/
                    CTHD.remove(CTHD.get(Integer.parseInt(e.getComponent().getName())));
                    DesigDonHang(donhangUI, CTHD);
                }

            });;
//            pnl[i].add(new JLabel("1"), JLabel.LEFT);
            so = lblsoluong.getText();
            pnl[i].setToolTipText(so);

            donhangUI.add(pnl[i]);
            donhangUI.updateUI();
        }

    }

    @Override
    public JPanel DesigMenuThucDon(JLabel lblgia, JLabel lblten, JLabel lblimg) {
        this.lbltenSP = lblten;
        this.lblgia = lblgia;
        this.lblImg = lblimg;
        JPanel pnlthucdon = new JPanel();
        pnlthucdon.setLayout(new BoxLayout(pnlthucdon, BoxLayout.LINE_AXIS));
        JPanel pnlAblayout = new JPanel();
        JPanel pnlNen = new JPanel();
        pnlNen.setBackground(new Color(0, 0, 0, 65));
        pnlAblayout.setLayout(new AbsoluteLayout());
        pnlAblayout.setPreferredSize(new Dimension(140, 175));
        pnlAblayout.setBackground(Color.gray);
        lblten.setForeground(Color.white);
        lblten.setBackground(new Color(0, 0, 0, 65));
        lblten.setFont(new Font("Tahoma", 1, 12));
        lblten.setHorizontalAlignment(SwingConstants.CENTER);
        lblgia.setBackground(new Color(0, 0, 0, 65));
        lblgia.setForeground(Color.WHITE);
        lblgia.setFont(new Font("Tahoma", 1, 11));
        lblgia.setOpaque(true);
        lblgia.setHorizontalAlignment(SwingConstants.CENTER);
        lblimg.setHorizontalAlignment(SwingConstants.CENTER);
        GroupLayout pnlLayout = new GroupLayout(pnlNen);
        pnlLayout.setHorizontalGroup(
                pnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lblten, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE));
        pnlLayout.setVerticalGroup(
                pnlLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lblten, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        pnlAblayout.add(pnlNen, new AbsoluteConstraints(0, 140, 150, 39));
        pnlAblayout.add(lblgia, new AbsoluteConstraints(60, 10, 90, 30));

        pnlAblayout.add(lblimg, new AbsoluteConstraints(0, 0, 150, 170));
        pnlthucdon.add(pnlAblayout);
        return pnlAblayout;
    }

    public static boolean checkDuplicateUsingAdd(List<CTHoaDon> input) {
        Set tempSet = new HashSet();
        for (CTHoaDon str : input) {
            if (!tempSet.add(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean bruteforce(List<CTHoaDon> input) {
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.size(); j++) {
                if (input.get(i).equals(input.get(j)) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public JDialog DesignDatMon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
