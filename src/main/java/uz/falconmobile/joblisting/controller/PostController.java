package uz.falconmobile.joblisting.controller;

import io.swagger.v3.oas.annotations.Hidden;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.falconmobile.joblisting.model.Post;
import uz.falconmobile.joblisting.repository.PostRepository;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @Hidden
    @RequestMapping("/")
    public void redirect(HttpServletResponse response) throws IOException {

        response.sendRedirect("/swagger-ui.html");

    }

    @GetMapping("/posts")
    public List<Post> getPosts() {

        return this.postRepository.findAll();
    }

    @PostMapping("/posts")
    public Post addPost(@RequestBody Post post) {

        return postRepository.save(post);

    }
}
