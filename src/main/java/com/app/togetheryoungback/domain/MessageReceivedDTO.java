package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
@Data
//    받은 메시지 DTO
public class MessageReceivedDTO {
    //    받은 메시지 ID
    private Long id;
    //    메시지 ID : ReceivedMessageVO와 MessageVO 연결
    private Long messageID;

    //    보낸 유저 : MessageVO와 MemberVO 연결
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

    //    회원 번호 : MessageVO와 연결된 나에게 보낸 회원의 정보
    private Long memberId;
    //    회원 이메일
    private String memberEmail;
    //    회원 전화번호
    private String memberTel;
    //    회원 닉네임
    private String memberNickname;
    //    가입 일자
    private Timestamp memberCreateTime;
    //    수정 일자
    private Timestamp memberUpdateTime;
    //    이미지 이름
    private String memberImgName;
    //    이미지 경로
    private String memberImgPath;
    //    유저 계정 상태
    private String memberStatus;
    //    카카오 프로필 사진
    private String memberKakaoProfileUrl;
}

