package com.codeintution.dsalibrary.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "codingQuestions")
public class Questions {

    @Id
    private String id;

    private String title;
    private String difficulty;
    private String solution;
    private String createdAt;

    private String[] tags;
    private String[] keywords;
}
