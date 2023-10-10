package com.app.togetheryoungback.controller;

import com.app.togetheryoungback.domain.FriendDTO;
import com.app.togetheryoungback.domain.Search;
import com.app.togetheryoungback.service.FriendService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/friend/*")
public class FriendController {
    private final FriendService friendService;

    // 친구 검색으로 이동
    @GetMapping("search")
    public void goToFriendSearchForm(){;}

//    // 친구 검색
//    @GetMapping("search")
//    public List<FriendDTO> getSearchFriend(Search search){
//        return friendService.getSearchFriend(search);
//    }


    @GetMapping("message")
    public void goToFriendMessageFrom(){;}

//// 친구 목록으로 이동
//    @GetMapping("list")
//    public List<FriendDTO> goToFriendListForm(Long memberId){
//        return friendService.getFriend(memberId);
//    }

    @GetMapping("list")
    public void goToFriendListForm(){;}

////    friend/message 친구 메시지함으로 이동
//    @PostMapping("message")
//    public void goToFriendMessageFrom(FriendVO friendVO){
////        friendController
//    }



}
