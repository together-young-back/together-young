package com.app.togetheryoungback.member;

import com.app.togetheryoungback.dao.MemberDAO;
import com.app.togetheryoungback.mapper.MemberMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MemberDAOTest {
    @Autowired
    private MemberDAO memberDAO;

    @Test
    public void updateTelTest(){
        String tel = "01036316422";
        Long id = 142L;
        memberDAO.saveTel(tel, id);
    }
}
