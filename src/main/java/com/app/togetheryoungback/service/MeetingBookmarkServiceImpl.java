package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.MeetingBookmarkDAO;
import com.app.togetheryoungback.domain.MeetingBookmarkDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MeetingBookmarkServiceImpl implements MeetingBookmarkService {
    private final MeetingBookmarkDAO meetingBookmarkDAO;
    @Override
    public List<MeetingBookmarkDTO> loadMeetingBookmarks(Long memberId) {
        return meetingBookmarkDAO.selectAllByMemberId(memberId);
    }
}
