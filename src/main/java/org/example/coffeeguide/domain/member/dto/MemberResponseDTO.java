package org.example.coffeeguide.domain.member.dto;

import lombok.Getter;
import org.example.coffeeguide.domain.member.entity.Member;

@Getter
public class MemberResponseDTO {

    private String email;
    private String name;
    private String role;
    private String phoneNumber;
    private String address;

    public MemberResponseDTO(Member member) {
        this.email = email;
        this.name = name;
        this.role = role;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
