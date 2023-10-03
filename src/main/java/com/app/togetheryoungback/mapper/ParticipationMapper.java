package com.app.togetheryoungback.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
//게시글 카테고리 Mapper
public interface ParticipationMapper {
    public int selectCountByMemberId(Long memberId);
}
