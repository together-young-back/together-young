package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class GeneralBookmarkDTO {
    //    일반 북마크 번호
    private Long id;
    //    회원 번호
    private Long memberId;
    //    일반 게시글 번호
    private Long generalPostId;
    //    카테고리
    private String generalPostCategory;
    //    게시글 제목
    private String generalPostTitle;
    //    게시글 내용
    private String generalPostContent;
    //    조회수 카운트
    private int generalPostViewCount;
    //    좋아요 카운트
    private int generalPostLikeCount;
    //    북마크 카운트
    private int generalPostBookmarkCount;
    //    글 작성 시간
    private String generalPostWriteTime;
    //    글 수정시간
    private String generalPostUpdateTime;

}
