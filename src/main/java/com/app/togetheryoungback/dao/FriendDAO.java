package com.app.togetheryoungback.dao;

import com.app.togetheryoungback.domain.FriendVO;
import com.app.togetheryoungback.mapper.FriendMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

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
    public Optional<FriendVO> selectDao(Long id){
        return friendMapper.select(id);
    }
}
