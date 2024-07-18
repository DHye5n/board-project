package com.example.backend.dto.request.user;

import com.example.backend.domain.Member;
import com.example.backend.enums.Role;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Getter
@Setter
@NoArgsConstructor
public class MemberRegisterDto {

    @NotBlank
    @Email
    private String email;
    @NotBlank
    private String password;
    @NotBlank
    private String passwordCheck;
    @NotBlank
    private String name;
    @NotBlank
    @Pattern(regexp = "^[0-9]{11,13}$")
    private String telNumber;
    @NotBlank
    private String zoneCode;
    @NotBlank
    private String address;
    @NotBlank
    private String addressDetail;

    @Builder
    public MemberRegisterDto(String email, String password, String passwordCheck, String name, String telNumber,
                             String zoneCode, String address, String addressDetail) {
        this.email = email;
        this.password = password;
        this.passwordCheck = passwordCheck;
        this.name = name;
        this.telNumber = telNumber;
        this.zoneCode = zoneCode;
        this.address = address;
        this.addressDetail = addressDetail;
    }

    public static Member ofEntity(MemberRegisterDto dto) {
        return Member.builder()
                .email(dto.getEmail())
                .password(dto.getPassword())
                .name(dto.getName())
                .telNumber(dto.getTelNumber())
                .zoneCode(dto.getZoneCode())
                .address(dto.getAddress())
                .addressDetail(dto.getAddressDetail())
                .role(Role.USER)
                .build();
    }
}
