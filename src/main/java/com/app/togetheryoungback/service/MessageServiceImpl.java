package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.MessageDAO;
import com.app.togetheryoungback.domain.MessageReceivedDTO;
import com.app.togetheryoungback.domain.MessageSentDTO;
import com.app.togetheryoungback.domain.MessageVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class MessageServiceImpl implements MessageService {
    private final MessageDAO messageDAO;

    //    메시지 작성, 받은 메시지함 등록, 보낸 메시지함 등록 등 3개 기능이 메시지 작성 시 동시에 실행
    @Override
    public void write(MessageVO messageVO) {
        //  메시지 작성
        messageDAO.send(messageVO);
        //  메시지 작성시 받은 메시지함 등록 서비스 실행
        setReceived(messageVO.getId());
        //  메시지 작성시 보낸 메시지함 등록 서비스 실행
        setSent(messageVO.getId());
    }

    //    메시지 작성시 받은 메시지함 등록
    @Override
    public void setReceived(Long messageId) {
        messageDAO.sendReceived(messageId);
    }

    //    메시지 작성시 보낸 메시지함 등록
    @Override
    public void setSent(Long messageId) {
        messageDAO.sendSent(messageId);
    }

    //    메시지 객체 불러오기
    @Override
    public MessageVO getMessage(Long messageId) {
        return messageDAO.selectMessage(messageId);
    }


    //    받은 메시지 목록
    @Override
    public List<MessageReceivedDTO> getMessagesReceived(Long memberId) {
        return messageDAO.findAllReceived(memberId);
    }

    //    받은 메시지 상세보기
    @Override
    public MessageReceivedDTO getMessageReceived(Long messageId) {
        return messageDAO.findMessageReceived(messageId);
    }

    //    받은 메시지함에서 메시지 삭제
    @Override
    public void deleteReceived(Long messageId) {
        messageDAO.deleteReceivedMessage(messageId);
        update(messageId);
        if(getMessage(messageId).getMessageDeleteStatus() == 2){
            delete(messageId);
        }
    }


    //    보낸 메시지 목록
    @Override
    public List<MessageSentDTO> getMessagesSent(Long memberId) {
        return messageDAO.findAllSent(memberId);
    }

    //    보낸 메시지 상세보기
    @Override
    public MessageSentDTO getMessageSent(Long messageId) {
        return messageDAO.findMessageSent(messageId);
    }

    //    보낸 메시지함에서 메시지 삭제
    @Override
    public void deleteSent(Long messageId) {
        messageDAO.deleteSentMessage(messageId);
        update(messageId);
        if(getMessage(messageId).getMessageDeleteStatus() == 2){
            delete(messageId);
        }
    }


    //    메시지 삭제
    @Override
    public void delete(Long messageId) {
        messageDAO.deleteMessage(messageId);
    }

    //    메시지 삭제 카운트 증가
    public void update(Long messageId){
        messageDAO.updateMessage(messageId);
    }

}
