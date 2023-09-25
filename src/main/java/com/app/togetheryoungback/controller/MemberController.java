package com.app.togetheryoungback.controller;

import com.app.togetheryoungback.domain.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/member/*")
public class MemberController {
    // 로그인 페이지로 이동
    @GetMapping("login")
    public void goToLoginForm(MemberVO memberVO){;}

    // 마이페이지로 이동
    @GetMapping("my-page")
    public void goToMyPage(){;}

    // 북마크로 이동
    @GetMapping("bookmark")
    public void goToBookmark(){;}

    // 나의 일정으로 이동
    @GetMapping("my-schedule")
    public void goToMySchedule(){;}

}
