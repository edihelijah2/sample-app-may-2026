package com.example.demo_app.services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

import com.example.demo_app.models.Post;

@Service
public class PostService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Post> getPosts(){
        ResultSetExtractor<List<Post>> extractor = rs -> {
            List<Post> posts = new ArrayList<>();
            while (rs.next()) {
                posts.add(new Post(rs.getLong("id"),rs.getString("title"),rs.getString("description")));
            }
            return posts;
        };
        return jdbcTemplate.query("select id, title, description from post",extractor);
  
    }
    
}
