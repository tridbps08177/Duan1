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
public class NguoiDung {
  private  String maNguoidung, taiKhoan,matKhau,hoTen,dienThoai,vaiTro;
 private   boolean trangThai;

    public NguoiDung(String maNguoidung, String taiKhoan, String matKhau, String hoTen, String dienThoai, String vaiTro, boolean trangThai) {
        this.maNguoidung = maNguoidung;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.dienThoai = dienThoai;
        this.vaiTro = vaiTro;
        this.trangThai = trangThai;
    }

    public NguoiDung() {
    }

    public String getMaNguoidung() {
        return maNguoidung;
    }

    public void setMaNguoidung(String maNguoidung) {
        this.maNguoidung = maNguoidung;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
}
