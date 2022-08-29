package co.develhope.MongoDB.controllers;

import co.develhope.MongoDB.entities.User;
import co.develhope.MongoDB.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUser(){
        return userService.getUser();
    }

    @GetMapping("/{id}")
    public Optional<User> getSingleUser(@PathVariable String id){
        return userService.getSingleUser(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        //user.setId(null);
        return userService.createUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        userService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public User editUser(@PathVariable String id, @RequestBody User user){
        return userService.editUser(id,user);
    }
}
