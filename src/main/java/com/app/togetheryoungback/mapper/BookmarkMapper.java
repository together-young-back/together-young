package com.app.togetheryoungback.mapper;

import com.app.togetheryoungback.domain.GeneralBookmarkDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookmarkMapper {
    public List<GeneralBookmarkDTO> selectByMemberId(Long id);
}
