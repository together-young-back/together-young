package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.MessageDAO;
import com.app.togetheryoungback.domain.MessageDTO;
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
    public void write(MessageDTO messageDTO) {
        //    메시지 작성시 닉네임으로 Id 조회해서 지역 변수에 담기
        Long memberReceivedId = getIdByNickname(messageDTO.getMemberNickname());
        //    지역 변수로 메시지VO를 만들고 messageDTO에 담긴 필요 정보를 받아옴
        MessageVO messageVO = new MessageVO();
        messageVO.setMemberSentId(messageDTO.getMemberSentId());
        //    서비스에서 memberNickname으로 조회한 Id값을 담아줌
        messageVO.setMemberReceivedId(memberReceivedId);
        messageVO.setMessageTitle(messageDTO.getMessageTitle());
        messageVO.setMessageContent(messageDTO.getMessageContent());

        //  메시지 작성
        messageDAO.send(messageVO);
        //    방금 작성된 메시지 Id 조회해서 지역 변수에 담기
        Long insertedMessageId = getInsertedMessageId();
        //  작성된 메시지 Id를 받은 메시지함에 등록
        setReceived(insertedMessageId);
        //  작성된 메시지 Id를 보낸 메시지함에 등록
        setSent(insertedMessageId);
    }

    //    메시지 작성시 닉네임으로 Id 조회
    @Override
    public Long getIdByNickname(String memberNickname) {
        return messageDAO.findIdByNickname(memberNickname);
    }

    //    방금 작성된 메시지 Id 조회
    @Override
    public Long getInsertedMessageId() {
        return messageDAO.findInsertedMessageId();
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

    //    메시지 삭제시 메시지 객체 불러오기
    @Override
    public MessageDTO getMessage(Long messageId) {
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
//        update(messageId);
//        if(getMessage(messageId).getMessageDeleteStatus() == 2){
//            delete(messageId);
//        }
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
//        update(messageId);
//        if(getMessage(messageId).getMessageDeleteStatus() == 2){
//            delete(messageId);
//        }
    }


//    //    메시지 삭제는 데이터 관리 및 기타 이유로 기능 삭제
//    @Override
//    public void delete(Long messageId) {
//        messageDAO.deleteMessage(messageId);
//    }

//    //    메시지 삭제 카운트 증가
//    public void update(Long messageId){
//        messageDAO.updateMessage(messageId);
//    }

}