package com.app.togetheryoungback.dao;

import com.app.togetheryoungback.domain.MeetingBookmarkDTO;
import com.app.togetheryoungback.mapper.MeetingBookmarkMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MeetingBookmarkDAO {
    private final MeetingBookmarkMapper meetingBookmarkMapper;

    //모임게시글 북마크 출력
    public List<MeetingBookmarkDTO> selectAllByMemberId(Long memberId) {
        return meetingBookmarkMapper.selectMeetingPosts(memberId);
    }
}
