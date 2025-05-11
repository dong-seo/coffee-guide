package org.example.coffeeguide.domain.member.controller;


import jakarta.validation.Valid;
import org.example.coffeeguide.domain.member.dto.MemberRequestDTO;
import org.example.coffeeguide.domain.member.dto.MemberResponseDTO;
import org.example.coffeeguide.global.response.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Tag
@RestController
@RequestMapping("/member")
public class MemberController {

    public ResponseEntity<ApiResponse<MemberResponseDTO>> registerMember(@RequestBody @Valid MemberRequestDTO memberRequestDTO) {
        //Service 추가필요.
        return null;
    }
}
