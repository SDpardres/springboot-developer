package com.springboot.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Article {

    @Getter
    @Id //Article 테이블의 기본키로 Auto_increment 옵션 적용
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //해당 필드가 엔티티 업데이트 시에 DB 테이블의 컬럼으로 업데이트 될 수 있는지 여부를 결정
    //false로 설정 시 해당 필드는 업데이트 쿼리에서 제외됨
    @Column(name="id", updatable = false)
    private Long id;

    @Getter
    @Column(name="title", nullable = false)
    private String title;

    @Getter
    @Column(name="content", nullable = false)
    private String content;

    @Builder //빌더 패턴으로 객체 생성
    public Article(String title, String content){
        this.content = content;
        this.title = title;
    }

}
