package com.ronaldo.beerstore.error;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.List;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static lombok.AccessLevel.PRIVATE;

@JsonAutoDetect(fieldVisibility = ANY)
@RequiredArgsConstructor(access = PRIVATE)
public class ErrorResponse {

    private final int statusCode;
    private final List<ApiError> errors;

    static ErrorResponse of(HttpStatus status, List<ApiError> apiErrors) {
        return new ErrorResponse(status.value(), apiErrors);
    }

    static ErrorResponse of(HttpStatus status, ApiError apiError) {
        return new ErrorResponse(status.value(), Collections.singletonList(apiError));
    }

    @JsonAutoDetect(fieldVisibility = ANY)
    @RequiredArgsConstructor
    static class ApiError {
        private final String code;
        private final String message;
    }
}
