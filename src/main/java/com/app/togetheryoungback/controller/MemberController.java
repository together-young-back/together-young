package com.app.togetheryoungback.controller;

import com.app.togetheryoungback.domain.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@Slf4j
@RequestMapping("/member/*")
public class MemberController {
    // 로그인 페이지로 이동
    @GetMapping("login")
    public void goToLoginForm(MemberVO memberVO){;}

    // 마이페이지로 이동
    @GetMapping("my-page")
    public void goToMyPage(HttpSession session){
        MemberVO memberVO = new MemberVO();
        memberVO.setId(21L);
        memberVO.setMemberEmail("cnh1234578@gmail.com");
        memberVO.setMemberNickname("조남호");
        memberVO.setMemberTel("01036316448");

        session.setAttribute("member", memberVO);
    }

    // 북마크로 이동
    @GetMapping("bookmark")
    public void goToBookmark(){;}

    // 나의 일정으로 이동
    @GetMapping("my-schedule")
    public void goToMySchedule(){;}

}
