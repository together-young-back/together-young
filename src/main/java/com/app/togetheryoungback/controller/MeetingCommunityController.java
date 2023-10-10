package com.app.togetheryoungback.controller;

import com.app.togetheryoungback.domain.MeetingPostVO;
import com.app.togetheryoungback.domain.MeetingReplyVO;
import com.app.togetheryoungback.domain.MemberVO;
import com.app.togetheryoungback.service.MeetingPostService;
import com.app.togetheryoungback.service.MeetingReplyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/meeting-community/*")
public class MeetingCommunityController {
    private final MeetingPostService meetingPostService;
    private final MeetingReplyService meetingReplyService;

    // 모임 게시판으로 이동
    @GetMapping("posts")
    public void goToMeetingCommunityForm(){;}

    // 모임 게시글 상세보기로 이동
    @GetMapping("post")
    public void goToMeetingPostForm(MeetingReplyVO meetingReplyVO){;}

    // 모임 게시글 작성으로 이동
    @GetMapping("write")
    public void goToMeetingWriteForm(MeetingPostVO meetingPostVO){;}

//    모임 게시글 작성 완료
    @PostMapping("write")
    public RedirectView postWrite(MeetingPostVO meetingPostVO, HttpSession session){
        MemberVO memberVO = (MemberVO)session.getAttribute("member");
        meetingPostVO.setMemberId(memberVO.getId()); // 모임 게시판 회원 아이디를 가져오고

        meetingPostService.write(meetingPostVO);

        return new RedirectView("/meeting-community/posts");
    }

    // 모임 게시글 수정으로 이동
    @GetMapping("edit")
    public void goToMeetingEditForm(MeetingPostVO meetingPostVO){;}

//    모임 게시글 수정 완료
    @PostMapping("edit")
    public RedirectView goToMeetingEdit(MeetingPostVO meetingPostVO){
        meetingPostService.modify(meetingPostVO);
        return new RedirectView("/meeting-community/posts");
    }



}
