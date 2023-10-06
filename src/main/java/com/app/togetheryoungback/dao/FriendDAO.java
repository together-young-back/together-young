package com.app.togetheryoungback.dao;

import com.app.togetheryoungback.domain.*;
import com.app.togetheryoungback.mapper.FriendMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class FriendDAO {
    private final FriendMapper friendMapper;

//    친구 추가
    public void insertDao(FriendVO friendVO){
        friendMapper.insert(friendVO);
    }

//    친구 삭제
    public void deleteDao(Long id){
        friendMapper.delete(id);
    }

//    친구 검색
    public List<FriendDTO> selectDao(Search search){
        return friendMapper.selectFriend(search);
    }

//    친구 리스트 목록으로 이동
    public List<FriendDTO> findAllFriend(Long memberId){
        return friendMapper.selectAllFriend(memberId);
    }

//    친구가 최근 보낸 쪽지 상세보기
    public MessageSentDTO messageSent(Long messageId){
        return friendMapper.friendSentMessage(messageId);
    }

//    친구가 최근 받은 쪽지 상세보기
    public MessageReceivedDTO messageReceived(Long messageId){
        return friendMapper.friendReceivedMessage(messageId);
    }

}
