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
public class HangHoa implements Serializable {
    private String maHangHoa,tenHangHoa,donViTinh,moTa;
    private float soLuong;
    private double giaVon;

    public HangHoa(String maHangHoa, String tenHangHoa, String donViTinh, float soLuong, double giaVon, String moTa) {
        this.maHangHoa = maHangHoa;
        this.tenHangHoa = tenHangHoa;
        this.donViTinh = donViTinh;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.giaVon = giaVon;
    }

    public HangHoa() {
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public void setMaHangHoa(String maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaVon() {
        return giaVon;
    }

    public void setGiaVon(double giaVon) {
        this.giaVon = giaVon;
    }
    
}
