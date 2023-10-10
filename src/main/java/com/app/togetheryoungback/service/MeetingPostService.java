package com.app.togetheryoungback.service;

import com.app.togetheryoungback.domain.MeetingPostVO;

import java.util.List;

public interface MeetingPostService {

//    게시판 작성
    public void write(MeetingPostVO meetingPostVO);

//    게시판 수정
    public void modify(MeetingPostVO meetingPostVO);

//    게시판 목록
    public List<MeetingPostVO> list(Long memberId);

//    회원 아이디를 통한 모임 게시판 갯수
    public int bringCountOfMeetingPost(Long memberId);
}
