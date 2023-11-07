package com.app.togetheryoungback.mapper;

import com.app.togetheryoungback.domain.GeneralPostDTO;
import com.app.togetheryoungback.domain.MeetingPostDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {
// 일반 게시글 총 개수
    public int countGeneralPost();

// 모인 게시글 총 개수
    public int countMeetingPost();

//    조회수 TOP 일반 게시글
    public List<GeneralPostDTO> viewTopGeneralPost();

//    조회수 TOP 만남 게시글
    public List<MeetingPostDTO> viewTopMeetingPost();
}
