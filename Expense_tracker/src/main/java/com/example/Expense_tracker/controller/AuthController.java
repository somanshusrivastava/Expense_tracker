package com.example.Expense_tracker.controller;


import com.example.Expense_tracker.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        if (user.getUsername().equals("admin") && user.getPassword().equals("password"))
        {
            return ResponseEntity.ok("Login successful! Use your token for further requests.");
        }
        return ResponseEntity.status(401).body("Invalid credentials");
    }
}
