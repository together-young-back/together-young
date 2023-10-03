package com.app.togetheryoungback.generalPost;

import com.app.togetheryoungback.dao.GeneralPostDAO;
import com.app.togetheryoungback.mapper.GeneralPostMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
@Slf4j
public class GeneralPostMapperTest {
    @Autowired
    private GeneralPostMapper generalPostMapper;

    @Test
    public void bringCountOfGeneralPost() {
        Long memberId = 181L;
        int postCount = generalPostMapper.selectCountByMemberId(memberId);

        log.info("글 갯수 = " + postCount);
    }
}
