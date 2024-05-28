package com.springbootcrudmongodb.controller;

import com.springbootcrudmongodb.model.Subjects;
import com.springbootcrudmongodb.service.SubjectService;
import com.springbootcrudmongodb.util.SubjectDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class SubjectController {

    @Autowired
    private SubjectService service;


    @PostMapping(value = "/createSubject")
    public ResponseEntity<String> createSubject(@RequestBody SubjectDto subjectDto){
       return this.service.createSubject(subjectDto);
    }

    @GetMapping(value = "/getSubject/{id}")
    public ResponseEntity<Optional<Subjects>> getSubject(@PathVariable String id){
        return this.service.getSubject(id);
    }

    @GetMapping(value = "/getAllSubjects")
    public ResponseEntity<List<Subjects>> getAllSubjects(){
        return this.service.getAllSubjects();
    }

    @PutMapping(value = "/updateSubject/{id}")
    public ResponseEntity<String> updateSubject(@PathVariable String id){
        return this.service.updateSubject(id);
    }

    @PatchMapping(value = "/updatePriceById/{id}")
    public ResponseEntity<String> updatePriceById(@PathVariable String id){
        return this.service.updatePriceById(id);
    }

    @PatchMapping(value = "/updateNameStandardLanguageById/{id}")
    public ResponseEntity<String> updateNameStandardLanguageById(@PathVariable String id){
        return this.service.updateNameStandardLanguageById(id);
    }

    @DeleteMapping(value = "/deleteSubjectById/{id}")
    public ResponseEntity<String> deleteSubjectById(@PathVariable String id){
        return this.service.deleteSubjectById(id);
    }


}
