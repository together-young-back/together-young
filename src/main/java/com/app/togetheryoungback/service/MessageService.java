package com.app.togetheryoungback.service;

import com.app.togetheryoungback.domain.MessageReceivedDTO;
import com.app.togetheryoungback.domain.MessageSentDTO;
import com.app.togetheryoungback.domain.MessageVO;

import java.util.List;

public interface MessageService {
    //    메시지 작성
    public void write(MessageVO messageVO);

    //    메시지 작성시 받은 메시지함 등록
    public void setReceived(Long messageId);

    //    메시지 작성시 보낸 메시지함 등록
    public void setSent(Long messageId);

    //    메시지 객체 불러오기
    public MessageVO getMessage(Long messageId);

    //    받은 메시지 목록
    public List<MessageReceivedDTO> getMessagesReceived(Long memberId);

    //    받은 메시지 상세보기
    public MessageReceivedDTO getMessageReceived(Long messageId);

    //    받은 메시지 삭제
    public void deleteReceived(Long messageId);


    //    보낸 메시지 목록
    public List<MessageSentDTO> getMessagesSent(Long memberId);

    //    메시지 상세보기
    public MessageSentDTO getMessageSent(Long messageId);

    //    보낸 메시지함에서 메시지 삭제
    public void deleteSent(Long messageId);


    //    메시지 삭제
    public void delete(Long messageId);

    //    메시지 삭제 카운트 증가
    public void update(Long messageId);

}
