package com.techeeresc.tab.domain.bookmark.dto.mapper;


import com.techeeresc.tab.domain.bookmark.dto.request.BookmarkCreateRequestDto;
import com.techeeresc.tab.domain.bookmark.dto.response.BookmarkResponseDto;
import com.techeeresc.tab.domain.bookmark.entity.Bookmark;
import com.techeeresc.tab.domain.bookmark.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookmarkMapper {

    private final BookmarkRepository bookmarkRepository;

    public Bookmark toEntity(BookmarkCreateRequestDto bookmarkCreateRequestDto) {
        return Bookmark.builder()
                .memberId(bookmarkCreateRequestDto.memberId)
                .postId(bookmarkCreateRequestDto.postId)
                .build();
    }
    public BookmarkResponseDto fromEntity(Bookmark bookmark) {
        return BookmarkResponseDto.builder()
                .postId(bookmark.getPostId())
                .memberId(bookmark.getMemberId())
                .build();
    }
}