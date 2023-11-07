package com.app.togetheryoungback.controller;

import com.app.togetheryoungback.service.MainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.Service;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/")
public class MainController {
    private final MainService mainService;

    // 메인 페이지
    @GetMapping
    public String goToMainForm(Model model) {

        model.addAttribute("countGeneral", mainService.getGeneralCount());
        model.addAttribute("countMeeting", mainService.getMeetingCount());
        model.addAttribute("viewCountMeetingPosts", mainService.getViewTopMeetingPost());
        model.addAttribute("viewCountGeneralPosts", mainService.getViewTopGeneralPost());
        return "/main/main";
    }

}
