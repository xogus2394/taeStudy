package com.techeeresc.tab.domain.bookmark.entity;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import com.tcheeresc.tab.global.common.Timestamped;
import javax.persistence.*;

@Getter
@NoArgsConstructor
@Table(name = "Bookmark")
@Entity
@Data
public class Bookmark  {
    @Id //PK를 의미
    @GeneratedValue(strategy = GenerationType.IDENTITY) //MariaDB에서 사용하게된다
    @Column(nullable = false, columnDefinition = "INT UNSIGNED")
    private int id;
    @Column(name = "member_id", nullable = false, columnDefinition = "INT UNSIGNED")
    private int memberId;
    @Column(name = "post_id", nullable = false, columnDefinition = "INT UNSIGNED")
    private int postId;
    @Builder
    public Bookmark(int memberId, int postId){
        this.memberId = memberId;
        this.postId = postId;
    }
}