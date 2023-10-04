package com.app.togetheryoungback.mapper;

import com.app.togetheryoungback.domain.MessageDTO;
import com.app.togetheryoungback.domain.MessageReceivedDTO;
import com.app.togetheryoungback.domain.MessageSentDTO;
import com.app.togetheryoungback.domain.MessageVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//메시지 Mapper
public interface MessageMapper {
    //    메시지 작성
    public void insert(MessageVO messageVO);

    //    메시지 작성시 닉네임으로 Id 조회
    public Long selectIdByNickname(String memberNickname);

    //    방금 작성된 메시지 Id 조회
    public Long selectInsertedMessageId();

    //    메시지 작성시 받은 메시지함 등록
    public void insertReceived(Long messageId);

    //    메시지 작성시 보낸 메시지함 등록
    public void insertSent(Long messageId);

    //    메시지 객체 불러오기
    public MessageDTO select(Long messageId);

    //    받은 메시지 목록
    public List<MessageReceivedDTO> selectAllReceived(Long memberId);

    //    받은 메시지 상세보기
    public MessageReceivedDTO selectReceived(Long messageId);

    //    받은 메시지 삭제
    public void deleteReceived(Long messageId);


    //    보낸 메시지 목록
    public List<MessageSentDTO> selectAllSent(Long memberId);

    //    보낸 메시지 상세보기
    public MessageSentDTO selectSent(Long messageId);

    //    보낸 메시지 삭제
    public void deleteSent(Long messageId);


    //    메시지 삭제
    public void delete(Long messageId);

    //    메시지 삭제 카운트 증가
    public void update(Long messageId);

}