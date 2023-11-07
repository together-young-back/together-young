package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.MainDAO;
import com.app.togetheryoungback.domain.GeneralPostDTO;
import com.app.togetheryoungback.domain.MeetingPostDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class MainServiceImpl implements MainService {
    private final MainDAO mainDAO;
    @Override
    public int getGeneralCount() {
        return mainDAO.countGeneralPost();
    }

    @Override
    public int getMeetingCount() {
        return mainDAO.countMeetingPost();
    }

    @Override
    public List<GeneralPostDTO> getViewTopGeneralPost() {
        return mainDAO.topGeneralPost().stream()
                .distinct()
                .limit(2)
                .collect(Collectors.toList());
    }

    @Override
    public List<MeetingPostDTO> getViewTopMeetingPost() {
        return mainDAO.topMeetingPost().stream()
                .limit(2)
                .collect(Collectors.toList());
    }
}
