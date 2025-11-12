package com.andrenunes.workshopmongo.services;

import com.andrenunes.workshopmongo.domain.Post;
import com.andrenunes.workshopmongo.domain.User;
import com.andrenunes.workshopmongo.dto.UserDTO;
import com.andrenunes.workshopmongo.repository.PostRepository;
import com.andrenunes.workshopmongo.repository.UserRepository;
import com.andrenunes.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;


    public Post findById(String id) {
        Post user = repository.findById(id).orElse(null);
        if (user == null) {
            throw new ObjectNotFoundException("Object not found!");
        }
        return user;
    }
}