package com.codeup.codeupspringblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return "This be the posts";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String seePost(@PathVariable String id) {
        return "Check this out: " + id;
    }
    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost() {
        return "This is where the form where you will create a post or something is";
    }
    @RequestMapping (value = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String createPosts() {
        return "This is where you will actually create a post i think";
    }
}
