package com.app.togetheryoungback.controller;

import com.app.togetheryoungback.domain.MessageReceivedDTO;
import com.app.togetheryoungback.domain.MessageSentDTO;
import com.app.togetheryoungback.domain.MessageVO;
import com.app.togetheryoungback.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/message/*")
public class MessageController {
    private final MessageService messageService;

    // 메시지 작성으로 이동
    @GetMapping("write")
    public void goToMessageWriteForm(MessageVO messageVO){;}
    // 작성 후 보낸 메시지함으로 이동
    @PostMapping("sent")
    public RedirectView write(MessageVO messageVO){
        messageService.write(messageVO);
        return new RedirectView("sent");
    }

    // 받은 메시지 목록으로 이동
    @GetMapping("received")
    public List<MessageReceivedDTO> goToReceivedMessagesForm(Long id){
        return messageService.getMessagesReceived(id);
    }

    // 보낸 메시지 목록으로 이동
    @GetMapping("sent")
    public List<MessageSentDTO> goToSentMessagesForm(Long id){
        return messageService.getMessagesSent(id);
    }

    // 메시지 상세보기로 이동
    @GetMapping("detail")
    public MessageVO goToMessageDetailForm(Long messageId){
        return messageService.getMessage(messageId);
    }

    //    메시지 삭제
//    @DeleteMapping()

}
