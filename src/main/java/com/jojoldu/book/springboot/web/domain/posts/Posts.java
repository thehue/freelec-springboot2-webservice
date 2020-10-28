package com.jojoldu.book.springboot.web.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // 롬복
@NoArgsConstructor // 롬복; 기본생성자 자동 추가(public Posts(){})
@Entity //JPA 어노테이션 -> 주요 어노테이션을 클래스에 가깝게!
public class Posts { // 실제 DB 테이블과 매칭될 클래스 -> Entity 클래스
    // 테이블: sales_manager -> SalesManager
    @Id // 해당 테이블의 pk 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto_increment
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 빌더 패턴 클래스 생성
    //생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
