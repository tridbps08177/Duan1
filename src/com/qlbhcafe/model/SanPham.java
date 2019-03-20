/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbhcafe.model;

import java.io.Serializable;

/**
 *
 * @author baotri1998
 */
public class SanPham implements Comparable<SanPham>{

    private String maSP;
    private LoaiSanPham maLoaiSanPham;
    private HangHoa maHangHoa;
    private String tenSp;
    private double giaBan;
    private String extra;
    private boolean trangThai;
    private String hinhAnh;

    public SanPham(String maSP, LoaiSanPham maLoaiSanPham, HangHoa maHangHoa, String tenSp, double giaBan, String extra, boolean trangThai, String hinhAnh) {
        this.maSP = maSP;
        this.maLoaiSanPham = maLoaiSanPham;
        this.maHangHoa = maHangHoa;
        this.tenSp = tenSp;
        this.giaBan = giaBan;
        this.extra = extra;
        this.trangThai = trangThai;
        this.hinhAnh = hinhAnh;
    }

    public SanPham() {
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public LoaiSanPham getMaLoaiSanPham() {
        return maLoaiSanPham;
    }

    public void setMaLoaiSanPham(LoaiSanPham maLoaiSanPham) {
        this.maLoaiSanPham = maLoaiSanPham;
    }

    public HangHoa getMaHangHoa() {
        return maHangHoa;
    }

    public void setMaHangHoa(HangHoa maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    @Override
    public int compareTo(SanPham t) {
         return this.maSP.compareTo(t.maSP);
    }
    
    

}
