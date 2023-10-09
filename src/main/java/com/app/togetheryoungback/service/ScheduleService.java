package com.app.togetheryoungback.service;

import com.app.togetheryoungback.domain.MeetingPostDTO;

import java.util.List;

public interface ScheduleService {

    public List<MeetingPostDTO> searchSchedule(Long memberId);

    public void removeSchedule(Long postId);
}
