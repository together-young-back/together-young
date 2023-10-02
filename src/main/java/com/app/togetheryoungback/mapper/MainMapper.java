package com.app.togetheryoungback.mapper;

import com.app.togetheryoungback.domain.GeneralPostVO;
import com.app.togetheryoungback.domain.MeetingPostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MainMapper {
//    일반 게시글 가지고 오기
    public List<GeneralPostVO> selectGeneralPost();

//    모임 게시글 가지고 오기
    public List<MeetingPostVO> selectMeetingPost();
}
