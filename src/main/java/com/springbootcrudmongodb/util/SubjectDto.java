package com.springbootcrudmongodb.util;

import com.springbootcrudmongodb.model.Medium;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public record SubjectDto(
         String subjectName,
         Medium language,
         String standard,
         double price
){}
