package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//일반 게시글 DTO, 일반 게시글 북마크 & 게시글 카테고리 & 일반 게시글 댓글 DTO
public class GeneralPostVO {
//    일반 게시글 번호
    private Long id;
//    회원 번호
    private Long memberId;
//    카테고리
    private Long generalPostCategory;
//    게시글 제목
    private String generalPostTitle;
//    게시글 내용
    private String generalPostContent;
//    조회수 카운트
    private Long generalPostViewCount;
//    좋아요 카운트
    private Long generalPostLikeCount;
//    북마크 카운트
    private Long generalPostBookmarkCount;
//    글 작성 시간
    private String generalPostWriteTime;
//    글 수정시간
    private String generalPostUpdateTime;

}
