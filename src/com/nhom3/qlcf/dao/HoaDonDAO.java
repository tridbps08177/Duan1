/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.dao;

import com.nhom3.qlcf.helper.JDBCHelper;
import com.nhom3.qlcf.model.HoaDon;
import com.nhom3.qlcf.model.KhachHang;
import com.nhom3.qlcf.model.NguoiDung;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kanbi
 */
public class HoaDonDAO implements DAO<HoaDon> {

    @Override
    public boolean insert(HoaDon t) {
        String sql = "Insert dbo.Hoadon values (?,?,?,?,?,?,?)";
        return JDBCHelper.executeUpdate(sql, t.getMaHoaDon(), t.getMaNguoiDung().getMaNguoidung(), t.getMaKhachHang().getMakh(), t.getChietKhau(), t.getNgayHD(), t.getTongTien(), t.isTrangThai());
    }

    @Override
    public boolean delete(HoaDon t) {
        String sql = "Delete from dbo.HoaDon where maHD=?";
        return JDBCHelper.executeUpdate(sql, t.getMaHoaDon());
    }

    @Override
    public boolean update(HoaDon t) {
        String sql = "Update dbo.HoaDon set maNguoiDung=?, maKH=?, chietKhau=?, ngayHD=?, tongTien=?, trangThai=? where maHD=?";
        return JDBCHelper.executeUpdate(sql, t.getMaNguoiDung().getMaNguoidung(), t.getMaKhachHang().getMakh(), t.getChietKhau(), t.getNgayHD(), t.getTongTien(), t.isTrangThai(), t.getMaHoaDon());
    }

    @Override
    public List<HoaDon> selectAll() {
        String sql = "Select * from dbo.HoaDon";
        return select(sql);
    }

    @Override
    public List<HoaDon> select(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDon model = readFromResultSet(rs);
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
    public HoaDon readFromResultSet(ResultSet rs) {
        HoaDon model = new HoaDon();
        try {
            model.setMaHoaDon(rs.getString(1));

            NguoiDung nd = new NguoiDung();
            nd.setMaNguoidung(rs.getString(2));
            model.setMaNguoiDung(nd);

            KhachHang kh = new KhachHang();
            kh.setMakh(rs.getString(3));
            model.setMaKhachHang(kh);

            model.setChietKhau(rs.getDouble(4));
            model.setNgayHD(rs.getDate(5));
            model.setTongTien(rs.getDouble(6));
            model.setTrangThai(rs.getBoolean(7));
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return model;
    }

}
