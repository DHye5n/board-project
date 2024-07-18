package com.example.backend.dto.response.comment;

import com.example.backend.domain.Comment;
import com.example.backend.dto.request.comment.CommentDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class ResCommentDto {

    private Long commentId;
    private String content;
    private String commentWriter;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;

    @Builder
    public ResCommentDto(Long commentId, String content, String commentWriter, LocalDateTime createdDate, LocalDateTime modifiedDate) {
        this.commentId = commentId;
        this.content = content;
        this.commentWriter = commentWriter;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }

    public static ResCommentDto fromEntity(Comment comment) {
        return ResCommentDto.builder()
                .commentId(comment.getId())
                .content(comment.getContent())
                .commentWriter(comment.getMember().getUsername())
                .createdDate(comment.getCreatedDate())
                .modifiedDate(comment.getModifiedDate())
                .build();
    }
}
