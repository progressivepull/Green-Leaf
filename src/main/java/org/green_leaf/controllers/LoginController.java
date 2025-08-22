package org.green_leaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
	
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username,
                               @RequestParam String password,
                               Model model) {
        if ("admin".equals(username) && "password".equals(password)) {
            model.addAttribute("message", "Login successful!");
            return "welcome";
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login";
        }
    }

}
