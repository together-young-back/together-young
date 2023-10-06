package com.app.togetheryoungback.bookmark;

import com.app.togetheryoungback.domain.GeneralBookmarkDTO;
import com.app.togetheryoungback.domain.MeetingBookmarkDTO;
import com.app.togetheryoungback.mapper.GeneralBookmarkMapper;
import com.app.togetheryoungback.mapper.MeetingBookmarkMapper;
import com.app.togetheryoungback.service.MeetingBookmarkService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BookmarkServiceTest {
    @Autowired
    private MeetingBookmarkService meetingBookmarkService;


    @Test
    public void mSelectAll(){
        Long id = 181L;

        meetingBookmarkService.loadMeetingBookmarks(id).stream().map(MeetingBookmarkDTO::toString).forEach(log::info);
    }
}
