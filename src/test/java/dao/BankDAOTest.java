package dao;

import model.Account;
import org.junit.jupiter.api.Test;

import java.util.List;


public class BankDAOTest {
    @Test
    public void deleteByNumber_test(){
        // given
        int number = 1;
        // when
        BankDAO dao = new BankDAO();
        int result = dao.deleteByNumber(number);
        // then
        if (result == 1){
            System.out.println("삭제 성공");
        }else if (result==0){
            System.out.println(number + "번호를 찾을 수 없습니다.");
        }else {
            System.out.println("삭제 실패");
        }
    }
    @Test
    public void insert_test(){
        String password = "4567";
        int balance = 3800;
        BankDAO dao = new BankDAO();
        int result = dao.insert(password, balance);
        if (result == 1){
            System.out.println("insert access");
        }else if (result==0){
            System.out.println("insert unknown");
        }else {
            System.out.println("insert fail");
        }
    }
    @Test
    public void updateByNumber_test(){
        int balance = 4000;
        int number = 2;
        BankDAO dao = new BankDAO();
        int result = dao.updateByNumber(balance, number);
        if (result == 1){
            System.out.println("update success");
        }else if (result==0){
            System.out.println("update fail");
        }else {
            System.out.println("not update");
        }
    }
    @Test
    public void selectByNumber(){
        int number = 4;
        BankDAO dao = new BankDAO();
        Account account = dao.selectByNumber(number);
        if (account == null){
            System.out.println(number+"로 조회된 값이 없습니다.");
        }else {
            System.out.println(account);
//            System.out.println(account.getNumber());
//            System.out.println(account.getPassword());
//            System.out.println(account.getBalance());
//            System.out.println(account.getCreatedAt());
        }
    }
    @Test
    public void selectAll_test(){
        BankDAO dao = new BankDAO();
        List<Account> accountList = dao.selectAll();
        System.out.println(accountList);
    }
}
