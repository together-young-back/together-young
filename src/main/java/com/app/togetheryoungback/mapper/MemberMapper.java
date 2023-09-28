package com.app.togetheryoungback.mapper;

import com.app.togetheryoungback.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberMapper {
//    카카오 계정 이메일로 조회
    public Optional<MemberVO> selectByEmail(String memberEmail);
//    카카오 계정 추가
    public void insert(MemberVO memberVO);

    public List<MemberVO> selectAll();
}
