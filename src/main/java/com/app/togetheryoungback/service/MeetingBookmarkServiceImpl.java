package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.MeetingBookmarkDAO;
import com.app.togetheryoungback.domain.MeetingBookmarkDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class MeetingBookmarkServiceImpl implements MeetingBookmarkService {
    private final MeetingBookmarkDAO meetingBookmarkDAO;
    @Override
    public List<MeetingBookmarkDTO> loadMeetingBookmarks(Long memberId) {
        // 리스트를 생성 후 값을 담아 놓음
        List<MeetingBookmarkDTO> meetingBookmarkDTOS = meetingBookmarkDAO.selectAllByMemberId(memberId);

        // 리스트의 길이에 맞게 모임시간이 종료되었는지 여부를 가리기 위해 foreach문으로 각각의 객체에 불린타입 값을 알맞게 넣어줌
        for (MeetingBookmarkDTO dto : meetingBookmarkDTOS) {
            log.info("모임시간 " + dto.getMeetingDuration());
            boolean isMeetingTimeNotExpired = calculateMeetingTime(dto.getMeetingDuration(), dto.getMeetingDate());
            dto.setMeetingTimeNotExpired(isMeetingTimeNotExpired);
        }

        // 그 이후 반환
        return meetingBookmarkDTOS;
    }

    // 각각의 모임 종료 여부를 가려내기 위해 계산 하는 메소드 생성
    private boolean calculateMeetingTime(int meetingDuration, String meetingDate) {
        // 현재 시간
        Date currentDate = new Date();

        // 모임 종료 시간 계산 코드
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date meetingEndDate = null;
        try {
            Date startDate = dateFormat.parse(meetingDate);
            long durationMillis = (long) meetingDuration * 3600 * 1000; // 분 단위를 밀리초로 변환
            long endTimeMillis = startDate.getTime() + durationMillis;

            meetingEndDate = new Date(endTimeMillis);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 현재 시간과 모임 종료 시간 비교
        return currentDate.before(meetingEndDate);
    }
}
