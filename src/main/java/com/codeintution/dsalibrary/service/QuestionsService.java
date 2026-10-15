package com.codeintution.dsalibrary.service;

import com.codeintution.dsalibrary.model.Questions;
import com.codeintution.dsalibrary.repository.QuestionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsService {

    private final QuestionsRepository repo;

    public QuestionsService(QuestionsRepository repo) {
        this.repo = repo;
    }

    public Questions save(Questions q) {
        return repo.save(q);
    }

    public List<Questions> getAll() {
        return repo.findAll();
    }

    public Questions getById(String id) {
        return repo.findById(id).orElse(null);
    }

    public Questions update(String id, Questions q) {
        q.setId(id);
        return repo.save(q);
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}
