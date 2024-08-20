package com.springbootcrudmongodb.service;

import com.springbootcrudmongodb.model.Medium;
import com.springbootcrudmongodb.model.Subjects;
import com.springbootcrudmongodb.repository.SubjectsRepository;
import com.springbootcrudmongodb.util.SubjectDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class SubjectService {

    @Autowired
    private SubjectsRepository repository;


    public ResponseEntity<String> createSubject(SubjectDto subjectDto) {
        Subjects subject = new Subjects();
        subject.setId(UUID.randomUUID().toString());
        subject.setSubjectName(subjectDto.subjectName());
        subject.setStandard(subjectDto.standard());
        subject.setLanguage(subjectDto.language());
        subject.setPrice(subjectDto.price());
        this.repository.save(subject);
        return new ResponseEntity<>("Subject created successfully", HttpStatus.CREATED);
    }

    public ResponseEntity<Optional<Subjects>> getSubject(String id) {
        Optional<Subjects> subjects = this.repository.findById(id);
        if (subjects.isPresent())
            return new ResponseEntity<>(subjects,HttpStatus.OK);
        else
            return new ResponseEntity<>(Optional.empty(),HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<List<Subjects>> getAllSubjects() {
        return new ResponseEntity<>(new ArrayList<>(this.repository.findAll()), HttpStatus.OK);
    }

    public ResponseEntity<String> updateSubject(String id) {
        Optional<Subjects> subject = this.repository.findById(id);
        SubjectDto subjectDto = new SubjectDto("Hello", Medium.ENGLISH,"10 th",300.9);
        subject.get().setId(id);
        subject.get().setSubjectName(subjectDto.subjectName());
        subject.get().setStandard(subjectDto.standard());
        subject.get().setLanguage(subjectDto.language());
        subject.get().setPrice(subjectDto.price());
        this.repository.save(subject.get());
        return new ResponseEntity<>("Updated", HttpStatus.OK);
    }

    public ResponseEntity<String> updatePriceById(String id) {
        Optional<Subjects> subjects = this.repository.findById(id);
        // you can do your logic here with some modifications
        return  new ResponseEntity<>("Updates", HttpStatus.OK);
    }

    public ResponseEntity<String> updateNameStandardLanguageById(String id) {
        Optional<Subjects> subjects = this.repository.findById(id);
        // you can do your logic here with some modifications
        return  new ResponseEntity<>("Updates", HttpStatus.OK);
    }

    public ResponseEntity<String> deleteSubjectById(String id) {
        Optional<Subjects> subjects = this.repository.findById(id);
        if (subjects.isPresent())
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        else
            return new ResponseEntity<>("Not Updated", HttpStatus.BAD_REQUEST);
    }
}
