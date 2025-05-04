package com.moha.myproject1;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//ResponseEntity Practice
@RestController
public class ResponseController {
    @GetMapping("/success")
    public ResponseEntity<String> getSuccess() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Custom-Header", "SuccessHeader");
        return ResponseEntity.ok()
                .headers(headers)
                .body("Request was successful!");
    }

    @GetMapping("/not-found")
    public ResponseEntity<String> getNotFound() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body("Error: Resource not found.");
    }

    @PostMapping("/create")
    public ResponseEntity<String> createResource() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/resource/123"); // Simulated resource URI
        return ResponseEntity.status(HttpStatus.CREATED)
                .headers(headers)
                .body("Resource created successfully.....");
    }
}
