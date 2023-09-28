package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.MemberDAO;
import com.app.togetheryoungback.domain.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberDAO memberDAO;
    @Override
    public void join(MemberVO memberVO) {
        Optional<MemberVO> foundMember = findAccount(memberVO.getMemberEmail());
        if (foundMember.isEmpty()) {
            memberDAO.save(memberVO);
        }
    }

    @Override
    public Optional<MemberVO> findAccount(String memberEmail) {
        return memberDAO.findByEmail(memberEmail);
    }


}
