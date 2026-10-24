package com.codeintution.dsalibrary.dtos;

import com.codeintution.dsalibrary.model.Question;

import java.util.List;

public record CreateQuestionRequest (

    String code,
    String title,
    String difficulty,
    String solution,
    String createdAt,
    List<String> tags,
    List<String> keywords
){
    public Question toEntity() {

        Question question = new Question();

        question.setCode(code);
        question.setTitle(title);
        question.setDifficulty(difficulty);
        question.setSolution(solution);
        question.setTags(tags);
        question.setKeywords(keywords);

        return question;
    }
}
