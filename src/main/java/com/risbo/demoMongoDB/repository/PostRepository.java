package com.risbo.demoMongoDB.repository;

import com.risbo.demoMongoDB.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}