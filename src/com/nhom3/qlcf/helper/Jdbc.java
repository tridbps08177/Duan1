/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom3.qlcf.helper;

import java.sql.*;

/**
 *
 * @author Le Minh Hung - PS08234
 */
public class Jdbc {
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCF";
    private static String username = "sa";
    private static String password = "123";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }

    // XÂY DỰNG CÂU LỆNH TRUY XUẤT SQL
    public static PreparedStatement prepareStatement(String sql, Object... args) throws SQLException {
        Connection conn = DriverManager.getConnection(url, username, password);
        PreparedStatement pstm = null;
        if (sql.trim().startsWith("{")) {
            pstm = conn.prepareCall(sql);
        } else {
            pstm = conn.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            pstm.setObject(i + 1, args[i]);
        }
        return pstm;
    }

    public static void executeUpdate(String sql, Object... args) {
        try {
            PreparedStatement stm = prepareStatement(sql, args);
            try {
                stm.executeUpdate();
            } finally {
                stm.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ResultSet executeQuery(String sql, Object... args) {
        try {
            PreparedStatement stm = prepareStatement(sql, args);
            return stm.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
   
}
