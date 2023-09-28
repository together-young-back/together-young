package com.app.togetheryoungback.service;

import com.app.togetheryoungback.domain.MemberVO;
import com.app.togetheryoungback.domain.MessageReceivedDTO;
import com.app.togetheryoungback.domain.MessageSentDTO;
import com.app.togetheryoungback.domain.MessageVO;

import java.util.List;

public interface MessageService {
    // 메시지 작성
    public void write(MessageVO messageVO);

    //    메시지 작성시 받은 메시지함 등록
    public void setReceived(Long messageId);

    //    메시지 작성시 보낸 메시지함 등록
    public void setSent(Long messageId);

    // 받은 메시지 목록
    public List<MessageReceivedDTO> getMessagesReceived();

    // 보낸 메시지 목록
    public List<MessageSentDTO> getMessagesSent();
}
