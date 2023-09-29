package com.app.togetheryoungback.service;

import com.app.togetheryoungback.domain.MeetingPostVO;

import java.util.List;
import java.util.Optional;

public interface MeetingPostsService {
//    게시글 작성
    public void write(MeetingPostVO meetingPostVO);

//    게시글 수정
    public void getUpdate(Long id);

//    게시글 목록
    public List<MeetingPostVO> getList();

//    게시글 조회
    public Optional<MeetingPostVO> getSelect(Long id);

//    게시글 삭제
    public void deleteById(Long id);

}
