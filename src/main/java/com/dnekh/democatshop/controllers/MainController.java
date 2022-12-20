package com.dnekh.democatshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("hello", "Hello Kitty Super Mors!");
        return "index";
    }

    @GetMapping("/about-us")
    public String getAboutUs(Model model) {
        model.addAttribute("about", "Here is you can find all needing information about us!");
        return "aboutUs";
    }
}
