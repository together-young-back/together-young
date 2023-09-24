package com.app.togetheryoungback.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
//게시글 카테고리 VO
public class PostCategoryVO {
//    카테고리 번호
    private Long id;
//    카테고리 이름
    private String categoryName;
}
