# 내용 정리
--
@Getter  : 모든 필드에 대한 Getter 메서드를 자동 생성 <br>
@NoArgsConstructor : 기본 생성자(파라미터 없는 생성자)를 자동으로 생성
```
public class Person {
    private String name;
}
// 위처럼 생성자가 하나도 없으면 ↓ 아래 코드가 자동 생성됨
public Person() {} 
```
```
public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name;
    }
}
```
-  직접 생성자를 만들지 않으면 , 기본 생성자는 자동 생성되지 않음. 그래서 JPA, Jackson, Spring, Hibernate 같은 프레임워크는 기본 생성자가 없으면 예외를 발생 시킴
- AlloArgsContructor를 사용하게 되면 NoArgsConstructor는 필수가 됨.

@AllArgsConstructor : 모든 필드를 파라미터로 받는 생성자 자동 생성 
- 그럼 Builder를 안쓰고 왜 이걸 쓰는 이유는?

- 모든 필드를 인자로 받아 객체 생성을할 때 사용, 빠르지만 실수 위험 왜냐면 **필드의 순서에 맞춰서 파라미터를 넣어줘야함**.

@Embeddable : JPA에서 해당 클래스를 내장 타입(Embedded)으로 사용 가능하게 함.<br>
@Entity : JPA 엔티티임을 선언 <br>
@Table(name = "members") : DB Table명을 member로 지정<br>
@Id, @GenerateValue : 기본 키 및 자동 증가 설정<br>
@Enumerated(EnumType.STRING) : Enum 값을 문자열로 저장 <br>
@Embedded : 설정된객체를 포함하는 값 객체로 사용.<br>
@CreatedDate, @LastModifiedDate : 생성/수정 시간 자동 기록(Auditing 기능) <br>
@EntityListeners(AuditingEntityListener.class) : 위 Auditing 어노테이션을 동작시키기 위한 설정.<br> 
@RestControllerAdvice : Spring Framework 전역 예외를 처리하기 위한 어노테이션
- 쉽게 말하면 : 컨드롤러 전반에서 발생하는 예외를 한곳에서 처리하고, 일관된 Response을 내려주는 역활.
- @ControllerAdvice + @ResponseBody 조합.