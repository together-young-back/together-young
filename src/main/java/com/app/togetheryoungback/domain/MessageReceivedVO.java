package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//받은 쪽지 DTO, 메시지 DTO
public class MessageReceivedVO {
    //    받은 쪽지 번호
    private Long id;
    //    메시지 ID
    private Long messageId;
}

