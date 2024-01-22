package dao;

import org.junit.jupiter.api.Test;


public class BankDAOTest {
    @Test
//    public void deleteByNumber_test(){
//        // given
//        int number = 1;
//        // when
//        BankDAO dao = new BankDAO();
//        int result = dao.deleteByNumber(number);
//        // then
//        if (result == 1){
//            System.out.println("삭제 성공");
//        }else if (result==0){
//            System.out.println(number + "번호를 찾을 수 없습니다.");
//        }else {
//            System.out.println("삭제 실패");
//        }
//    }
//    public void insert_test(){
//        String password = "1234";
//        int balance = 6000;
//        BankDAO dao = new BankDAO();
//        int result = dao.insert(password, balance);
//        if (result == 1){
//            System.out.println("insert access");
//        }else if (result==0){
//            System.out.println("insert unknown");
//        }else {
//            System.out.println("insert fail");
//        }
//    }
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
}
