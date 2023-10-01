package com.app.togetheryoungback.controller;

import com.app.togetheryoungback.domain.MemberVO;
import com.app.togetheryoungback.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

@Controller
@Slf4j
@RequestMapping("/member/*")
public class MemberController {
    private MemberService memberService;


    // 로그인 페이지로 이동
    @GetMapping("login")
    public void goToLoginForm(MemberVO memberVO) {
        ;
    }

    // 마이페이지로 이동
    @GetMapping("my-page")
    public void goToMyPage(HttpSession session) {
        MemberVO memberVO = new MemberVO();
        memberVO.setId(82L);
        memberVO.setMemberEmail("cnh1234578@gmail.com");
        memberVO.setMemberNickname("yty");
        memberVO.setMemberTel("01036316448");
        memberVO.setMemberKakaoProfileUrl("https://cdn.comento.kr/images/user/profile/pf_LZYbaE58eX.JPG?s=60x60");

        session.setAttribute("member", memberVO);
    }



    @PostMapping("my-page")
    public RedirectView updatePhoneNumber(@RequestParam("memberTel") String memberTel, HttpSession session) {
        MemberVO memberVO = (MemberVO) session.getAttribute("member");

        Long id = memberVO.getId();
        memberService.saveTel(memberTel, id);
        return new RedirectView("member/my-page");
    }

    // 북마크로 이동
    @GetMapping("bookmark")
    public void goToBookmark() {
        ;
    }

    // 나의 일정으로 이동
    @GetMapping("my-schedule")
    public void goToMySchedule() {
        ;
    }

}
