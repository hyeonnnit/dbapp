package model;

import dao.BankDAO;
import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 계좌번호를 입력하세요: ");
        int number = sc.nextInt();
        BankDAO dao = new BankDAO();
        dao.deleteByNumber(number);
    }
}

