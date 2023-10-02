package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.MainDAO;
import com.app.togetheryoungback.domain.GeneralPostVO;
import com.app.togetheryoungback.domain.MeetingPostVO;
import com.app.togetheryoungback.mapper.MainMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class MainServiceImpl implements MainService {

    private final MainDAO mainDAO;

    @Override
    public List<GeneralPostVO> selectGeneralPost() {
        return mainDAO.selectGeneralPostDao();
    }

    @Override
    public List<MeetingPostVO> selectMeetingPost() {
        return mainDAO.selectMeetingPostDao();
    }
}
