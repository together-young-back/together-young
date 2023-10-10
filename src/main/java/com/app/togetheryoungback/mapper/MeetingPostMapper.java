package com.app.togetheryoungback.mapper;

import com.app.togetheryoungback.domain.MeetingPostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
//모임 게시글 Mapper
public interface MeetingPostMapper {

//    모임 게시글 작성
    public void insert(MeetingPostVO meetingPostVO);

//    모임 게시글 수정
    public void update(MeetingPostVO meetingPostVO);

//    모임 게시글 목록
    public List<MeetingPostVO> selectMemberId(Long memberId);

//    멤버 id를 통한 모임 게시글 갯수 조회
    public int selectCountByMemberId(Long memberId);
}
