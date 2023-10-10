package com.app.togetheryoungback.dao;

import com.app.togetheryoungback.domain.MeetingPostDTO;
import com.app.togetheryoungback.mapper.ScheduleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ScheduleDAO {
    private final ScheduleMapper scheduleMapper;

    //    나의 일정 조회
    public List<MeetingPostDTO> searchMeeting(Long memberId){ return scheduleMapper.selectMeeting(memberId); }
    //    나의 일정 삭제
    public void removeMeeting(Long postId){scheduleMapper.deleteMeeting(postId);}
}
