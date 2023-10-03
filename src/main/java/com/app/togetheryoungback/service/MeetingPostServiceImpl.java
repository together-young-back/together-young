package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.MeetingPostDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MeetingPostServiceImpl implements MeetingPostService {
    private final MeetingPostDAO meetingPostDAO;
    @Override
    public int bringCountOfMeetingPost(Long memberId) {
        return meetingPostDAO.selectCountByMemberId(memberId);
    }
}
