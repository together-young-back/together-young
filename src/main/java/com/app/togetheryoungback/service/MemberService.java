package com.app.togetheryoungback.service;

import com.app.togetheryoungback.domain.MemberVO;

import java.util.Optional;

public interface MemberService {

    public MemberVO bringMemberInfo(Long id);
    public void join(MemberVO memberVO);

    public Optional<MemberVO> findAccount(String memberEmail);

    public void saveProfileImg(MemberVO memberVO);

    public void deleteProfileImg(Long id);

    public Optional<String> findNickname(String memberNickname);

    public void saveNickname(String memberNickname);

    public void saveTel(String memberTel, Long id);
}
