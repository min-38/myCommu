package com.min38.mycommu.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article; // 게시글 ID
    private String content; // 본문

    private LocalDateTime createdAt; // 작성 날짜
    private String createdBy; // 작성자
    private LocalDateTime modifiedAt; // 수정 날짜
    private String modifiedBy; // 수정자
}