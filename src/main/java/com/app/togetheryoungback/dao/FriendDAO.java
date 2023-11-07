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

//    //   친구 전체 목록 조회
//    public List<FriendDTO> selectAllFriend(Pagination pagination,Search search){
//        return friendMapper.selectAllFriend(pagination,search);
//    }

//    친구 검색
    public List<FriendDTO> selectDao(Search search){
        return friendMapper.selectFriend(search);
    }

////    친구 전체 개수
//    public int selectTotal(Search search){
//        return friendMapper.selectTotal(search);
//    }

//    친구 리스트 목록으로 이동
    public List<FriendDTO> findAllFriend(Long memberId){
        return friendMapper.selectAllFriend(memberId);
    }

//    친구 리스트  사진 불러오기
    public List<FriendDTO> findFriendPhoto(Long memberId){
        return friendMapper.selectFriendPhoto(memberId);
    }

//    친구가 최근 보낸 쪽지 상세보기
    public MessageVO messageSent(Long id, Long friendId){
        return friendMapper.friendSentMessage(id, friendId);
    }

//    친구가 최근 받은 쪽지 상세보기
    public MessageVO messageReceived(Long id, Long friendId){
        return friendMapper.friendReceivedMessage(id, friendId);
    }

}
