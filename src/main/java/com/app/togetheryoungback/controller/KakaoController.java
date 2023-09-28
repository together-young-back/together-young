package com.app.togetheryoungback.controller;

import com.app.togetheryoungback.domain.MemberVO;
import com.app.togetheryoungback.service.KaKaoService;
import com.app.togetheryoungback.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class KakaoController {
    private final KaKaoService kaKaoService;
    private final MemberService memberService;

    @GetMapping("/kakao/login")
    public RedirectView login(String code, HttpSession session, RedirectAttributes redirectAttributes){
        Long id = null;
        String token = kaKaoService.getKaKaoAccessToken(code);
        Optional<MemberVO> foundInfo = kaKaoService.getKaKaoInfo(token);
        if(foundInfo.isPresent()){
            memberService.join(foundInfo.get());
            MemberVO memberVO = memberService.findAccount(foundInfo.get().getMemberEmail()).get();
            session.setAttribute("member", memberVO);
            return new RedirectView("/member/mypage");
        }
        return new RedirectView("/member/login");
    }
}
