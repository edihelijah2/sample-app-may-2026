package com.example.demo_app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo_app.models.Post;
import com.example.demo_app.services.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/post")

public class PostController {
    

    @Autowired
    PostService postService;

    @GetMapping("")
    public List<Post> getPosts(){
        return postService.getPosts();
    }
}
