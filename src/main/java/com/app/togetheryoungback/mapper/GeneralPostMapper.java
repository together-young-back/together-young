package com.app.togetheryoungback.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GeneralPostMapper {
    public int selectCountByMemberId(Long memberId);
}