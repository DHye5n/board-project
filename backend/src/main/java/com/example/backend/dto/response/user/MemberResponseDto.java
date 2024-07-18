package com.example.backend.dto.response.user;

import com.example.backend.domain.Member;
import lombok.Builder;
import lombok.Getter;


@Getter
public class MemberResponseDto {

    private final String email;
    private final String name;

    @Builder
    public MemberResponseDto(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public static MemberResponseDto fromEntity(Member member) {
        return MemberResponseDto.builder()
                .email(member.getEmail())
                .name(member.getName())
                .build();
    }
}
