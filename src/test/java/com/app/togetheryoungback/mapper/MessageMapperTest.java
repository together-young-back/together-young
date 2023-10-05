package com.app.togetheryoungback.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MessageMapperTest {
    @Autowired
    private MessageMapper messageMapper;

    @Test
    public void deleteTest(){
        Long memberId = 241L;
        messageMapper.deleteAll(memberId);
    }

    @Test
    public void deleteReceivedTest(){
        Long messageId = 85L;
        messageMapper.deleteReceived(messageId);
    }

    @Test
    public void deleteSentTest(){
        Long messageId = 85L;
        messageMapper.deleteSent(messageId);
    }
}
