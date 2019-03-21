/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.dao;

import com.nhom3.qlcf.helper.JDBCHelper;
import com.nhom3.qlcf.model.CTHoaDon;
import com.nhom3.qlcf.model.HoaDon;
import com.nhom3.qlcf.model.SanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kanbi
 */
public class CTHoaDonDAO implements DAO<CTHoaDon> {

    @Override
    public boolean insert(CTHoaDon t) {
        String sql = "Insert dbo.CTHoaDon values (?,?,?)";
        return JDBCHelper.executeUpdate(sql, t.getMaHoaDon().getMaHoaDon(), t.getMaSanPham().getMaSanPham(), t.getSoLuong());
    }

    @Override
    public boolean delete(CTHoaDon t) {
        String sql = "Delete from CTHoaDon where maCTHD=?";
        return JDBCHelper.executeUpdate(sql, t.getId());
    }

    @Override
    public boolean update(CTHoaDon t) {
        String sql = "Update dbo.CTHoaDon set maHD=?,maSP=?,soLuong=? where maCTHD=?";
        return JDBCHelper.executeUpdate(sql, t.getMaHoaDon().getMaHoaDon(), t.getMaSanPham().getMaSanPham(), t.getSoLuong(), t.getId());
    }

    @Override
    public List<CTHoaDon> selectAll() {
        String sql = "Select * from CTHoaDon";
        return select(sql);
    }

    @Override
    public List<CTHoaDon> select(String sql, Object... args) {
        List<CTHoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    CTHoaDon model = readFromResultSet(rs);
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

    @Override
    public CTHoaDon readFromResultSet(ResultSet rs) {
        CTHoaDon model = new CTHoaDon();
        try {
            model.setId(rs.getInt(1));
            
            HoaDon hd = new HoaDon();
            hd.setMaHoaDon(rs.getString(2));
            model.setMaHoaDon(hd);
            
            SanPham sp = new SanPham();
            sp.setMaSanPham(rs.getString(3));
            model.setMaSanPham(sp);
            
            model.setSoLuong(rs.getInt(4)); 
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return model;
    }

}
