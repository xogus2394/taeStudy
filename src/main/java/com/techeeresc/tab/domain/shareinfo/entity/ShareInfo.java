package com.techeeresc.tab.domain.shareinfo.entity;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Table(name = "ShareInfo")
@Entity
@Data
public class ShareInfo {
    @Id //PK를 의미
    @GeneratedValue(strategy = GenerationType.IDENTITY) //MariaDB에서 사용하게된다
    @Column(nullable = false, columnDefinition = "INT UNSIGNED")
    private int id;
    @Column(name = "title", length = 100)
    private int title;
    @Column(name = "content", length = 100)
    private String content;
    @Column(name = "link", columnDefinition = "INT UNSIGNED")
    private int link;
    @Column(name = "image", length = 200)
    private String image;
    @Column(name = "hashtag", length = 100)
    private int hashtag;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = true, columnDefinition = "TIMESTAMP DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp updatedAt;
    @PrePersist
    protected void onCreate() {
        createdAt = Timestamp.valueOf(LocalDateTime.now());
    }
    @PreUpdate
    protected void onUpdate() {
        updatedAt = Timestamp.valueOf(LocalDateTime.now());
    }
    @Builder
    public ShareInfo(int title, String content, int link, String image, int hashtag) {
        this.title = title;
        this.content = content;
        this.link = link;
        this.image = image;
        this.hashtag =hashtag;
    }

}
