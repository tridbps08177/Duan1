/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.test;

import com.nhom3.qlcf.helper.Jdbc;
import com.nhom3.qlcf.model.CTHoaDon;
import com.nhom3.qlcf.model.HoaDon;
import com.nhom3.qlcf.model.SanPham;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author baotri1998
 */
public class testInsert {
     public static void insert(CTHoaDon model) {
        String sql = "INSERT INTO dbo.CTHoaDon( maHD, maSP,soLuong )VALUES (?,?,?)";
        
        Jdbc.executeUpdate(sql, model.getMaHoaDon().getMaHoaDon(), model.getMaSanPham().getMaSanPham(),model.getSoLuong());
           System.out.println("Thanh công");
    }

    public static List<CTHoaDon> select() {
        String sql = "SELECT * FROM dbo.CTHoaDon";
        return select(sql);
    }

    private static List<CTHoaDon> select(String sql, Object... args) {
        List<CTHoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                 rs = Jdbc.executeQuery(sql, args);
                while (rs.next()) {
                    CTHoaDon model = readFromResulSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private static CTHoaDon readFromResulSet(ResultSet rs) throws SQLException {
        CTHoaDon model = new CTHoaDon();
        HoaDon maHD = new HoaDon();
        maHD.setMaHoaDon(rs.getString("maHD"));
        model.setMaHoaDon(maHD);
        SanPham maSP = new SanPham();
        maSP.setMaSanPham(rs.getString("maSP"));
        model.setMaSanPham(maSP);
        model.setSoLuong(rs.getInt("soLuong"));
        return model;
    }
    public static void main(String[] args) {

            
     }
}
