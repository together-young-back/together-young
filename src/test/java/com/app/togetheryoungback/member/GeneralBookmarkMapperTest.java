package com.app.togetheryoungback.member;

import com.app.togetheryoungback.domain.GeneralBookmarkDTO;
import com.app.togetheryoungback.mapper.GeneralBookmarkMapper;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class GeneralBookmarkMapperTest {
    @Autowired
    private GeneralBookmarkMapper generalBookmarkMapper;

    @Test
    public void selectAllGeneralBookmarksTest(){
        Long memberId = 82L;
        generalBookmarkMapper.selectGeneralPosts(memberId).stream().map(GeneralBookmarkDTO::toString).forEach(log::info);
    }
}