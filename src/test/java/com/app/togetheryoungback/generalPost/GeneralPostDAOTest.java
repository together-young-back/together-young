package com.app.togetheryoungback.generalPost;

import com.app.togetheryoungback.dao.GeneralPostDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@Slf4j
public class GeneralPostDAOTest {
    @Autowired
    private GeneralPostDAO generalPostDAO;

    @Test
    public void bringCountOfGeneralPost() {
        Long memberId = 181L;
        log.info(String.valueOf(generalPostDAO.selectCountByMemberId(memberId)));
    }
}
