package com.cognizant.jwthandson.controller;

import com.cognizant.jwthandson.service.JwtService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtService jwtService;

    public AuthController(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @GetMapping("/token")
    public String generateToken(@RequestParam String username) {
        return jwtService.generateToken(username);
    }
}