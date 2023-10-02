package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.FriendDAO;
import com.app.togetheryoungback.domain.FriendVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

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
    public Optional<FriendVO> seslect(Long id) {
        return friendDAO.selectDao(id);
    }
}
