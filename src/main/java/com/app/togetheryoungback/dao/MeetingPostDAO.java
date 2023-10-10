package com.app.togetheryoungback.dao;

import com.app.togetheryoungback.domain.MeetingPostVO;
import com.app.togetheryoungback.mapper.MeetingPostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MeetingPostDAO {
    private final MeetingPostMapper meetingPostMapper;

//    게시글 작성
    public void getInsert(MeetingPostVO meetingPostVO){
        meetingPostMapper.insert(meetingPostVO);
    }

//    게시글 수정
    public void getUpdate(MeetingPostVO meetingPostVO){
        meetingPostMapper.update(meetingPostVO);
    }

//    게시글 목록
    public List<MeetingPostVO> getSelectMemberId(Long memberId){
        return meetingPostMapper.selectMemberId(memberId);
    }

    //    작성한 일반 게시글 갯수 조회
    public int selectCountByMemberId(Long memberId) {
        return meetingPostMapper.selectCountByMemberId(memberId);
    }
}
