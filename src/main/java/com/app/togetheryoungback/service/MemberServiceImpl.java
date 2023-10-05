package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.MemberDAO;
import com.app.togetheryoungback.domain.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class MemberServiceImpl implements MemberService {
    private final MemberDAO memberDAO;

    @Override
    public MemberVO bringMemberInfo(Long id) {
        return memberDAO.bringMemberInfo(id);
    }

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

    @Override
    public void saveProfileImg(MemberVO memberVO) {
        memberDAO.saveProfileImg(memberVO);
    }

    @Override
    public void deleteProfileImg(Long id) {
        memberDAO.deleteProfileImg(id);
    }

    @Override
    public Optional<String> findNickname(String memberNickname) {
        return memberDAO.findByMemberNickname(memberNickname);
    }

    @Override
    public void saveNickname(String memberNickname) {
        memberDAO.saveNickname(memberNickname);
    }

    @Override
    public void saveTel(String memberTel, Long id) {
        memberDAO.saveTel(memberTel, id);
    }
}
