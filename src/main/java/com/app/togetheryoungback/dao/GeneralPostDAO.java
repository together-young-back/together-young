package com.app.togetheryoungback.dao;

import com.app.togetheryoungback.mapper.GeneralPostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class GeneralPostDAO {
    private final GeneralPostMapper generalPostMapper;

    //    작성한 일반 게시글 갯수 조회
    public int selectCountByMemberId(Long memberId) {
        return generalPostMapper.selectCountByMemberId(memberId);
    }
}
