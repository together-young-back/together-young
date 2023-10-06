package com.app.togetheryoungback.mapper;

import com.app.togetheryoungback.domain.FriendDTO;
import com.app.togetheryoungback.domain.FriendVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
//친구 Mapper
public interface FriendMapper {
    //    친구 추가
    public void insert(FriendVO friendVO);

    //    친구 삭제
    public void delete(Long id);

    //    친구 검색
    public Optional<FriendVO> select(Long id);

    //    친구 리스트 목록으로 이동
    public List<FriendDTO> selectAllFriend(Long memberId);


}
