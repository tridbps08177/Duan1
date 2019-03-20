/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbhcafe.helper;

import com.qlbhcafe.model.CTHoaDon;
import com.qlbhcafe.model.SanPham;
import java.awt.Event;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author baotri1998
 */
public interface DesignInterFace {
    public void DesignSanPham(JPanel sanphamUI, List<SanPham> data,List<CTHoaDon> donhang,JPanel jpldonhang);

    public void DesignPage(JPanel PageUI, List<SanPham> limit);
    
    public List<SanPham> LimitPage(List<SanPham> LimitUI, int start, int end);
    
    public void DesigDonHang(JPanel donhangUI, List<CTHoaDon> data);

    public JPanel DesigMenuThucDon(JLabel lblgia, JLabel lblTen, JLabel lblImg);
     
    public JDialog DesignDatMon();
        
    
}
