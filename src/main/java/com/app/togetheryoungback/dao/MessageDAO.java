package com.app.togetheryoungback.dao;

import com.app.togetheryoungback.domain.MessageDTO;
import com.app.togetheryoungback.domain.MessageReceivedDTO;
import com.app.togetheryoungback.domain.MessageSentDTO;
import com.app.togetheryoungback.domain.MessageVO;
import com.app.togetheryoungback.mapper.MessageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MessageDAO {
    private final MessageMapper messageMapper;

    //    메시지 작성
    public void send(MessageVO messageVO){
        messageMapper.insert(messageVO);
    }

    //    메시지 작성시 닉네임으로 Id 조회
    public Long findIdByNickname(String memberNickname){
        return messageMapper.selectIdByNickname(memberNickname);
    }

    //    방금 작성된 메시지 Id 조회
    public Long findInsertedMessageId(){
        return messageMapper.selectInsertedMessageId();
    }

    //    메시지 작성시 받은 메시지함 등록
    public void sendReceived(Long messageId){
        messageMapper.insertReceived(messageId);
    }

    //    메시지 작성시 보낸 메시지함 등록
    public void sendSent(Long messageId){
        messageMapper.insertSent(messageId);
    }

    //    메시지 객체 불러오기
    public MessageDTO selectMessage(Long messageId){
        return messageMapper.select(messageId);
    }

    //    받은 메시지 목록
    public List<MessageReceivedDTO> findAllReceived(Long memberId){
        return messageMapper.selectAllReceived(memberId);
    }

    //    받은 메시지 상세보기
    public MessageReceivedDTO findMessageReceived(Long messageId) { return messageMapper.selectReceived(messageId);}

    //    받은 메시지 삭제
    public void deleteReceivedMessage(Long messageId){
        messageMapper.deleteReceived(messageId);
    }


    //    보낸 메시지 목록
    public List<MessageSentDTO> findAllSent(Long memberId){
        return messageMapper.selectAllSent(memberId);
    }

    //    보낸 메시지 상세보기
    public MessageSentDTO findMessageSent(Long messageId) { return messageMapper.selectSent(messageId);}

    //    보낸 메시지 삭제
    public void deleteSentMessage(Long messageId){
        messageMapper.deleteSent(messageId);
    }

    //    메시지 전체 삭제 (회원 탈퇴시)
    public void deleteAllMessages(Long memberId) {
        messageMapper.deleteAll(memberId);
    }

//    //    메시지 삭제
//    public void deleteMessage(Long messageId){
//        messageMapper.delete(messageId);
//    }

//    //    메시지 삭제 카운트 증가
//    public void updateMessage(Long messageId){
//        messageMapper.update(messageId);
//    }

}