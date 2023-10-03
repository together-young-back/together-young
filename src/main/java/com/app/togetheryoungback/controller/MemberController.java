package com.app.togetheryoungback.controller;

import com.app.togetheryoungback.domain.MemberVO;
import com.app.togetheryoungback.service.GeneralPostService;
import com.app.togetheryoungback.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/member/*")
public class MemberController {
    private final MemberService memberService;
    private final GeneralPostService generalPostService;

    // 로그인 페이지로 이동
    @GetMapping("login")
    public void goToLoginForm(MemberVO memberVO) {
        ;
    }

    // 마이페이지로 이동
    @GetMapping("my-page")
    public void goToMyPage(MemberVO memberVO, HttpSession session, Model model) {
        if (session.getAttribute("member") != null) {
            MemberVO sessionMemberVO = (MemberVO) session.getAttribute("member");
            int postCount = generalPostService.bringCountOfGeneralPost(sessionMemberVO.getId());
            log.info(String.valueOf(postCount));

            model.addAttribute("postCount", postCount);
        }
    }


    @PostMapping("update-tel")
    public RedirectView updatePhoneNumber(@RequestParam("memberTel") String memberTel, HttpSession session) {
        // 세션에서 MemberVO 객체 가져오기
        MemberVO sessionMemberVO = (MemberVO) session.getAttribute("member");

        // memberTel 필드 수정
        if (memberTel.isEmpty()) {
            // 입력값이 비어있을경우 null처리
            sessionMemberVO.setMemberTel(null);
        } else {
            sessionMemberVO.setMemberTel(memberTel);
        }

        // 수정된 MemberVO 객체를 다시 세션에 저장
        session.setAttribute("member", sessionMemberVO);

        // 세션에서 ID 불러오기
        Long id = sessionMemberVO.getId();

        memberService.saveTel(memberTel, id);

        return new RedirectView("/member/my-page");
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

    @GetMapping("logout")
    public RedirectView logout(HttpSession session) {
        session.invalidate();
        return new RedirectView("/member/login");
    }
}
