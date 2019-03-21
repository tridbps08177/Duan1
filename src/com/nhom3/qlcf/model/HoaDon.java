/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.model;

import java.util.Date;

/**
 *
 * @author baotri1998
 */
public class HoaDon {
    private String maHoaDon;
    private NguoiDung maNguoiDung;
    private KhachHang maKhachHang;
    private double chietKhau;
    private Date ngayHD;
    private double tongTien;
    private boolean trangThai;

    public HoaDon() {
    }

    public HoaDon(String maHoaDon, NguoiDung maNguoiDung, KhachHang maKhachHang, double chietKhau, Date ngayHD, double tongTien, boolean trangThai) {
        this.maHoaDon = maHoaDon;
        this.maNguoiDung = maNguoiDung;
        this.maKhachHang = maKhachHang;
        this.chietKhau = chietKhau;
        this.ngayHD = ngayHD;
        this.tongTien = tongTien;
        this.trangThai = trangThai;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public NguoiDung getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(NguoiDung maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public KhachHang getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(KhachHang maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public double getChietKhau() {
        return chietKhau;
    }

    public void setChietKhau(double chietKhau) {
        this.chietKhau = chietKhau;
    }

    public Date getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
}
