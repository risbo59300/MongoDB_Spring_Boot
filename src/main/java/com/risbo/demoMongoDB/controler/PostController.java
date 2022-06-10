package com.risbo.demoMongoDB.controler;

import com.risbo.demoMongoDB.model.Post;
import com.risbo.demoMongoDB.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @PostMapping("/addPost")
    public String savePost(@RequestBody Post post) {
        postRepository.save(post);
        return "Added book with id : " + post.getId();
    }

    @GetMapping("/findAllPosts")
    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    @GetMapping("/findPost/{id}")
    public Optional<Post> getPost(@PathVariable String id) {
        return postRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePost(@PathVariable String id) {
        postRepository.deleteById(id);
        return "book deleted with id : " + id;
    }
}
