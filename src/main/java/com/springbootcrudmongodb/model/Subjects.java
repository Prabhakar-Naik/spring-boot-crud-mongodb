package com.springbootcrudmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Language;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document
public class Subjects {

    @Id
    private String id;
    private String subjectName;
    private Medium language;
    private String standard;
    private double price;
}
