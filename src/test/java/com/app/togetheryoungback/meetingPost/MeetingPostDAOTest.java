package com.app.togetheryoungback.meetingPost;

import com.app.togetheryoungback.dao.MeetingPostDAO;
import com.app.togetheryoungback.domain.MeetingPostVO;
import com.app.togetheryoungback.mapper.MeetingPostMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MeetingPostDAOTest {
    @Autowired
    private MeetingPostDAO meetingPostDAO;

    @Autowired
    private MeetingPostMapper meetingPostMapper;

    @Test
    public void bringCountOfGeneralPost() {
        Long memberId = 181L;
        log.info(String.valueOf(meetingPostDAO.selectCountByMemberId(memberId)));
    }

//    모임 게시판 작성
    @Test
    public void bringInsertTest(){
        MeetingPostVO meetingPostVO = new MeetingPostVO();

        meetingPostVO.setMemberId(221L);
        meetingPostVO.setMeetingPostCategory("스포츠");
        meetingPostVO.setMeetingPostRegion("서울");
        meetingPostVO.setMeetingPostTitle("스포츠 모임");
        meetingPostVO.setMeetingPostContent("모임 내용12");
        meetingPostVO.setMeetingDate("2023-10-03");
        meetingPostVO.setMeetingDuration(30);
        meetingPostVO.setMeetingPostMin(10);
        meetingPostVO.setMeetingPostMax(20);
        meetingPostVO.setMeetingPlace("서울 강남");

        meetingPostMapper.insert(meetingPostVO);

    }

//    모임 게시판 수정
    @Test
    public void updateTest(){
        MeetingPostVO meetingPostVO = new MeetingPostVO();

        meetingPostVO.setId(81L);
        meetingPostVO.setMeetingPostTitle("수정 제목12");
        meetingPostVO.setMeetingPostContent("수정 내용12");

        meetingPostMapper.update(meetingPostVO);

    }


}
