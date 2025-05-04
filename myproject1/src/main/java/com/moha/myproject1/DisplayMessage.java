package com.moha.myproject1;
import org.springframework.web.bind.annotation.*;

//Basic REST Controller
@RestController
public class DisplayMessage {
    @GetMapping("/")
    public String welcome() {
        return "Welcome to the Greeting API!";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "! Nice to meet you.";
    }
}
