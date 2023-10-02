package com.app.togetheryoungback.service;

import com.app.togetheryoungback.domain.GeneralPostVO;
import com.app.togetheryoungback.domain.MeetingPostVO;

import java.util.List;

public interface MainService {
    //    일반 게시글 가지고 오기
    public List<GeneralPostVO> selectGeneralPost();

    //    모임 게시글 가지고 오기
    public List<MeetingPostVO> selectMeetingPost();
}

