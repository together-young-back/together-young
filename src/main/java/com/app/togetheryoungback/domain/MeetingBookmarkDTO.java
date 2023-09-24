package com.app.togetheryoungback.domain;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//모임 게시글 북마크 DTO, 회원 정보 &  모임 게시글 DTO
public class MeetingBookmarkDTO {
//    모임 북마크 번호
    private Long id;
//    회원 번호
    private Long memberId;
//    일반 게시글 번호
    private Long meetingPostId;
}
