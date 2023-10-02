package com.app.togetheryoungback.dao;

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

    //    메시지 작성시 받은 메시지함 등록
    public void sendReceived(Long messageId){
        messageMapper.insertReceived(messageId);
    }

    //    메시지 작성시 보낸 메시지함 등록
    public void sendSent(Long messageId){
        messageMapper.insertSent(messageId);
    }

    //    받은 메시지 목록
    public List<MessageReceivedDTO> findAllReceived(Long id){
        return messageMapper.selectAllReceived(id);
    }

    //    보낸 메시지 목록
    public List<MessageSentDTO> findAllSent(Long id){
        return messageMapper.selectAllSent(id);
    }

    //    메시지 상세보기
    public MessageVO findMessage(Long messageId) { return messageMapper.select(messageId);}

    //    메시지 삭제
    public void deleteMessage(Long messageId){
        messageMapper.delete(messageId);
    }
}
