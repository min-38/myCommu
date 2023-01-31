package com.min38.mycommu.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id;

    private String title; // 본문
    private String content; // 본문
    private String hashtag; // 해시태그

    private LocalDateTime createdat; // 작성 날짜
    private String createdby; // 작성자
    private LocalDateTime modifiedat; // 수정 날짜
    private String modifiedby; // 수정자
}
