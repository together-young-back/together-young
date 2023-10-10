package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.MeetingPostDAO;
import com.app.togetheryoungback.domain.MeetingPostVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MeetingPostServiceImpl implements MeetingPostService {
    private final MeetingPostDAO meetingPostDAO;

    @Override
    public void write(MeetingPostVO meetingPostVO) {
        meetingPostDAO.getInsert(meetingPostVO);
    }

    @Override
    public void modify(MeetingPostVO meetingPostVO) {
        meetingPostDAO.getUpdate(meetingPostVO);
    }

    @Override
    public List<MeetingPostVO> list(Long memberId) {
        return meetingPostDAO.getSelectMemberId(memberId);
    }

    @Override
    public int bringCountOfMeetingPost(Long memberId) {
        return meetingPostDAO.selectCountByMemberId(memberId);
    }
}
