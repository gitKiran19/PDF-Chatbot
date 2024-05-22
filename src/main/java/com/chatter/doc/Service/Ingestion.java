package com.chatter.doc.Service;

import com.chatter.doc.Dao.UserOp;
import com.chatter.doc.Entity.Ingest;
import com.chatter.doc.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Ingestion {

    @Autowired
    private UserOp userOp;

    public Ingest create(Ingest ingest){
        return userOp.saveUseronNode(ingest);
    }

}
