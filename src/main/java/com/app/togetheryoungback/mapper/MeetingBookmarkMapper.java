package com.app.togetheryoungback.mapper;

import com.app.togetheryoungback.domain.MeetingBookmarkDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//모임 게시글 북마크 Mapper
public interface MeetingBookmarkMapper {
//    모임게시글 출력
    public List<MeetingBookmarkDTO> selectMeetingPosts(Long memberId);
}
