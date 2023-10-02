package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.GeneralBookmarkDAO;
import com.app.togetheryoungback.domain.GeneralBookmarkDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GeneralBookmarkServiceImpl implements GeneralBookmarkService {
    private final GeneralBookmarkDAO generalBookmarkDAO;
    @Override
    public List<GeneralBookmarkDTO> loadGeneralBookmarks(Long memberId) {
        return generalBookmarkDAO.selectAllByMemberId(memberId);
    }
}
