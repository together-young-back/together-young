package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.MeetingPostDAO;
import com.app.togetheryoungback.dao.MeetingReplyDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MeetingReplyServiceImpl implements MeetingReplyService {
    private final MeetingReplyDAO meetingReplyDAO;

    @Override
    public int bringCountOfMeetingReply(Long memberId) {
        return meetingReplyDAO.selectCountByMemberId(memberId);
    }
}
