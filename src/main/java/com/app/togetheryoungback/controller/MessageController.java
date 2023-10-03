package com.app.togetheryoungback.controller;

import com.app.togetheryoungback.domain.MemberVO;
import com.app.togetheryoungback.domain.MessageReceivedDTO;
import com.app.togetheryoungback.domain.MessageSentDTO;
import com.app.togetheryoungback.domain.MessageVO;
import com.app.togetheryoungback.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;
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
    @PostMapping("write")
    public RedirectView write(MessageVO messageVO, HttpSession session){
        messageVO.setMemberSentId(((MemberVO)session.getAttribute("member")).getId());
        messageService.write(messageVO);
        return new RedirectView("sent");
    }

    // 받은 메시지 목록으로 이동
    @GetMapping("received")
    public List<MessageReceivedDTO> goToReceivedMessagesForm(HttpSession session){
        MemberVO memberVO = (MemberVO) session.getAttribute("member");
        Long memberId = memberVO.getId();
        return messageService.getMessagesReceived(memberId);
    }

    // 받은 메시지 상세보기로 이동
    @GetMapping("received-detail")
    public MessageReceivedDTO goToMessageReceivedDetail(Long messageId){
        return messageService.getMessageReceived(messageId);
    }

    //    받은 메시지 삭제
    @DeleteMapping("received-detail")
    public RedirectView deleteReceivedMessage(Long messageId){
        messageService.deleteReceived(messageId);
        return new RedirectView("received");
    }

    //    보낸 메시지 목록으로 이동
    @GetMapping("sent")
    public List<MessageSentDTO> goToSentMessagesForm(HttpSession session){
        MemberVO memberVO = (MemberVO) session.getAttribute("member");
        Long memberId = memberVO.getId();
        return messageService.getMessagesSent(memberId);
    }

    // 보낸 메시지 상세보기로 이동
    @GetMapping("sent-detail")
    public MessageSentDTO goToMessageSentDetail(Long messageId){
        return messageService.getMessageSent(messageId);
    }

    //    보낸 메시지 삭제
    @DeleteMapping("sent-detail")
    public RedirectView deleteSentMessage(Long messageId){
        messageService.deleteSent(messageId);
        return new RedirectView("sent");
    }

}

