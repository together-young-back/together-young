package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.MeetingBookmarkDAO;
import com.app.togetheryoungback.domain.MeetingBookmarkDTO;

import java.util.List;

public interface MeetingBookmarkService {
    public List<MeetingBookmarkDTO> loadMeetingBookmarks(Long memberId);
}
