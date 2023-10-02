package com.app.togetheryoungback.dao;

import com.app.togetheryoungback.domain.GeneralPostVO;
import com.app.togetheryoungback.domain.MeetingPostVO;
import com.app.togetheryoungback.mapper.GeneralPostsMapper;
import com.app.togetheryoungback.mapper.MainMapper;
import com.app.togetheryoungback.mapper.MeetingPostsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MainDAO {
    private final MainMapper mainMapper;

//    일반 게시글 가지고 오기
    public List<GeneralPostVO> selectGeneralPostDao(){
        return mainMapper.selectGeneralPost();
    }

//    모임 게시글 가지고 오기
    public List<MeetingPostVO> selectMeetingPostDao(){
      return mainMapper.selectMeetingPost();
    }
}
