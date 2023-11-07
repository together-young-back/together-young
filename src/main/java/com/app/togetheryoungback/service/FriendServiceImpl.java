package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.FriendDAO;
import com.app.togetheryoungback.dao.MemberDAO;
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
    private final MemberDAO memberDAO;


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

//    @Override
//    public List<FriendDTO> getSelectAllFriend(Pagination pagination, Search search) {
//        return friendDAO.selectAllFriend(pagination,search);
//    }

    //    친구 검색
    @Override
    public List<FriendDTO> getSearchFriend(Search search) {
        SearchDTO searchDTO = new SearchDTO();
        searchDTO.setSearchFriend(friendDAO.selectDao(search));
//        searchDTO.setSearchFriendTotalCount(friendDAO.selectTotal(search));
        return friendDAO.selectDao(search);
    }

//    @Override
//    public int getTotalFriend(Search search) {
//        return friendDAO.selectTotal(search);
//    }

    //    친구 리스트 목록으로 이동
    @Override
    public List<FriendDTO> getFriend(Long memberId) {
        return friendDAO.findAllFriend(memberId);
    }

    //    친구 리스트  사진 불러오기
    @Override
    public List<FriendDTO> getFriendPhoto(Long memberId) {
        return friendDAO.findFriendPhoto(memberId);
    }

//    친구가 최근 보낸 쪽지 상세보기
    @Override
    public MessageVO getFriendMessage(Long id, Long friendId) {
        return friendDAO.messageSent(id, friendId);
    }

//    친구가 최근 받은 쪽지 상세보기
    @Override
    public MessageVO getFriendReceivedMessage(Long id, Long friendId) {
        return friendDAO.messageReceived(id, friendId);
    }

    @Override
    public MemberVO getFriendInfo(Long id) {
        return memberDAO.bringMemberInfo(id);
    }


}
