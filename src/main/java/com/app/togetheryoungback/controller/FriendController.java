package com.app.togetheryoungback.controller;

import com.app.togetheryoungback.domain.MemberVO;
import com.app.togetheryoungback.domain.Pagination;
import com.app.togetheryoungback.domain.Search;
import com.app.togetheryoungback.service.FriendService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;


import javax.servlet.http.HttpSession;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/friend/*")
public class FriendController {
    private final FriendService friendService;

    // 친구 검색으로 이동
    @GetMapping("search")
    public void goToFriendSearchForm(Pagination pagination, Search search, Model model){
//        pagination.setTotal(friendService.getTotoalFriend(search));
//        pagination.progress();
//
//        model.addAttribute("pagination", pagination);
//        model.addAttribute("keyWords", friendService.getSelectAllFriend(pagination, search));
    }


//    친구 메세지로 이동
    @GetMapping("message")
    public void goToFriendMessageFrom(@RequestParam("friendId") Long friendId, Model model,HttpSession session){

        MemberVO memberVo = (MemberVO)session.getAttribute("member");
        Long id = memberVo.getId();

        model.addAttribute("sentMessage", friendService.getFriendMessage(id,friendId));
        model.addAttribute("received", friendService.getFriendReceivedMessage(id,friendId));
        model.addAttribute("friendInfo", friendService.getFriendInfo(friendId));
    }


// 친구 목록으로 이동
    @GetMapping("list")
    public void   goToFriendListForm(Model model, HttpSession session){
        MemberVO memberVo = (MemberVO)session.getAttribute("member");
        Long id = memberVo.getId();

        model.addAttribute("friends",friendService.getFriend(id));
    }

//    친구 삭제
    @GetMapping("delete-friend")
    public RedirectView deleteFriend(Long friendId){
        friendService.delete(friendId);
        return new RedirectView("/friend/list");
    }

}
