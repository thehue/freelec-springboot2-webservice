package com.jojoldu.book.springboot.web.dto;

import com.jojoldu.book.springboot.web.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class PostResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    @Builder
    public PostResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
