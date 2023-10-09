package com.app.togetheryoungback.service;

import com.app.togetheryoungback.domain.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageService {
    //    메시지 작성
    public void write(MessageDTO messageDTO);

    //    메시지 작성시 닉네임으로 Id 조회
    public Long getIdByNickname(String memberNickname);

    //    방금 작성된 메시지 Id 조회
    public Long getInsertedMessageId();

    //    메시지 작성시 받은 메시지함 등록
    public void setReceived(Long messageId);

    //    메시지 작성시 보낸 메시지함 등록
    public void setSent(Long messageId);

    //    메시지 객체 불러오기
    public MessageDTO getMessage(Long messageId);

    //    받은 메시지 총 개수
    public int getCountOfMessageReceived(Long memberId);

    //    받은 메시지 목록
    public List<MessageReceivedDTO> getMessagesReceived(Pagination pagination, Long memberId);

    //    받은 메시지 상세보기
    public MessageReceivedDTO getMessageReceived(Long messageId);

    //    받은 메시지 삭제
    public void deleteReceived(Long messageId);


    //    보낸 메시지 총 개수
    public int getCountOfMessageSent(Long memberId);

    //    보낸 메시지 목록
    public List<MessageSentDTO> getMessagesSent(Pagination pagination, Long memberId);

    //    메시지 상세보기
    public MessageSentDTO getMessageSent(Long messageId);

    //    보낸 메시지함에서 메시지 삭제
    public void deleteSent(Long messageId);

    //    메시지 전체 삭제 (회원 탈퇴시)
    public void deleteAll(Long memberId);

//    //    메시지 삭제
//    public void delete(Long messageId);

//    //    메시지 삭제 카운트 증가
//    public void update(Long messageId);

}