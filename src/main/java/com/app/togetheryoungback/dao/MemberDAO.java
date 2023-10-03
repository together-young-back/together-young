package com.app.togetheryoungback.dao;

import com.app.togetheryoungback.domain.MemberVO;
import com.app.togetheryoungback.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberDAO {
    private final MemberMapper memberMapper;

    //    계정 추가
    public void save(MemberVO memberVO) {
        memberMapper.insert(memberVO);
    }

    //    계정 확인
    public Optional<MemberVO> findByEmail(String memberEmail) {
        return memberMapper.selectByEmail(memberEmail);
    }

    //    계정 이미지 추가
    public void saveProfileImg(MemberVO memberVO) {
        memberMapper.updateMemberProfileImg(memberVO);
    }

    //    닉네임 중복확인
    public Optional<String> findByMemberNickname(String memberNickname) {
        return memberMapper.selectByMemberNickname(memberNickname);
    }

    // 닉네임 업데이트
    public void saveNickname(String memberNickname) {
        memberMapper.updateMemberNickname(memberNickname);
    }

    //    전화번호 업데이트
    public void saveTel(String memberTel, Long id) {
        memberMapper.updateMemberTel(memberTel, id);
    }

    //    계정 소프트 딜리트
    public void softDeleteAccount(Long id) {
        memberMapper.softDelete(id);
    }
}
