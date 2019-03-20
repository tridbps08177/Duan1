/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbhcafe.model;

import java.util.Date;

/**
 *
 * @author baotri1998
 */
public class PhieuNhap {

    private String maPhieu;
    private HangHoa maHangHoa;
    private NhaCungCap maNhaCungCap;
    private Date ngayNhap;
    private double tongTien;

    public PhieuNhap(String maPhieu, HangHoa maHangHoa, NhaCungCap maNhaCungCap, Date ngayNhap, double tongTien) {
        this.maPhieu = maPhieu;
        this.maHangHoa = maHangHoa;
        this.maNhaCungCap = maNhaCungCap;
        this.ngayNhap = ngayNhap;
        this.tongTien = tongTien;
    }

    public PhieuNhap() {
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public HangHoa getMaHangHoa() {
        return maHangHoa;
    }

    public void setMaHangHoa(HangHoa maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    public NhaCungCap getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(NhaCungCap maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
    
}
