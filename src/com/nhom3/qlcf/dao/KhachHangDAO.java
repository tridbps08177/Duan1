/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.dao;

import com.nhom3.qlcf.helper.JDBCHelper;
import com.nhom3.qlcf.model.KhachHang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kanbi
 */
public class KhachHangDAO implements DAO<KhachHang> {
    
    @Override
    public boolean insert(KhachHang t) {
        String sql = "Insert dbo.KhachHang values (?,?,?,?,?,?,?)";
        return JDBCHelper.executeUpdate(sql, t.getMakh(), t.getTenKh(), t.getEmail(), t.getDienThoai(), t.getDiaChi(), t.isTrangThai(), t.getDiemThuong());
    }
    
    @Override
    public boolean delete(KhachHang t) {
        String sql = "Delete from dbo.KhachHang where maKh=?";
        return JDBCHelper.executeUpdate(sql, t.getMakh());
    }
    
    @Override
    public boolean update(KhachHang t) {
        String sql = "Update dbo.KhachHang set tenKh=?, email=?, dienThoai=?, diaChi=?, trangThai=?, diemThuong=? where maKh=?";
        return JDBCHelper.executeUpdate(sql, t.getTenKh(), t.getEmail(), t.getDienThoai(), t.getDiaChi(), t.isTrangThai(), t.getDiemThuong(), t.getMakh());
    }
    
    @Override
    public List<KhachHang> selectAll() {
        String sql = "Select * from dbo.KhachHang";
        return select(sql);
    }
    
    @Override
    public List<KhachHang> select(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    KhachHang model = readFromResultSet(rs);
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
    public KhachHang readFromResultSet(ResultSet rs) {
        KhachHang model = new KhachHang();
        try {
            model.setMakh(rs.getString(1));
            model.setTenKh(rs.getString(2));
            model.setEmail(rs.getString(3));
            model.setDienThoai(rs.getString(4));
            model.setDiaChi(rs.getString(5));
            model.setTrangThai(rs.getBoolean(6));
            model.setDiemThuong(rs.getInt(7)); 
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        
        return model;
    }
    
}
