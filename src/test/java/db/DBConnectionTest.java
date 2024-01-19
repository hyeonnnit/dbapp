package db;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTest {
    // 리턴타입을 적을 수 없다.
    // 매개변수를 적을 수 없다.
    // @Test 붙이면 메소드 별로 실행 가능
    @Test
    public void getInstance_test(){
        String username = "root";
        String password = "1234";
        String url = "jdbc:mariadb://localhost:3306/cosdb";

        // check할 수 있는 try-catch
        try {
            // 프로토콜이 적용된 소켓 객체 만드는 법
            Connection conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
