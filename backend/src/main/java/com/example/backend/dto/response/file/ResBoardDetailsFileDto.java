package com.example.backend.dto.response.file;

import com.example.backend.domain.File;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResBoardDetailsFileDto {

    private Long fileId;
    private String originalFileName;
    private String fileType;

    @Builder
    public ResBoardDetailsFileDto(Long fileId, String originalFileName, String fileType) {
        this.fileId = fileId;
        this.originalFileName = originalFileName;
        this.fileType = fileType;
    }

    public static ResBoardDetailsFileDto fromEntity(File file) {
        return ResBoardDetailsFileDto.builder()
                .fileId(file.getId())
                .originalFileName(file.getOriginalFileName())
                .fileType(file.getFileType())
                .build();
    }
}
