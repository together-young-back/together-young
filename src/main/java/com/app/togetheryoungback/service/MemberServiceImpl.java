package com.app.togetheryoungback.service;

import com.app.togetheryoungback.dao.*;
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
    private final GeneralPostDAO generalPostDAO;
    private final MeetingPostDAO meetingPostDAO;
    private final GeneralReplyDAO generalReplyDAO;
    private final MeetingReplyDAO meetingReplyDAO;
    private final ParticipationDAO participationDAO;

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
    public int getAllPostCount(Long id) {
        return generalPostDAO.selectCountByMemberId(id) + meetingPostDAO.selectCountByMemberId(id);
    }

    @Override
    public int getAllReplyCount(Long id) {
        return generalReplyDAO.selectCountByMemberId(id) + meetingReplyDAO.selectCountByMemberId(id);
    }

    @Override
    public int getAllParticipationCount(Long id) {
        return participationDAO.selectCountByMemberId(id);
    }

    @Override
    public Optional<String> findNickname(String memberNickname) {
        return memberDAO.findByMemberNickname(memberNickname);
    }

    @Override
    public void saveNickname(String memberNickname, Long id) {
        memberDAO.saveNickname(memberNickname, id);
    }

    @Override
    public void saveTel(String memberTel, Long id) {
        memberDAO.saveTel(memberTel, id);
    }

    @Override
    public void cancelWithdraw(Long id) {
        memberDAO.cancelWithdraw(id);
    }

    @Override
    public void withdraw(Long id) {
        memberDAO.softDeleteAccount(id);
    }
}
