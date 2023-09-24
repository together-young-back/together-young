package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//    회원 정보 VO
public class MemberVO {
//    회원 번호
    private Long id;
//    회원 이메일
    private String memberEmail;
//    회원 전화번호
    private String memberTel;
//    회원 닉네임
    private String memberNickname;
//    가입 일자
    private String memberCreateTime;
//    수정 일자
    private String memberUpdateTime;

}
