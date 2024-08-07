package com.example.backend.dto.response.user;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;

@Getter
@Setter
@NoArgsConstructor
public class MemberTokenDto {

    private String email;
    private String token;

    @Builder
    public MemberTokenDto(String email, String token) {
        this.email = email;
        this.token = token;
    }

    public static MemberTokenDto fromEntity(UserDetails member, String token) {
        return MemberTokenDto.builder()
                .email(member.getUsername())
                .token(token)
                .build();
    }
}
