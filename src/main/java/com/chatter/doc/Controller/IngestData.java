package com.chatter.doc.Controller;

import com.chatter.doc.Entity.Ingest;
import com.chatter.doc.Entity.User;
import com.chatter.doc.Service.Ingestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngestData {

    @Autowired
    private Ingestion ingestion;

    @PutMapping("/ingest")
    public ResponseEntity<Ingest> ingest(@RequestBody Ingest ingest){
        Ingest newUser = ingestion.create(ingest);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }
}
