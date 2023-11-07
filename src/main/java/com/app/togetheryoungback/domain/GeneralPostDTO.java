package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class GeneralPostDTO {
    //    일반 게시글 번호
    private Long id;
    //    회원 번호
    private Long memberId;
//    회원 닉네임
    private String memberNickName;
//    회원 카카오 프로필
    private String memberKakaoProfileUrl;
    //    카테고리
    private String generalPostCategory;
    //    게시글 제목
    private String generalPostTitle;
    //    게시글 내용
    private String generalPostContent;
    //    조회수 카운트
    private int generalPostViewCount;
//    댓글 카운트
    private int generalPostReplyCount;
    //    좋아요 카운트
    private int generalPostLikeCount;
    //    북마크 카운트
    private int generalPostBookmarkCount;
    //    글 작성 시간
    private String generalPostWriteTime;
    //    글 수정시간
    private String generalPostUpdateTime;
    //    댓글 번호
    private Long replyId;
    //    일반 게시글 번호
    private Long generalPostId;
    //    댓글 내용
    private String generalReplyContent;
    //    댓글 작성 시간
    private String generalReplyCreateTime;
    //    댓글 수정 시간
    private String generalReplyUpdateTime;
}
