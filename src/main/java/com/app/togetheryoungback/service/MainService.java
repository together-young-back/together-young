package com.app.togetheryoungback.service;

import com.app.togetheryoungback.domain.GeneralPostDTO;
import com.app.togetheryoungback.domain.MeetingPostDTO;

import java.util.List;

public interface MainService {
    // 일반 게시글 총 개수
    public int getGeneralCount();

    // 모인 게시글 총 개수
    public int getMeetingCount();

//    조회수 TOP 일반 게시글
    public List<GeneralPostDTO> getViewTopGeneralPost();

//    조회수 TOP 만남 게시글
    public List<MeetingPostDTO> getViewTopMeetingPost();
}
