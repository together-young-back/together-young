package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
@Data
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
