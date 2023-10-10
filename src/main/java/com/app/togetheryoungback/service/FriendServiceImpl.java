package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.FriendDAO;
import com.app.togetheryoungback.domain.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class FriendServiceImpl implements FriendService {
    private final FriendDAO friendDAO;


//    친구 추가
    @Override
    public void insert(FriendVO friendVO) {
        friendDAO.insertDao(friendVO);
    }

//    친구 삭제
    @Override
    public void delete(Long id) {
        friendDAO.deleteDao(id);
    }

//    친구 검색
    @Override
    public List<FriendDTO> getSearchFriend(Search search) {
        return friendDAO.selectDao(search);
    }

//    친구 리스트 목록으로 이동
    @Override
    public List<FriendDTO> getFriend(Long memberId) {
        return friendDAO.findAllFriend(memberId);
    }

//    친구가 최근 보낸 쪽지 상세보기
    @Override
    public MessageSentDTO getFriendMessage(Long messageId) {
        return friendDAO.messageSent(messageId);
    }

//    친구가 최근 받은 쪽지 상세보기
    @Override
    public MessageReceivedDTO getFriendReceivedMessage(Long messageId) {
        return friendDAO.messageReceived(messageId);
    }
}
