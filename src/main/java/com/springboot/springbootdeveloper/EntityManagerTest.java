package com.springboot.springbootdeveloper;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EntityManagerTest {

    @Autowired
    EntityManager entityManager;

    public void test() {
        //1. 엔티티 매니저가 엔티티를 관리하지 않는 상태
        Member member = new Member(1L, "ABC");

        //2. 엔티티가 관리 상태가 됨
        entityManager.persist(member);

        //3. 엔티티 객체가 분리상태가 됨
        entityManager.detach(member);

        //4. 엔티티 객체가 삭제된 상태가 됨
        entityManager.remove(member);
    }
}
