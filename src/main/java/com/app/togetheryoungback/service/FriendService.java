package com.app.togetheryoungback.service;

import com.app.togetheryoungback.domain.*;

import java.util.List;
import java.util.Optional;

public interface FriendService {
//    친구 추가
    public void insert(FriendVO friendVO);

//    친구 삭제
    public void delete(Long id);

//    //   친구 전체 목록 조회
//    public List<FriendDTO> getSelectAllFriend(Pagination pagination,Search search);

//    친구 검색
    public List<FriendDTO> getSearchFriend(Search search);

//    //    친구 전체 개수
//    public int getTotalFriend(Search search);

//    친구 리스트 목록으로 이동
    public List<FriendDTO> getFriend(Long memberId);

    //    친구 리스트  사진 불러오기
    public List<FriendDTO> getFriendPhoto(Long memberId);

//    친구가 최근 보낸 쪽지 상세보기
    public MessageVO getFriendMessage(Long id, Long friendId);


//    친구가 최근 받은 쪽지 상세보기
    public MessageVO getFriendReceivedMessage(Long id, Long friendId);

//    친구 vo가지고 오기 friend/message
    public MemberVO getFriendInfo(Long id);
}
