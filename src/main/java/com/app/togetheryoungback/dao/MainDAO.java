package com.app.togetheryoungback.dao;

import com.app.togetheryoungback.domain.GeneralPostDTO;
import com.app.togetheryoungback.domain.MeetingPostDTO;
import com.app.togetheryoungback.mapper.MainMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MainDAO {
    private final MainMapper mainMapper;

// 일반 게시글 총 개수
    public int countGeneralPost(){
       return mainMapper.countGeneralPost();
    }

// 모인 게시글 총 개수
    public int countMeetingPost(){
        return mainMapper.countMeetingPost();
    }

//    조회수 TOP 일반 게시글
    public List<GeneralPostDTO> topGeneralPost(){
        return mainMapper.viewTopGeneralPost();
    }

//    조회수 TOP 만남 게시글
    public List<MeetingPostDTO> topMeetingPost(){
        return mainMapper.viewTopMeetingPost();
    }
}
