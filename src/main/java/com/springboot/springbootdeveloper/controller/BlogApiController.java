package com.springboot.springbootdeveloper.controller;

import com.springboot.springbootdeveloper.domain.Article;
import com.springboot.springbootdeveloper.dto.AddArticleRequest;
import com.springboot.springbootdeveloper.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor //final 혹은 @NotNull이 붙은 필드의 생성자 추가
@RestController //HTTP Response Body에 객체 데이터를 JSON 형식으로 반환하는 컨트롤러
public class BlogApiController {

    private final BlogService blogService;

    //HTTP 메서드가 POST일 때 전달받은 URL와 동잏하면 메서드로 매핑
    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request){
        //요청 본문 값 매핑
        return ResponseEntity.status(HttpStatus.CREATED).body(blogService.save(request));
    }
}

