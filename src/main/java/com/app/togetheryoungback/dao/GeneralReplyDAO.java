package com.app.togetheryoungback.dao;

import com.app.togetheryoungback.mapper.GeneralReplyMapper;
import com.app.togetheryoungback.mapper.MeetingPostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class GeneralReplyDAO {
    private final GeneralReplyMapper generalReplyMapper;

    //    작성한 일반 게시글 갯수 조회
    public int selectCountByMemberId(Long memberId) {
        return generalReplyMapper.selectCountByMemberId(memberId);
    }
}
