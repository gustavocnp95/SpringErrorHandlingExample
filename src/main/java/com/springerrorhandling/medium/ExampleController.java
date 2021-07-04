package com.springerrorhandling.medium;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/example")
public class ExampleController {
    @NotNull
    private final ExampleService service;

    @Autowired
    public ExampleController(@NotNull ExampleService service) {
        this.service = service;
    }

    @GetMapping
    public boolean exampleEndpoint() {
        return service.exampleMethod();
    }
}
