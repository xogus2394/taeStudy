package com.techeeresc.tab.domain.bookmark.service;

import com.techeeresc.tab.domain.bookmark.dto.mapper.BookmarkMapper;
import com.techeeresc.tab.domain.bookmark.dto.request.BookmarkCreateRequestDto;
import com.techeeresc.tab.domain.bookmark.dto.response.BookmarkResponseDto;
import com.techeeresc.tab.domain.bookmark.entity.Bookmark;
import com.techeeresc.tab.domain.bookmark.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;
    public final BookmarkMapper bookmarkMapper;
    @Transactional
    public Bookmark save(BookmarkCreateRequestDto dto) {
        return bookmarkRepository.save(bookmarkMapper.toEntity(dto));
    }

}