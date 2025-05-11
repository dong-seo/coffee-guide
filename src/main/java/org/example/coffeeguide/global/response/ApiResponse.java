package org.example.coffeeguide.global.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ApiResponse<T> {

    /*
    * timestamp 필드를 JSON으로 변환 시 yyyy-MM-dd HH:mm:ss 형식으로 출력
    * <T> 제네릭 응답 타입, 어떤 타입의 데이터든 data에 담을 수 있음.
    * */
    private final int status;
    private final String message;
    private final T data;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private final LocalDateTime timestamp;

    public ApiResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.timestamp = LocalDateTime.now();
    }

    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(200, "Success", data);
    }

    public static <T> ApiResponse<T> created(T data) {
        return new ApiResponse<>(201, "Created", data);
    }

    public static <T> ApiResponse<T> badRequest(int status, String message) {
        return new ApiResponse<>(status, message, null);
    }
}
