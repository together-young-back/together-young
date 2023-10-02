package com.app.togetheryoungback.mapper;

import com.app.togetheryoungback.domain.GeneralBookmarkDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper

//일반 게시글 북마크 Mapper
public interface GeneralBookmarkMapper {
//    일반 게시글 출력
    public List<GeneralBookmarkDTO> selectGeneralPosts(Long memberId);
}