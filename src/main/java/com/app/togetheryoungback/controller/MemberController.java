package com.app.togetheryoungback.controller;

import com.app.togetheryoungback.domain.MeetingBookmarkDTO;
import com.app.togetheryoungback.domain.MemberVO;
import com.app.togetheryoungback.service.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.coobird.thumbnailator.Thumbnailator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
import javax.swing.text.html.Option;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/member/*")
public class MemberController {
    private final MemberService memberService;
    private final GeneralBookmarkService generalBookmarkService;
    private final MeetingBookmarkService meetingBookmarkService;

    // 로그인 페이지로 이동
    @GetMapping("login")
    public void goToLoginForm(MemberVO memberVO) {
        ;
    }

    // 마이페이지로 이동
    @GetMapping("my-page")
    public void goToMyPage(HttpSession session, Model model) {
        if (session.getAttribute("member") != null) {
            MemberVO memberVO = (MemberVO) session.getAttribute("member");
            Long id = memberVO.getId();
            int postCount = memberService.getAllPostCount(id);
            int replyCount = memberService.getAllReplyCount(id);
            log.info(String.valueOf(postCount));
            log.info(String.valueOf(replyCount));

            model.addAttribute("postCount", postCount);
            model.addAttribute("replyCount", replyCount);
            model.addAttribute("participationCount", memberService.getAllParticipationCount(id));
        }
    }

    // 프로필 사진 카카오톡 외 새로운 사진으로 교체
    // (카카오프로필 사진은 그대로 존재하며 html상에서 카카오프로필 사진과 개인 프로필 사진이 하나씩 있을 경우 둘 중 개인 프로필 사진을 먼저 가져오는 방식.)
    @PostMapping("img-upload")
    public RedirectView upload(@RequestParam("uuid") String uuid, @RequestParam("uploadFile") MultipartFile uploadFile, HttpSession session) throws IOException {
        MemberVO memberVO = (MemberVO) session.getAttribute("member");

        memberVO.setMemberImgName("t_" + uuid + "_" + uploadFile.getOriginalFilename());
        memberVO.setMemberImgPath(getPath());
        session.setAttribute("member", memberVO);
        memberService.saveProfileImg(memberVO);

        return new RedirectView("/member/my-page");
    }

    private String getPath() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }

    @GetMapping("img-delete")
    public RedirectView deleteImg(HttpSession session) {
        MemberVO memberVO = (MemberVO) session.getAttribute("member");
        memberVO.setMemberImgName(null);
        memberVO.setMemberImgPath(null);

        session.setAttribute("member", memberVO);
        memberService.deleteProfileImg(memberVO.getId());

        return new RedirectView("/member/my-page");
    }

    @GetMapping("check-nickname")
    @ResponseBody
    public String checkNickname(@RequestParam("memberNickname") String memberNickname) {
        Optional<String> foundNickname = memberService.findNickname(memberNickname);

        // 이름 찾은 후 못찾으면 true 반환 / 반대의 경우 false 반환
        if (foundNickname.isEmpty()) {
            return "true";
        } else {
            return "false";
        }
    }

    @PostMapping("update-nickname")
    public RedirectView updateNickname(@RequestParam("memberNickname") String memberNickname, HttpSession session){
        MemberVO sessionMemberVO = (MemberVO) session.getAttribute("member");

        sessionMemberVO.setMemberNickname(memberNickname);
        session.setAttribute("member", sessionMemberVO);
        memberService.saveNickname(memberNickname, sessionMemberVO.getId());

        return new RedirectView("/member/my-page");
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

    @GetMapping("withdraw")
    public RedirectView withdraw(HttpSession session, RedirectAttributes redirectAttributes){
        MemberVO sessionVO = (MemberVO) session.getAttribute("member");
        memberService.withdraw(sessionVO.getId());
        session.invalidate();

        redirectAttributes.addFlashAttribute("withdraw", "true");
        return new RedirectView("/member/login");
    }

    // 북마크로 이동
    @GetMapping("bookmark")
    public void goToBookmark(Model model, HttpSession session) {
        MemberVO sessionVO = (MemberVO) session.getAttribute("member");
        model.addAttribute("generalPosts", generalBookmarkService.loadGeneralBookmarks(sessionVO.getId()));
        log.info("결과 = " + meetingBookmarkService.loadMeetingBookmarks(sessionVO.getId()));
        model.addAttribute("meetingPosts", meetingBookmarkService.loadMeetingBookmarks(sessionVO.getId()));
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
