/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.model;

/**
 *
 * @author baotri1998
 */
public class NhaCungCap {
  private  String maNhaCungCap,tenNhaCC,dienThoai,diaChi;
  private  boolean trangThai;

    public NhaCungCap(String maNhaCungCap, String tenNhaCC, String dienThoai, String diaChi, boolean trangThai) {
        this.maNhaCungCap = maNhaCungCap;
        this.tenNhaCC = tenNhaCC;
        this.dienThoai = dienThoai;
        this.diaChi = diaChi;
        this.trangThai = trangThai;
    }

    public String getMaNhaCungCap() {
        return maNhaCungCap;
    }

    public void setMaNhaCungCap(String maNhaCungCap) {
        this.maNhaCungCap = maNhaCungCap;
    }

    public String getTenNhaCC() {
        return tenNhaCC;
    }

    public void setTenNhaCC(String tenNhaCC) {
        this.tenNhaCC = tenNhaCC;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
}
