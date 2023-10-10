package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.*;
import com.app.togetheryoungback.domain.MeetingPostDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class ScheduleServiceImpl implements ScheduleService {
    private final ScheduleDAO scheduleDAO;
    @Override
    public List<MeetingPostDTO> searchSchedule(Long memberId) {
        return scheduleDAO.searchMeeting(memberId);
    }

    @Override
    public void removeSchedule(Long postId) {
        scheduleDAO.removeMeeting(postId);
    }
}
