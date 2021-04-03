package com.udemy.ecomdashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String root() {
        return "login";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    //No page created for access denied
    @GetMapping("/access-denied")
    public String accessDenied() {
        return "/access-denied";
    }
}
