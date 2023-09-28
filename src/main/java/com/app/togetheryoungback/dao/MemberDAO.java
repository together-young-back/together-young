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
}
