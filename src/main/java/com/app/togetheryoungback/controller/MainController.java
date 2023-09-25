package com.app.togetheryoungback.controller;

import com.app.togetheryoungback.domain.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/main/*")
public class MainController {

    // 메인 페이지로 이동
    @GetMapping("main")
    public void goToMainForm(){;}

    // 통합 검색창으로 이동
    @GetMapping("search")
    public void goToSearchForm(){;}

}
