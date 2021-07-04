package com.springerrorhandling.medium.errorhandling;

import org.jetbrains.annotations.NotNull;

public class ExampleErrorException extends RuntimeException {
    public ExampleErrorException(@NotNull final String message) {
        super(message);
    }
}
