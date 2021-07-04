package com.springerrorhandling.medium;

import com.springerrorhandling.medium.errorhandling.ExampleErrorException;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {
    public boolean exampleMethod() {
        throw new ExampleErrorException("An example error occurred when processing the request.");
    }
}
