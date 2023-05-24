package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LizardController {


    @GetMapping("/lizard")
    public String lizardPage() {
        return "lizard";
    }

    @GetMapping("/lizard/{type}")
    public String favLizard(@PathVariable String type, Model model) {
        model.addAttribute("type", type);
        return "lizard";
    }
}