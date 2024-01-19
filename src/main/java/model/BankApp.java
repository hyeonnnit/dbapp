package model;

import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankApp {
    public static void main(String[] args) {
        Connection conn = DBConnection.getInstance();
        // buffer-Statement // 버퍼 메세지
        try {
            PreparedStatement pstmt = conn.prepareStatement("insert into account_tb(password, balance, created_at) values(?,?,now())");
            pstmt.setString(1,"1234"); // 1부터 시작
            pstmt.setInt(2,1000);
            int num = pstmt.executeUpdate(); // flush
            System.out.println(num);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
