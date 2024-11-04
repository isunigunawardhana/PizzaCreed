package com.isuni.pizzacreed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    private static final String HARDCODED_USERNAME = "admin";
    private static final String HARDCODED_PASSWORD = "isuni123";

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password, Model model) {

        if (username.equals(HARDCODED_USERNAME) && password.equals(HARDCODED_PASSWORD)) {
            // Authentication successful
            model.addAttribute("username", username);
            return "redirect:/dashboard";
        } else {
            // Authentication failed
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}
