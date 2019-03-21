/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.dao;

import com.nhom3.qlcf.helper.JDBCHelper;
import com.nhom3.qlcf.model.HangHoa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kanbi
 */
public class HangHoaDAO implements DAO<HangHoa> {

    @Override
    public boolean insert(HangHoa t) {
        String sql = "INSERT dbo.HangHoa Values(?,?,?,?,?,?)";

        return JDBCHelper.executeUpdate(sql, t.getMaHangHoa(), t.getTenHangHoa(), t.getDonViTinh(), t.getGiaVon(), t.getMoTa());
    }

    @Override
    public boolean delete(HangHoa t) {
        String sql = "DELETE FROM dbo.HangHoa WHERE maHangHoa=?";
        return JDBCHelper.executeUpdate(sql, t.getMaHangHoa());
    }

    @Override
    public boolean update(HangHoa t) {
        String sql = "UPDATE dbo.HangHoa SET tenHangHoa=?,donViTinh=?,soLuong=?, donGia=?,moTa=? where maHangHoa=?";
        return JDBCHelper.executeUpdate(sql, t.getTenHangHoa(), t.getDonViTinh(), t.getGiaVon(), t.getMoTa(), t.getMaHangHoa());

    }

    @Override
    public List<HangHoa> selectAll() {
        String sql = "Select * from HangHoa";
        return select(sql);
    }

    @Override
    public List<HangHoa> select(String sql, Object... args) {
        List<HangHoa> list = new ArrayList<>();
        try {

            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HangHoa model = readFromResultSet(rs);
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
    public HangHoa readFromResultSet(ResultSet rs) {
        HangHoa model = new HangHoa();
        try {
            model.setMaHangHoa(rs.getString(1));
            model.setTenHangHoa(rs.getString(2));
            model.setDonViTinh(rs.getString(3));
            model.setSoLuong(rs.getInt(4));
            model.setGiaVon(rs.getDouble(5));
            model.setMoTa(rs.getString(6));
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return model;
    }

}
