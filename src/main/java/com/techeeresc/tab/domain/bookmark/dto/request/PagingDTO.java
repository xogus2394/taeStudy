package com.techeeresc.tab.domain.bookmark.dto.request;

import lombok.Data;

@Data
public class PagingDTO {

    private Long id;
    private Long memberId;
    private Long postId;

    public PagingDTO(Long id, Long memberId, Long postId) {
        this.id = id;
        this.memberId = memberId;
        this.postId = postId;
    }
}