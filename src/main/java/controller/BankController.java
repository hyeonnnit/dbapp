package controller;

import dao.BankDAO;
import lombok.AllArgsConstructor;

/**
 * 책임: 유효성검사(바디데이터), 파싱(바디데이터), 적절한 DAO 찾기
 */
@AllArgsConstructor
public class BankController {
    private BankDAO dao;
    public void insert(){
        // 1. 파싱
        // 2. 유효성검사
        // 2. DAO 찾기
        System.out.println("controller:insert");
        dao.insert("1324",1000);
    }
    public void delete(){
        System.out.println("controller:delete");
        dao.deleteByNumber(4);
    }
    public void update(){
        System.out.println("controller:update");
        dao.updateByNumber(5000,9);
    }
    public void selectOne(){
        System.out.println("controller:selectOne");
        dao.selectByNumber(8);

    }
    public void selectAll(){
        System.out.println("controller:selectAll");
        dao.selectAll();
    }
}
