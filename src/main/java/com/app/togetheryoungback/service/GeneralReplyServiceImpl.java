package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.GeneralReplyDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GeneralReplyServiceImpl implements GeneralReplyService {
    private final GeneralReplyDAO generalReplyDAO;

    @Override
    public int bringCountOfGeneralReply(Long memberId) {
        return generalReplyDAO.selectCountByMemberId(memberId);
    }
}
