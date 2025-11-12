package com.andrenunes.workshopmongo.resources;

import com.andrenunes.workshopmongo.domain.Post;
import com.andrenunes.workshopmongo.domain.User;
import com.andrenunes.workshopmongo.dto.UserDTO;
import com.andrenunes.workshopmongo.services.PostService;
import com.andrenunes.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResources {

    @Autowired
    private PostService service;


    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
