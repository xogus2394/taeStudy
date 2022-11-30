package com.techeeresc.tab.domain.bookmark.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class BookmarkCreateRequestDto {
    public int postId;
    public int memberId;
}