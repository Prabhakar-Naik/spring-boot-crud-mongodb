package com.springbootcrudmongodb.util;

import com.springbootcrudmongodb.model.Medium;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@Setter
@Getter
public record SubjectDto(
         String subjectName,
         Medium language,
         String standard,
         double price
){
    public SubjectDto(String subjectName, Medium language, String standard, double price) {
        this.subjectName = subjectName;
        this.language = language;
        this.standard = standard;
        this.price = price;
    }
}
