package com.springboot.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED) //파라미터가 없는 기본 생성자를 생성하고 접근 제어자를 protected로 지정
@AllArgsConstructor
@Getter
@Entity //JPA가 관리하는 entity로 지정
public class Member {
    
    // id는 DB 테이블의 id 컬럼과 매칭
    // name은 DB 테이블의 name 컬럼과 매칭
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본키 Auto_increment로 지정
    @Column(name="id", updatable = false)
    private Long id;

    @Column(name="name", nullable = false) //Member 테이블의 name 컬럼에 매핑하고 그 컬럼의 NUll 허용하지 않음으로 지정
    private String name;
}
