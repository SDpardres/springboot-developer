package com.springboot.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    private MemberRepository memberRepository;  //빈 주입

    public List<Member> getAllMembers() {//맴버 목록 얻는 메서드
        return memberRepository.findAll();
    }
}
