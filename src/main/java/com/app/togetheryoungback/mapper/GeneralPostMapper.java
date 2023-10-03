package com.app.togetheryoungback.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface GeneralPostMapper {
    int selectCountByMemberId(Long memberId);
}