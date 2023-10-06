package com.app.togetheryoungback.service;

import com.app.togetheryoungback.domain.*;

import java.util.List;
import java.util.Optional;

public interface FriendService {
//    친구 추가
    public void insert(FriendVO friendVO);

//    친구 삭제
    public void delete(Long id);

//    친구 검색
    public List<FriendDTO> getSearchFriend(Search search);

//    친구 리스트 목록으로 이동
    public List<FriendDTO> getFriend(Long memberId);

//    친구가 최근 보낸 쪽지 상세보기
    public MessageSentDTO getFriendMessage(Long messageId);


//    친구가 최근 받은 쪽지 상세보기
    public MessageReceivedDTO getFriendReceivedMessage(Long messageId);
}
