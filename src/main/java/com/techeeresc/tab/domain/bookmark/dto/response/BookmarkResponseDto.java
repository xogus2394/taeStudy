package com.techeeresc.tab.domain.bookmark.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Locale;

@Builder
@Getter
@AllArgsConstructor
public class BookmarkResponseDto {
    public int postId;

    public int memberId;

    public LocalDate create_at;

    public LocalDate update_at;


}