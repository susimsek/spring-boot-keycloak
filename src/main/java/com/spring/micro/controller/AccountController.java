package com.spring.micro.controller;

import lombok.RequiredArgsConstructor;
import org.keycloak.representations.AccessToken;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping(path = "/iam/accounts")
@Validated
@RequiredArgsConstructor
public class AccountController {

    private final AccessToken accessToken;

    @GetMapping(path = "/hello")
    public String hello() {
        return "hello world";
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping(path = "/authenticated")
    public String authenticated(Principal principal) {
        System.out.println(principal.getName());
        System.out.println(accessToken.getPreferredUsername());
        return "hello";
    }

    @GetMapping(path = "/promoters")
    public String promoters() {
        return "hello world";
    }

    @GetMapping(path = "/supervisors")
    public String supervisors() {
        return "hello world";
    }


}