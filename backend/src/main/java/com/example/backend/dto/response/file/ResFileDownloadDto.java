package com.example.backend.dto.response.file;

import com.example.backend.domain.File;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResFileDownloadDto {

    private String originalFilename;
    private String fileType;
    private byte[] content;

    @Builder
    public ResFileDownloadDto(String originalFilename, String fileType, byte[] content) {
        this.originalFilename = originalFilename;
        this.fileType = fileType;
        this.content = content;
    }

    public static ResFileDownloadDto fromFileResource(File file, String contentType, byte[] content) {
        return ResFileDownloadDto.builder()
                .originalFilename(file.getOriginalFileName())
                .fileType(contentType)
                .content(content)
                .build();
    }
}
