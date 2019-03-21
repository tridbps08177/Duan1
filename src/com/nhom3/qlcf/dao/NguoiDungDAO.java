/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.dao;

import com.nhom3.qlcf.helper.JDBCHelper;
import com.nhom3.qlcf.model.NguoiDung;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kanbi
 */
public class NguoiDungDAO implements DAO<NguoiDung> {

    @Override
    public boolean insert(NguoiDung t) {
        String sql = "Insert dbo.NguoiDung values (?,?,?,?,?,?,?)";
        return JDBCHelper.executeUpdate(sql, t.getMaNguoidung(), t.getTaiKhoan(), t.getMatKhau(), t.getHoTen(), t.getDienThoai(), t.getVaiTro(), t.isTrangThai());
    }

    @Override
    public boolean delete(NguoiDung t) {
        String sql = "Delete from dbo.NguoiDung where maNguoiDung=?";
        return JDBCHelper.executeUpdate(sql, t.getMaNguoidung());
    }

    @Override
    public boolean update(NguoiDung t) {
        String sql = "Update dbo.NguoiDung set taiKhoan=?, matKhau=?, hoTen=?, dienThoai=?, vaiTro=?, trangThai=? where maNguoiDung=?";
        return JDBCHelper.executeUpdate(sql, t.getTaiKhoan(), t.getMatKhau(), t.getHoTen(), t.getDienThoai(), t.getVaiTro(), t.getTaiKhoan(), t.getMaNguoidung());
    }

    @Override
    public List<NguoiDung> selectAll() {
        String sql = "Select * from dbo.NguoiDung";
        return select(sql);
    }

    @Override
    public List<NguoiDung> select(String sql, Object... args) {
        List<NguoiDung> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    NguoiDung model = readFromResultSet(rs);
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
    public NguoiDung readFromResultSet(ResultSet rs) {
        NguoiDung model = new NguoiDung();
        try {
            model.setMaNguoidung(rs.getString(1));
            model.setTaiKhoan(rs.getString(2));
            model.setMatKhau(rs.getString(3));
            model.setHoTen(rs.getString(4));
            model.setDienThoai(rs.getString(5));
            model.setVaiTro(rs.getString(6));
            model.setTrangThai(rs.getBoolean(7));
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return model;
    }

}
