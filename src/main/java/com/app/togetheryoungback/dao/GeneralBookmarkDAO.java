package com.app.togetheryoungback.dao;

import com.app.togetheryoungback.domain.GeneralBookmarkDTO;
import com.app.togetheryoungback.mapper.GeneralBookmarkMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class GeneralBookmarkDAO {
    private final GeneralBookmarkMapper generalBookmarkMapper;

    //일반게시글 북마크 출력
    public List<GeneralBookmarkDTO> selectAllByMemberId(Long memberId) {
        return generalBookmarkMapper.selectGeneralPosts(memberId);
    }
}
