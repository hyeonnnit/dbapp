package dao;

import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

// DAO - Data Access Object
// SRP - 단일책임의 원칙
public class BankDAO {

    public int deleteByNumber(int number){
        Connection conn = DBConnection.getInstance();
        try {
            String sql = "delete from account_tb where number = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,number);
            int num = pstmt.executeUpdate();
            return num;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public int insert(String password, int balance){
        Connection conn = DBConnection.getInstance();
        try {
            String sql = "insert into account_tb(password, balance, created_at) values(?,?,now())";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,password);
            pstmt.setInt(2,balance);
            int num = pstmt.executeUpdate();
            return num;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public int updateByNumber(int balance, int number){
        Connection conn = DBConnection.getInstance();
        try {
            String sql = "update account_tb set balance = ? where number = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,balance);
            pstmt.setInt(2,number);
            int num = pstmt.executeUpdate();
            return num;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
    public void selectByNumber(){

    }
    public void selectAll(){

    }
}
