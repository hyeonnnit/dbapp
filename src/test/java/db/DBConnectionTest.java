package db;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class DBConnectionTest {
    @Test
    public void getInstance_test(){
        Connection conn = DBConnection.getInstance();
        if (conn == null){
            System.out.println("fail");
        }else {
            System.out.println("success");
        }
    }
}
