package com.app.togetheryoungback.dao;


import com.app.togetheryoungback.domain.MeetingPostVO;
import com.app.togetheryoungback.mapper.MeetingPostsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MeetingPostsDAO {
    private final MeetingPostsMapper meetingPostsMapper;

//    게시글 작성
    public void send(MeetingPostVO meetingPostVO) {
        meetingPostsMapper.insert(meetingPostVO);
    }

//    게시글 수정
    public void modify(Long id){
        meetingPostsMapper.update(id);
    }

//    게시글 목록
    public List<MeetingPostVO> list(){
        return meetingPostsMapper.selectAll();
    }

//    게시글 조회
    public Optional<MeetingPostVO> findById(Long id){
        return meetingPostsMapper.selectId(id);
    }

//    게시글 삭제
    public void delete(Long id){
        meetingPostsMapper.delete(id);
    }

}
