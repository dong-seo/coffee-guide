package org.example.coffeeguide.domain.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
//@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String zipCode;
    private String baseAddress;
    private String detailAddress;
}
