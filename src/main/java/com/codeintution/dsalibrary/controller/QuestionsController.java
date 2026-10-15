package com.codeintution.dsalibrary.controller;

import com.codeintution.dsalibrary.model.Questions;
import com.codeintution.dsalibrary.service.QuestionsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionsController {

    private final QuestionsService service;

    public QuestionsController(QuestionsService service) {
        this.service = service;
    }

    @PostMapping
    public Questions create(@RequestBody Questions q) {
        return service.save(q);
    }

    @GetMapping
    public List<Questions> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Questions getOne(@PathVariable String id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public Questions update(@PathVariable String id, @RequestBody Questions q) {
        return service.update(id, q);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
