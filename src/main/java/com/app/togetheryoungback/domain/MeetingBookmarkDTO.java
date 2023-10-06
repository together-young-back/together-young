package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class MeetingBookmarkDTO {
    //    모임 북마크 번호
    private Long id;
    //    회원 번호
    private Long memberId;
    //    모임 게시글 번호
    private Long meetingPostId;
    //    카테고리
    private String meetingPostCategory;
    //    모임 지역
    private String meetingPostRegion;
    //    게시글 제목
    private String meetingPostTitle;
    //    게시글 내용
    private String meetingPostContent;
    //    모임 날짜
    private String meetingDate;
    //    모임 진행 시간
    private int meetingDuration;
    //    모임 최소 인원
    private int meetingPostMin;
    //    모임 최대 인원
    private int meetingPostMax;
    //    모임 장소
    private String meetingPlace;
    //    조회수 카운트
    private int meetingPostViewCount;
    //    좋아요 카운트
    private int meetingPostLikeCount;
    //    북마크 카운트
    private int meetingPostBookmarkCount;
    //    글 작성 시간
    private String meetingPostWriteTime;
    //    글 수정 시간
    private String meetingPostUpdateTime;
    //    모임 시간 지나갔는지 여부 확인 체크(controller에서 값을 넣을 것)
    private boolean isMeetingTimeNotExpired;
}
