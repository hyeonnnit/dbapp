package model;

import dao.BankDAO;
import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // http://bank.com/account GET
        // http://bank.com/account POST
        // http://bank.com/account/1 DELETE
        // http://bank.com/account/1 PUT
        System.out.print("메소드 입력: ");
        String method = sc.nextLine();
        System.out.print("식별자 입력: ");
        String action = sc.nextLine();
        String body = "";
        BankDAO bankDAO = new BankDAO();
        if (method.equals("GET")){
            if (action.equals("/account")){
                List<Account> accountList = bankDAO.selectAll();
                System.out.println(accountList);
            }else if (action.equals("/account/3")){
                Account account = bankDAO.selectByNumber(3);
                System.out.println(account);
            }
        } else if (method.equals("POST")) {
            System.out.print("body data insert: ");
            body = sc.nextLine();
            String[] st1 = body.split("&");
            String password = st1[0].split("=")[1];
            int balance = Integer.parseInt(st1[1].split("=")[1]);
            if (action.equals("/account")){
                bankDAO.insert(password,balance);
            }
        } else if (method.equals("PUT")) {

        } else if (method.equals("DELETE")) {

        }
    }
}

