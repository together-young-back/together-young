package com.app.togetheryoungback.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
//일반 게시글 댓글 Mapper
public interface GeneralReplyMapper {
    public int selectCountByMemberId(Long memberId);
}
