package com.app.togetheryoungback.mapper;

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

    //    메시지 작성시 받은 메시지함 등록
    public void insertReceived(Long messageId);

    //    메시지 작성시 보낸 메시지함 등록
    public void insertSent(Long messageId);

    //    받은 메시지 목록
    public List<MessageReceivedDTO> selectAllReceived(Long id);

    //    보낸 메시지 목록
    public List<MessageSentDTO> selectAllSent(Long id);

    //    메시지 상세보기
    public MessageVO select(Long messageId);

    //    메시지 삭제
    public void delete(Long messageId);
}
