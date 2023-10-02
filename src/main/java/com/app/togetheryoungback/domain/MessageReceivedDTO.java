package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//    받은 메시지 DTO
public class MessageReceivedDTO {
//    받은 메시지 ID
    private Long id;
//    메시지 ID
    private Long messageID;
//    보낸 유저
    private Long memberSentId;
//    받은 유저
    private Long memberReceivedId;
//    메시지 제목
    private String messageTitle;
//    메시지 내용
    private String messageContent;
//    보낸 시간
    private String messageCreateTime;

}
