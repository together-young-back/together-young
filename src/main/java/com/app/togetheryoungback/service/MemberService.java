package com.app.togetheryoungback.service;

import com.app.togetheryoungback.domain.MemberVO;

import java.util.Optional;

public interface MemberService {
    public void join(MemberVO memberVO);

    public Optional<MemberVO> findAccount(String memberEmail);
}
