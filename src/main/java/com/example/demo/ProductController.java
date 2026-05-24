package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @GetMapping("/")
    public String home() {
        return "Welcome to DevOps E-Commerce Application";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is running successfully";
    }

    @GetMapping("/products")
    public List<Map<String, Object>> products() {

        return List.of(
                Map.of(
                        "id", 1,
                        "name", "Laptop",
                        "price", 65000
                ),
                Map.of(
                        "id", 2,
                        "name", "Smartphone",
                        "price", 25000
                ),
                Map.of(
                        "id", 3,
                        "name", "Headphones",
                        "price", 3000
                )
        );
    }
}
