package com.example.registration.controller;

import com.example.registration.domain.RegistrationRequest;
import com.example.registration.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/registration")
@RequiredArgsConstructor
public class UserRegistration {

    private final RegistrationService registrationService;

    @PostMapping("/register")
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }

    @GetMapping("/confirm")
    public String confirmToken(@RequestParam("token") String token){
        return registrationService.confirmToken(token);
    }
}
