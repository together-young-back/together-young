package com.app.togetheryoungback.service;

import com.app.togetheryoungback.domain.GeneralBookmarkDTO;

import java.util.List;

public interface GeneralBookmarkService {
    public List<GeneralBookmarkDTO> loadGeneralBookmarks(Long memberId);
}
