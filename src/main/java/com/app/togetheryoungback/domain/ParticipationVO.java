package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//모임 참석 테이블, 회원 정보 & 모임 게시글 DTO
public class ParticipationVO {
//    참석 테이블 PK
    private Long id;
//    회원 번호
    private Long memberId;
//    모임 게시글 번호
    private Long meetingPostId;
}
