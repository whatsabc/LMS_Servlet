package com.lms.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class c3p0Utils {
    private static ComboPooledDataSource ds = new ComboPooledDataSource("myc3p0");

    //取得链接
    public static Connection getConn() {
        try {
            return ds.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static ComboPooledDataSource getDataSource() {
        return ds;
    }

    // 关闭链接
    public static void close(Connection conn) throws SQLException {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw e;
            }
        }
    }
    public static void close(PreparedStatement stat) throws SQLException {
        if(stat!=null){
            stat.close();
        }
    }
    public static void close(ResultSet rs) throws SQLException {
        if(rs!=null){
            rs.close();
        }
    }
}
