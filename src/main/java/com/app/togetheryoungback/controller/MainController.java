package com.app.togetheryoungback.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/")
public class MainController {

    // 메인 페이지
    @GetMapping
    public String goToMainForm() {
        return "/main/main";
    }

    @GetMapping("/main/main")
    public void goToMainPage(){;}

    //  전체 조회수 상위 중 일반 게시글 가지고 오기 (미완성)

    //  전체 조회수 상위 중 모임 게시글 가지고 오기 (미완성)
}
