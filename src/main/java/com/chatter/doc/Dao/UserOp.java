package com.chatter.doc.Dao;

import com.chatter.doc.Entity.Ingest;
import com.chatter.doc.Entity.User;
import com.chatter.doc.Repository.NodeRepository;
import com.chatter.doc.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class UserOp{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private NodeRepository nodeRepository;

    // save user on postgresql
    public User saveUser(User user){
        return userRepository.save(user);
    }

    // save user on elastic node

    public Ingest saveUseronNode(Ingest ingest){
        return nodeRepository.save(ingest);
    }
}
