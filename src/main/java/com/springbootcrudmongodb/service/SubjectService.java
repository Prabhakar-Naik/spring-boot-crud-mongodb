package com.springbootcrudmongodb.service;

import com.springbootcrudmongodb.model.Subjects;
import com.springbootcrudmongodb.repository.SubjectsRepository;
import com.springbootcrudmongodb.util.SubjectDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectService {

    @Autowired
    private SubjectsRepository repository;


    public ResponseEntity<String> createSubject(SubjectDto subjectDto) {
    }

    public ResponseEntity<Optional<Subjects>> getSubject(String id) {
    }

    public ResponseEntity<List<Subjects>> getAllSubjects() {
    }

    public ResponseEntity<String> updateSubject(String id) {
    }

    public ResponseEntity<String> updatePriceById(String id) {
    }

    public ResponseEntity<String> updateNameStandardLanguageById(String id) {
    }

    public ResponseEntity<String> deleteSubjectById(String id) {
    }
}
