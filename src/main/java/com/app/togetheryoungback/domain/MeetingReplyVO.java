package com.app.togetheryoungback.domain;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//모임 게시글 댓글 DTO, 회원 정보 & 모임 게시글 DTO
public class MeetingReplyVO {
//    댓글 번호
    private Long id;
//    모임 게시글 번호
    private Long meetingPostId;
//    회원 번호
    private Long memberId;
//    댓글 내용
    private String meetingReply;
//    댓글 작성 시간
    private String meetingReplyCreateTime;
//    댓글 수정 시간
    private String meetingReplyUpdateTime;
}
