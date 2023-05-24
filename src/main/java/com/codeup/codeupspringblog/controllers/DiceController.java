package com.codeup.codeupspringblog.controllers;


// Create a page at /roll-dice that asks the user to guess a number. There should be links on this page for 1 through 6 that should make a GET request to /roll-dice/n where n is the number guessed. This page should display a random number (the dice roll), the user's guess and a message based on whether or not they guessed the correct number.

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    public String rollDice() {
        return "roll-dice" ;
    }
    @GetMapping("/roll-dice/{number}")
    public String rollDice(@PathVariable int number, Model model) {
        int random = (int) Math.floor(Math.random() * 6 + 1);
        model.addAttribute("random", random);
        model.addAttribute("number", number);
        return "roll-dice" ;
    }

}
