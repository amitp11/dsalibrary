package com.codeintution.dsalibrary.dtos;

import com.codeintution.dsalibrary.model.Question;

import java.util.List;

public record QuestionResponse(
        String code,
        String title,
        String difficulty,
        String solution,
        String createdAt,
        List<String> tags,
        List<String> keywords
) {

    public static QuestionResponse from(Question question) {

        return new QuestionResponse(
                question.getCode(),
                question.getTitle(),
                question.getDifficulty(),
                question.getSolution(),
                question.getCreatedAt(),
                question.getTags(),
                question.getKeywords()
        );
    }
}
