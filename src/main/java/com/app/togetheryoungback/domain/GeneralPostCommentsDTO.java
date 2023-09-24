package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//일반 게시글 댓글 DTO, 회원 정보 & 일반 게시글 DTO
public class GeneralPostCommentsDTO {
//    댓글 번호
    private Long id;
//    회원 번호
    private Long memberId;
//    일반 게시글 번호
    private Long generalPostId;
//    댓글 내용
    private String generalReply;
//    댓글 작성 시간
    private String gReplyCreateTime;
//    댓글 수정 시간
    private String gReplyUpdateTime;
}
