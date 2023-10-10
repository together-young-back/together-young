package com.app.togetheryoungback.bookmark;

import com.app.togetheryoungback.domain.GeneralBookmarkDTO;
import com.app.togetheryoungback.domain.MeetingBookmarkDTO;
import com.app.togetheryoungback.mapper.GeneralBookmarkMapper;
import com.app.togetheryoungback.mapper.MeetingBookmarkMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class BookmarkMapperTest {
    @Autowired
    private GeneralBookmarkMapper generalBookmarkMapper;
    @Autowired
    private MeetingBookmarkMapper meetingBookmarkMapper;

    @Test
    public void gSelectAll(){
        Long id = 181L;

        generalBookmarkMapper.selectGeneralPosts(id).stream().map(GeneralBookmarkDTO::toString).forEach(log::info);
    }

    @Test
    public void mSelectAll(){
        Long id = 181L;

        meetingBookmarkMapper.selectMeetingPosts(id).stream().map(MeetingBookmarkDTO::toString).forEach(log::info);
    }
}
