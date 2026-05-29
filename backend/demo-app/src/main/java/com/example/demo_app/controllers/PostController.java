package com.example.demo_app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo_app.models.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/post")
public class PostController {
    


    @GetMapping("")
    public List<Post> getPosts(){
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("A Trip to United Kingdom","There are a lot of places"));
        posts.add(new Post("Eating alone","Don't eat alone!. Its boring"));
        return posts;
    }
}
