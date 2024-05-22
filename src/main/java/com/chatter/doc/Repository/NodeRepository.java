package com.chatter.doc.Repository;

import com.chatter.doc.Entity.Ingest;
import com.chatter.doc.Entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeRepository extends ElasticsearchRepository<Ingest, String> {

}
