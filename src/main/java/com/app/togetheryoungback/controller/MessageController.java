package com.app.togetheryoungback.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/message/*")
public class MessageController {

    // 메시지 목록으로 이동
    @GetMapping("message-list")
    public void goToMessageListForm(){;}

    // 메시지 작성으로 이동
    @GetMapping("message-write")
    public void goToMessageWriteForm(){;}

}
