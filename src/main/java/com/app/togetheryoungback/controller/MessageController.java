package com.app.togetheryoungback.controller;

import com.app.togetheryoungback.domain.MessageVO;
import com.app.togetheryoungback.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/message/*")
public class MessageController {
    private final MessageService messageService;

    // 메시지 목록으로 이동
    @GetMapping("list")
    public void goToMessageListForm(){;}

    // 메시지 작성으로 이동
    @GetMapping("write")
    public void goToMessageWriteForm(MessageVO messageVO){;}
//    @PostMapping("/message/write")
//    public RedirectView write(MessageVO messageVO){
//        messageService.write(messageVO);
//        return new RedirectView("/write/write");
//    }

}
