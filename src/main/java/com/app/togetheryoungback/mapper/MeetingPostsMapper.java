package com.app.togetheryoungback.mapper;

import com.app.togetheryoungback.domain.MeetingPostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
//모임 게시글 Mapper
public interface MeetingPostsMapper {
    //    게시글 작성
    public void insert(MeetingPostVO meetingPostVO);

    //    게시글 수정
    public void update(Long id);

    //    모임 게시글 목록
    public List<MeetingPostVO> selectAll();

    //    모임 게시글 조회
    public Optional<MeetingPostVO> selectId(Long id);

//    모임 게시글 삭제
    public void delete(Long id);
    
}
