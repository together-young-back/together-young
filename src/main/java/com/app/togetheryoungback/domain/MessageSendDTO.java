package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//보낸 쪽지 DTO, 메시지 DTO
public class MessageSendDTO {
//    받은 쪽지 번호
    private Long id;
//    메시지 ID
    private Long messageId;
}
