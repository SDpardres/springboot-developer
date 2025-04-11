package com.springboot.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestService {

    @Autowired
    private MemberRepository memberRepository;  //빈 주입

    public void test(){
        //1. 생성(create)
        //save() 호출하여 데이터 객체 저장
        memberRepository.save(new Member(1L, "A"));

        //2. 조회(read)
        //findById : 한 개의 레코드 조회, findAll : 전체 조회
        Optional<Member> member = memberRepository.findById(1L);
        List<Member> members = memberRepository.findAll();

        //3. 삭제(Delete)
        memberRepository.deleteById(1L);
    }

    public List<Member> getAllMembers() {//맴버 목록 얻는 메서드
        return memberRepository.findAll();
    }
}
