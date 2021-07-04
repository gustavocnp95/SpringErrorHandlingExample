package com.springerrorhandling.medium.errorhandling;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Builder(toBuilder = true, setterPrefix = "with")
@Data
public final class ApiError {
    private final int statusCode;
    @NotNull
    private final String message;
    @NotNull
    private final String debugMessage;
}