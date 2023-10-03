package com.app.togetheryoungback.dao;

import com.app.togetheryoungback.mapper.MeetingPostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MeetingPostDAO {
    private final MeetingPostMapper meetingPostMapper;

    //    작성한 일반 게시글 갯수 조회
    public int selectCountByMemberId(Long memberId) {
        return meetingPostMapper.selectCountByMemberId(memberId);
    }
}
