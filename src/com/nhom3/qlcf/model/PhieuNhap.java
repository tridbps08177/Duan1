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
public class PhieuNhap {

    private String maPhieu;
    private HangHoa maHangHoa;
    private NhaCungCap maNhaCungCap;
    private Date ngayNhap;
    private int SoLuong;
    private double tongTien;

    public PhieuNhap() {
    }

    public PhieuNhap(String maPhieu, HangHoa maHangHoa, NhaCungCap maNhaCungCap, Date ngayNhap, int SoLuong, double tongTien) {
        this.maPhieu = maPhieu;
        this.maHangHoa = maHangHoa;
        this.maNhaCungCap = maNhaCungCap;
        this.ngayNhap = ngayNhap;
        this.SoLuong = SoLuong;
        this.tongTien = tongTien;
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

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    
    
}
