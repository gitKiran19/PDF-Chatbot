package com.chatter.doc.Repository;

import com.chatter.doc.Dao.UserOp;
import com.chatter.doc.Entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>{

}
