package com.springboot.springbootdeveloper.repository;

import com.springboot.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
    //JpaRepository 클래스 상속받을 때 엔티티 Artilce과 엔티티의 PK 타입을 인수로 사용
    //이 레포지토리 사용 시 JpaRepository에서 제공하는 여러 메서드를 사용할 수 있음
}
