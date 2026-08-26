package com.devsecops.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "Java DevSecOps Application is running!";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }
}