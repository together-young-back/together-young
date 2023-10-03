package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.GeneralPostDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GeneralPostServiceImpl implements GeneralPostService {
    public final GeneralPostDAO generalPostDAO;
    @Override
    public int bringCountOfGeneralPost(Long memberId) {
        return generalPostDAO.selectCountByMemberId(memberId);
    }
}
