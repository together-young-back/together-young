package com.app.togetheryoungback.dao;

import com.app.togetheryoungback.mapper.ParticipationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ParticipationDAO {
    private final ParticipationMapper participationMapper;
    public int selectCountByMemberId(Long memberId) {
        return participationMapper.selectCountByMemberId(memberId);
    }
}
