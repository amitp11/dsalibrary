package com.codeintution.dsalibrary.repository;

import com.codeintution.dsalibrary.model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface QuestionRepository extends MongoRepository<Question, String> {
    Optional<Question> findByCode(String code);
}
