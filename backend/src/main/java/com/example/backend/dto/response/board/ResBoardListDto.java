package com.example.backend.dto.response.board;

import com.example.backend.domain.Board;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ResBoardListDto {

    private Long boardId;
    private String title;
    private String content;
    private int viewCount;
    private String writerName;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;


    @Builder
    public ResBoardListDto(Long boardId, String title, String content, int viewCount,
                           String writerName, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.boardId = boardId;
        this.title = title;
        this.content = content;
        this.viewCount = viewCount;
        this.writerName = writerName;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;

    }

    public static ResBoardListDto fromEntity(Board board) {
        return ResBoardListDto.builder()
                .boardId(board.getId())
                .title(board.getTitle())
                .content(board.getContent())
                .viewCount(board.getViewCount())
                .writerName(board.getMember().getUsername())
                .createdDate(board.getCreatedDate())
                .modifiedDate(board.getModifiedDate())
                .build();
    }
}
