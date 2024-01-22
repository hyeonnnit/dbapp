package dao;

import model.Account;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BankDAOTest {
    @Test
    public void deleteByNumber_test(){
        int number = 5;
        BankDAO dao = new BankDAO();
        int result = dao.deleteByNumber(number);
        if (result==1){
            System.out.println("delete success");
        }else if (result==0){
            System.out.println(number+"is unknown");
        }else {
            System.out.println("delete fail");
        }
    }
    @Test
    public void insert_test(){
        String password = "0000";
        int balance = 4500;
        BankDAO dao = new BankDAO();
        int result = dao.insert(password,balance);
        if (result==1){
            System.out.println("insert success");
        } else if (result==0) {
            System.out.println("insert unknown");
        }else {
            System.out.println("insert fail");
        }
    }
    @Test
    public void updateByNumber_test(){
        int balance = 8000;
        int number = 7;
        BankDAO dao = new BankDAO();
        int result = dao.updateByNumber(balance,number);
        if (result==1){
            System.out.println("update success");
        }else if (result==0){
            System.out.println(number+"is unknown");
        }else {
            System.out.println("update fail");
        }
    }
    @Test
    public void selectByNumber_test(){
        int number = 7;
        BankDAO dao = new BankDAO();
        Account account = dao.selectByNumber(number);
        if (account==null){
            System.out.println(number+"is unknown");
        }else {
            System.out.println(account);
        }
    }
    @Test
    public void selectAll_test(){
        BankDAO dao = new BankDAO();
        List<Account> accountList = dao.selectAll();
        System.out.println(accountList);
    }
}
