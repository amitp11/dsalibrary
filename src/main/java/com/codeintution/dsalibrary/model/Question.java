package com.codeintution.dsalibrary.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "codingQuestions")
public class Question {

    @Id
    private String code;
    private String title;
    private String difficulty;
    private String solution;
    private String createdAt;
    private List<String> tags;
    private List<String> keywords;
}
