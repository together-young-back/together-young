package com.app.togetheryoungback.mapper;

import com.app.togetheryoungback.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface MemberMapper {
//    계정정보 조회
    public MemberVO selectById(Long id);

//    카카오 계정 이메일로 조회 - 로그인
    public Optional<MemberVO> selectByEmail(String memberEmail);
//    카카오 계정 추가 - 로그인
    public void insert(MemberVO memberVO);
//    유저 프로필 추가
    public void updateProfileImg(MemberVO memberVO);
//    유저 프로필 삭제(카카오 프로필도 삭제됨)
    public void updateToDeleteProfileImg(Long id);
//    유저 닉네임 유무 조회 - 마이페이지
    public Optional<String> selectByMemberNickname(String memberNickname);
//    유저 닉네임 업데이트 - 마이페이지
    public void updateMemberNickname(String memberNickname, Long id);
//    유저 전화번호 업데이트 - 마이페이지
    public void updateMemberTel(String memberTel, Long id);
//    유저 계정 삭제(MEMBER_STATUS = 'DISABLED')
    public void softDelete(Long id);
}
