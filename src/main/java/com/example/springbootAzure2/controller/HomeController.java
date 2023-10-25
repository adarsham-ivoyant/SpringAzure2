package com.example.springbootAzure2.controller;

import com.example.springbootAzure2.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HomeController {


//    @GetMapping
//    public String home(){
//        return "Hello Welcome to Spring boot";
//    }
    private List<User> users=new ArrayList<>();


    @GetMapping
    public String userController() {
        users.add(new User(1001L, "Virat", "India"));
        users.add(new User(1002L, "Rohit", "India"));
        users.add(new User(1003L, "Gill", "India"));
        users.add(new User(1004L, "Ishan", "India"));
        users.add(new User(1005L, "Rahul", "India"));
        users.add(new User(1006L, "Bhumra", "India"));
        users.add(new User(1007L, "Siraj", "India"));
        users.add(new User(1008L, "Hardik", "India"));
        users.add(new User(1009L, "Chahal", "India"));
        users.add(new User(1010L, "Jadeja", "India"));

        return "Added Successfully";

    }

    @GetMapping("getAllUser")
    public List<User> getUsers(){
        return users;
    }

    @GetMapping("getById/{id}")
    public User getById(@PathVariable("id") Long id){
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
