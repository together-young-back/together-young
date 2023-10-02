package com.app.togetheryoungback.service;

import com.app.togetheryoungback.domain.FriendVO;

import java.util.Optional;

public interface FriendService {
//    친구 추가
    public void insert(FriendVO friendVO);

//    친구 삭제
    public void delete(Long id);

//    친구 검색
    public Optional<FriendVO> seslect(Long id);
}
