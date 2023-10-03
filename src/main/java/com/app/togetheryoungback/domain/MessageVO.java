package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//메시지 VO
public class MessageVO {
    //    메시지 ID
    private Long id;
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
    //    삭제 상태
    private Long messageDeleteStatus;
}

