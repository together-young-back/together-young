package com.app.togetheryoungback.member;

import com.app.togetheryoungback.domain.MemberVO;
import com.app.togetheryoungback.mapper.MemberMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class MemberMapperTest {
    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void insertTest() {
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberEmail("test1234@gmail.com");
        memberVO.setMemberNickname("테스트");
        memberVO.setMemberKakaoProfileUrl("test");

        memberMapper.insert(memberVO);
    }

    @Test
    public void selectByEmailTest() {
        String email = "cnh1234578@gmail.com";

        memberMapper.selectByEmail(email).map(MemberVO::toString).ifPresent(log::info);
    }

    @Test
    public void selectAllTest(){memberMapper.selectAll().stream().map(MemberVO::toString).forEach(log::info);}
}