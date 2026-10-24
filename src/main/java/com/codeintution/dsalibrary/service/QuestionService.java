package com.codeintution.dsalibrary.service;

import com.codeintution.dsalibrary.dtos.QuestionResponse;
import com.codeintution.dsalibrary.model.Question;
import com.codeintution.dsalibrary.repository.QuestionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository repo;

    public QuestionService(QuestionRepository repo) {
        this.repo = repo;
    }

    public Question save(Question q) {
        return repo.save(q);
    }

    public List<QuestionResponse> getAll() {
        return repo.findAll().stream().map(QuestionResponse::from).toList();
    }

    public Question getByCode(String code) {
        return repo.findByCode(code).orElse(null);
    }

}
