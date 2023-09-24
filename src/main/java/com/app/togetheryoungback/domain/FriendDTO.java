package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//친구 DTO, 회원 정보와 DTO
public class FriendDTO {
//    친구 테이블 ID
    private Long id;
//    회원 번호
    private Long memberId;
//    친구
    private Long friendId;
//    친구 요청 상황
    private String friendRequestStatus;
//    친구 신청 시간
    private String friendRequestCreatedTime;
//    친구 신청 응답 시간
    private String friendRequestUpdatedTime;
//    친구 별명
    private String friendDescription;
}
