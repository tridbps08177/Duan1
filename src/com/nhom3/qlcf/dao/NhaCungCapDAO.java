/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.dao;

import com.nhom3.qlcf.helper.JDBCHelper;
import com.nhom3.qlcf.model.NhaCungCap;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Kanbi
 */
public class NhaCungCapDAO implements DAO<NhaCungCap>{

    @Override
    public boolean insert(NhaCungCap t) {
        String sql = "Insert dbo.NhaCungCap values (?,?,?,?,?)";
        return JDBCHelper.executeUpdate(sql, t.getMaNhaCungCap(), t.getTenNhaCC(), t.getDienThoai(), t.getDiaChi(), t.isTrangThai());
    }

    @Override
    public boolean delete(NhaCungCap t) {
        String sql = "Delete from dbo.NhaCungCap where maNhaCungCap=?";
        return JDBCHelper.executeUpdate(sql, t.getMaNhaCungCap());
    }

    @Override
    public boolean update(NhaCungCap t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NhaCungCap> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NhaCungCap> select(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NhaCungCap readFromResultSet(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
