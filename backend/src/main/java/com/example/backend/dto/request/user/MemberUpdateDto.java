package com.example.backend.dto.request.user;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
public class MemberUpdateDto {

    private String password;
    private String passwordCheck;
    private String name;
    private String telNumber;

    @Builder
    public MemberUpdateDto(String password, String passwordCheck, String name, String telNumber) {
        this.password = password;
        this.passwordCheck = passwordCheck;
        this.name = name;
        this.telNumber = telNumber;
    }
}
