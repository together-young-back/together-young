package com.app.togetheryoungback.mapper;

import com.app.togetheryoungback.domain.MeetingPostDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScheduleMapper {

//    유저 일정 조회
    public List<MeetingPostDTO> selectMeeting(Long memberId);
//    유저 일정 삭제
    public void deleteMeeting(Long postId);

}
