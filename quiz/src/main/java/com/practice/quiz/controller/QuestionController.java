package com.practice.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.quiz.model.Question;
import com.practice.quiz.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {

	@Autowired
	QuestionService questionService;
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return new ResponseEntity<>(questionService.getAllQuestions(), HttpStatus.OK);
    }
    @GetMapping("category/{category}")
    public List<Question> getAllQuestionsByCategory(@PathVariable String category)
    {
    	return questionService.getQuestionsByCategory(category);
    }
    @PostMapping("add")
    public String addQuestion(@RequestBody Question question)
    {
    	questionService.addQuestion(question);
    	return "question added to database"; 
    }
    @PutMapping("update/{id}")
    public String updateQuestion(@PathVariable Integer id, @RequestBody Question question)
    {
    	questionService.updateQuestion(id, question);
    	return "Updated Successfully"+question;
    }
    @DeleteMapping("delete/{id}")
    public String deleteQuestion(@PathVariable Integer id)
    {
    	questionService.deleteQuestion(id);
    	return "Deleted Successfully"+id;
    }
}