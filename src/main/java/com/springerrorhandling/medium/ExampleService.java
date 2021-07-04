package com.springerrorhandling.medium;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    public boolean exampleMethod() {
        throw new RuntimeException("teste");
    }
}
