package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.ParticipationDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ParicipationServiceImpl implements ParticipationService {
    private final ParticipationDAO participationDAO;
    @Override
    public int bringCountOfParticipation(Long memberId) {
        return participationDAO.selectCountByMemberId(memberId);
    }
}
