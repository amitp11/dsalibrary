package com.codeintution.dsalibrary.repository;

import com.codeintution.dsalibrary.model.Questions;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionsRepository extends MongoRepository<Questions, String> {
}
