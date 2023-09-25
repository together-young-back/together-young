package com.app.togetheryoungback.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/friend/*")
public class FriendController {

    // 친구 검색으로 이동
    @GetMapping("friend-search")
    public void goToFriendSearchForm(){;}

    // 친구 목록으로 이동
    @GetMapping("friend-list")
    public void goToFriendListForm(){;}

    // 친구 메시지함으로 이동
    @GetMapping("frined-message")
    public void goToFriendMessageForm(){;}

}
