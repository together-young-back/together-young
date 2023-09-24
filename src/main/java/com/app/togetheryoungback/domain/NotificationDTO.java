package com.app.togetheryoungback.domain;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//알림 테이블, 회원 정보 DTO
public class NotificationDTO {
//    알림 번호
    private Long id;
//    회원 번호
    private Long memberId;
//    알림 관련자 번호
    private Long relatedMemberId;
//    알림 내용
    private String notificationContent;
}
