/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.model;

import java.io.Serializable;

/**
 *
 * @author baotri1998
 */
public class SanPham implements Serializable{

    private String maSanPham;
    private LoaiSanPham maLoaiSanPham;
    private HangHoa maHangHoa;
    private String tenSp;
    private double giaBan;
    private boolean trangThai;
    private String hinhAnh;

    public SanPham() {
    }

    public SanPham(String maSanPham, LoaiSanPham maLoaiSanPham, HangHoa maHangHoa, String tenSp, double giaBan, boolean trangThai, String hinhAnh) {
        this.maSanPham = maSanPham;
        this.maLoaiSanPham = maLoaiSanPham;
        this.maHangHoa = maHangHoa;
        this.tenSp = tenSp;
        this.giaBan = giaBan;
        this.trangThai = trangThai;
        this.hinhAnh = hinhAnh;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
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

   
    
    

}
