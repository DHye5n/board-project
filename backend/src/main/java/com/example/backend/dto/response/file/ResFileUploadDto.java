package com.example.backend.dto.response.file;

import com.example.backend.domain.File;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResFileUploadDto {

    private Long fileId;
    private String originalFileName;
    private String filePath;
    private String fileType;

    @Builder
    public ResFileUploadDto(Long fileId, String originalFileName, String filePath, String fileType) {
        this.fileId = fileId;
        this.originalFileName = originalFileName;
        this.filePath = filePath;
        this.fileType = fileType;
    }

    public static ResFileUploadDto fromEntity(File file) {
        return ResFileUploadDto.builder()
                .fileId(file.getId())
                .originalFileName(file.getOriginalFileName())
                .filePath(file.getFilePath())
                .fileType(file.getFileType())
                .build();
    }
}
