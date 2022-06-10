package com.risbo.demoMongoDB.repository;

import com.risbo.demoMongoDB.model.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepository extends MongoRepository<Tutorial, String> {
}
