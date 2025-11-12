package com.andrenunes.workshopmongo.services;

import com.andrenunes.workshopmongo.domain.User;
import com.andrenunes.workshopmongo.dto.UserDTO;
import com.andrenunes.workshopmongo.repository.UserRepository;
import com.andrenunes.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        User user = repository.findById(id).orElse(null);
        if (user == null) {
            throw new ObjectNotFoundException("Object not found!");
        }
        return user;
    }

    public User insert(User user) {
        return repository.insert(user);
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

    public void delete(String id) {
        findById(id);
        repository.deleteById(id);
    }

}
