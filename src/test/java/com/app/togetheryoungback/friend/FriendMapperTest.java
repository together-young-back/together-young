package com.app.togetheryoungback.friend;

import com.app.togetheryoungback.domain.FriendDTO;
import com.app.togetheryoungback.mapper.FriendMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class FriendMapperTest {
    @Autowired
    private FriendMapper friendMapper;

    @Test
    public void testFriend(){
        friendMapper.selectAllFriend(261L).stream().map(FriendDTO::toString).forEach(log::info);
    }

}
