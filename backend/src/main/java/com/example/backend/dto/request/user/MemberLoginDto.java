package com.example.backend.dto.request.user;

import lombok.*;

import javax.validation.constraints.NotBlank;


@Getter
@Setter
@NoArgsConstructor
public class MemberLoginDto {

    @NotBlank
    private String email;
    @NotBlank
    private String password;

    @Builder
    public MemberLoginDto(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
