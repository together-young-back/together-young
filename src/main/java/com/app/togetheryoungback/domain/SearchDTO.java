package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class SearchDTO {
    public List<FriendDTO> searchFriend;
    private int searchFriendTotalCount;
}
