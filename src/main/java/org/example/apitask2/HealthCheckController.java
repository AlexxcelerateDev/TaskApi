package org.example.apitask2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public String healthCheck() {
        return "Application is up and running!";
    }

    @GetMapping("/")
    public String def() {
        return "Principal endpoint";
    }

}