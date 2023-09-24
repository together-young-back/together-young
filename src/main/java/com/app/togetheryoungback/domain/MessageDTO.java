package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//메시지 DTO, 회원 정보 DTO
public class MessageDTO {
//    메시지 ID
    private Long id;
//    유저 1
    private Long memberId1;
//    유저 2
    private Long memberId2;
//    메시지 제목
    private String messageTitle;
//    메시지 내용
    private String messageContent;
//    보낸 시간
    private String messageCreateTime;
}
