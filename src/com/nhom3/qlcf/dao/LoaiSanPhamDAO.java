/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.dao;

import com.nhom3.qlcf.helper.JDBCHelper;
import com.nhom3.qlcf.model.LoaiSanPham;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kanbi
 */
public class LoaiSanPhamDAO implements DAO<LoaiSanPham> {

    @Override
    public boolean insert(LoaiSanPham t) {
        String sql = "Insert dbo.LoaiSanPham values ()";
        return JDBCHelper.executeUpdate(sql, t.getMaLoai(), t.getTenLoai());
    }

    @Override
    public boolean delete(LoaiSanPham t) {
        String sql = "Delete from dbo.LoaiSanPham where maLoai=?";
        return JDBCHelper.executeUpdate(sql, t.getMaLoai());
    }

    @Override
    public boolean update(LoaiSanPham t) {
        String sql = "Update dbo.LoaiSanPham set tenLoai=? where maLoai=?";
        return JDBCHelper.executeUpdate(sql, t.getTenLoai(), t.getMaLoai());
    }

    @Override
    public List<LoaiSanPham> selectAll() {
        String sql = "Select * from dbo.LoaiSanPham";
        return select(sql);
    }

    @Override
    public List<LoaiSanPham> select(String sql, Object... args) {
        List<LoaiSanPham> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    LoaiSanPham model = readFromResultSet(rs);
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
    public LoaiSanPham readFromResultSet(ResultSet rs) {
        LoaiSanPham model = new LoaiSanPham();
        try {
            model.setMaLoai(rs.getString(1));
            model.setTenLoai(rs.getString(2));
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return model;
    }

}
