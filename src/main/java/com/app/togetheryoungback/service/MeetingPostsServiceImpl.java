package com.app.togetheryoungback.service;


import com.app.togetheryoungback.dao.MeetingPostsDAO;
import com.app.togetheryoungback.domain.MeetingPostVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MeetingPostsServiceImpl implements MeetingPostsService {

    private final MeetingPostsDAO meetingPostsDAO;

//    게시판 작성
    @Override
    public void write(MeetingPostVO meetingPostVO) {
        meetingPostsDAO.send(meetingPostVO);
    }

//    게시판 수정
    @Override
    public void getUpdate(Long id) {
        meetingPostsDAO.modify(id);
    }

//    게시판 목록
    @Override
    public List<MeetingPostVO> getList() {
        return meetingPostsDAO.list();
    }

//    게시판 조회
    @Override
    public Optional<MeetingPostVO> getSelect(Long id) {
        return meetingPostsDAO.findById(id);
    }

//    게시판 삭제
    @Override
    public void deleteById(Long id) {
        meetingPostsDAO.delete(id);
    }

}
