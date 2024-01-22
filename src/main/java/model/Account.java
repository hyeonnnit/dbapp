package model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

// DB에 select 한 데이터를 담기 위한 오브젝트
@Getter
@Setter
public class Account {
    private int number;
    private String password;
    private int balance;
    private Timestamp createdAt; // java.sql의 Timestamp, 카멜표기법 사용하기

}
