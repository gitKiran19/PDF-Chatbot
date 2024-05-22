package com.chatter.doc.Service;

import com.chatter.doc.Dao.UserOp;
import com.chatter.doc.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Register {
    @Autowired
    private UserOp userOp;

    public User register(User user){
        return userOp.saveUser(user);
    }
}
