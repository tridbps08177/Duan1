/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlbhcafe.test;

import com.qlbhcafe.helper.Jdbc;
import com.qlbhcafe.model.HangHoa;
import com.qlbhcafe.model.LoaiSanPham;
import com.qlbhcafe.model.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author baotri1998
 */
public class testSQL {

    public static List<SanPham> select() {
        String sql = "SELECT* FROM dbo.SanPham";
        return select(sql);
    }

    public static List<SanPham> FindmaSP(String masp) {
        String sql = "SELECT* FROM dbo.SanPham where maSp ='" + masp + "'";
        return select(sql);
    }

 
    private static List<SanPham> select(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;

            try {
                rs = Jdbc.executeQuery(sql, args);

                while (rs.next()) {
                    SanPham model = readFromResultSet(rs);
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

    private static SanPham readFromResultSet(ResultSet rs) throws SQLException {
        SanPham model = new SanPham();
        model.setMaSP(rs.getString("maSp"));
        LoaiSanPham loai = new LoaiSanPham();
        loai.setMaLoai(rs.getString("maLoai"));
        model.setMaLoaiSanPham(loai);
        HangHoa hang = new HangHoa();
        hang.setMaHangHoa(rs.getString("maHangHoa"));
        model.setMaHangHoa(hang);
        model.setTenSp(rs.getString("tenSP"));
        model.setGiaBan(rs.getDouble("giaBan"));
        model.setExtra(rs.getNString("extra"));
        model.setTrangThai(rs.getBoolean("TrangThai"));
        model.setHinhAnh(rs.getString("hinhAnh"));
        return model;
    }

    public static void main(String[] args) {
   
    }
}
