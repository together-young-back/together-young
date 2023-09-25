package com.app.togetheryoungback.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/meeting-community/*")
public class MeetingCommunityController {

    // 모임 게시판으로 이동
    @GetMapping("community")
    public void goToMeetingCommunityForm(){;}

    // 모임 게시글 상세보기로 이동
    @GetMapping("post")
    public void goToMeetingPostForm(){;}

    // 모임 게시글 작성으로 이동
    @GetMapping("write")
    public void goToMeetingWriteForm(){;}

    // 모임 게시글 수정으로 이동
    @GetMapping("edit")
    public void goToMeetingEditForm(){;}

}
