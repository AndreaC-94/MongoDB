package co.develhope.MongoDB.services;

import co.develhope.MongoDB.entities.User;
import co.develhope.MongoDB.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUser(){
        return userRepository.findAll();
    }

    public Optional<User> getSingleUser(@PathVariable String id){
        return userRepository.findById(id);
    }

    public User createUser(@RequestBody User user){
        //user.setId(null);
        return userRepository.save(user);
    }

    public void deleteUser(@PathVariable String id){
        userRepository.deleteById(id);
    }

    public User editUser(@PathVariable String id, @RequestBody User user){
        user.setId(id);
        return userRepository.save(user);
    }
}
