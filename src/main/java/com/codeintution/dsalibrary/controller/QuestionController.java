package com.codeintution.dsalibrary.controller;

import com.codeintution.dsalibrary.model.Question;
import com.codeintution.dsalibrary.service.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionService service;

    public QuestionController(QuestionService service) {
        this.service = service;
    }

    @PostMapping
    public Question create(@RequestBody Question q) {
        return service.save(q);
    }

    @GetMapping
    public List<Question> getAll() {
        return service.getAll();
    }

    @GetMapping("/getByCode/{code}")
    public ResponseEntity<?> getByCode(@PathVariable String code) {
        Question questions = service.getByCode(code);
        if (questions == null)
            return ResponseEntity.status(404).body("No question found for code: " + code);
        return ResponseEntity.ok(questions);
    }
}
