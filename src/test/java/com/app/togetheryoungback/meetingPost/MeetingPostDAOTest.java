package com.app.togetheryoungback.meetingPost;

import com.app.togetheryoungback.dao.GeneralPostDAO;
import com.app.togetheryoungback.dao.MeetingPostDAO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MeetingPostDAOTest {
    @Autowired
    private MeetingPostDAO meetingPostDAO;

    @Test
    public void bringCountOfGeneralPost() {
        Long memberId = 181L;
        log.info(String.valueOf(meetingPostDAO.selectCountByMemberId(memberId)));
    }
}
