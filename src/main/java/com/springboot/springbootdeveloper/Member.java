package com.springboot.springbootdeveloper;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Entity
public class Member {
    
    // id는 DB 테이블의 id 컬럼과 매칭
    // name은 DB 테이블의 name 컬럼과 매칭
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", updatable = false)
    private Long id;

    @Column(name="name", nullable = false)
    private String name;
}
