package com.app.togetheryoungback.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/general-community/*")
public class GeneralCommunityController {

    // 일반 게시판으로 이동
    @GetMapping("general-community")
    public void goToGeneralCommunityForm(){;}

    // 일반 게시글 상세보기로 이동
    @GetMapping("general-post")
    public void goToGeneralPostForm(){;}

    // 일반 게시글 작성으로 이동
    @GetMapping("general-write")
    public void goToGeneralWriteForm(){;}

    // 일반 게시글 수정으로 이동
    @GetMapping("general-edit")
    public void goToGeneralEditForm(){;}

}
