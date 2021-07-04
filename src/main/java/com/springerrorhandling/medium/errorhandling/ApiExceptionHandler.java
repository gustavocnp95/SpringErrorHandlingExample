package com.springerrorhandling.medium.errorhandling;

import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public final class ApiExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ExampleErrorException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiError handleUsuarioSemPermissaoException(@NotNull final ExampleErrorException exception) {
        return createException(exception, HttpStatus.BAD_REQUEST.value());
    }

    private ApiError createException(@NotNull final Throwable exception, final int statusCode) {
        return ApiError.builder()
                .withMessage(exception.getMessage())
                .withDebugMessage(exception.getLocalizedMessage())
                .withStatusCode(statusCode)
                .build();
    }
}
