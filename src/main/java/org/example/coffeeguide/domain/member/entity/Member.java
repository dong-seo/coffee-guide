package org.example.coffeeguide.domain.member.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.coffeeguide.domain.common.Address;
import org.example.coffeeguide.domain.member.enums.MemberRole;

import java.time.LocalDateTime;

//@Entity
//@Table(name = "members")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@EntityListeners(AuditingEntityListener.class)
public class Member {

    private Long id;
    private String email;
    private String name;
    private String password;
    private MemberRole role;
    private String phoneNumber;
    private Address address;
    private boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    //관계 매핑 편의를 위해 추가된 생성자(조회용으로만 사용)
    /*
    * 굳이 DB에서 Member 전체를 조회할 필요 없이 ID만으로 관계 연결 가능
    * Lazy loading 없이 연관 객체를 ID로 바로 생성
    * @ManyToOne 같은 관계에 바로 넣기 위해.
    * 저장 불가.
    * */
    public Member(Long id){
        this.id = id;
    }

    //Encoder를 만들어야함. 평문을 그대로 저장할 수 없으니 암호화해서 저장해야함.
    public void changePassword(String password) {
        this.password = password;
    }
}
