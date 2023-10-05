package com.app.togetheryoungback.member;

import com.app.togetheryoungback.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MemberServiceTest {
    @Autowired
    private MemberService memberService;

    @Test
    public void bringMemberInfo(){
        Long id = 181L;

        log.info(String.valueOf(memberService.bringMemberInfo(id)));
    }

    @Test
    public void saveTelTest(){
        String tel = "01036316412";
        Long id = 142L;

        memberService.saveTel(tel, id);
    }
}
