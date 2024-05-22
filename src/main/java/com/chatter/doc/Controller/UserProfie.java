package com.chatter.doc.Controller;

import com.chatter.doc.Entity.User;
import com.chatter.doc.Service.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfie {
    @Autowired
    private Register register;

    @PostMapping("/register")
    public ResponseEntity<User> userRegister(@RequestBody User user){
        User newUser = register.register(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }
}
