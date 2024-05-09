package com.practice.quiz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.quiz.dao.QuestionDao;
import com.practice.quiz.model.Question;

@Service
public class QuestionService {

	@Autowired
	QuestionDao questionDao;
	public List<Question> getAllQuestions() {
		return questionDao.findAll();
	}
	public List<Question> getQuestionsByCategory(String category) {
		return questionDao.findByCategory(category);
	}
	public String addQuestion(Question question)
	{
		questionDao.save(question);
		return "success";
	}
	public String deleteQuestion(Integer id) {
		questionDao.deleteById(id);
		return "Deleted Successfully" +id;
		
	}
	public String updateQuestion(Integer id, Question question) {
		Optional<Question> existingQuestionOptional = questionDao.findById(id);
        if (existingQuestionOptional.isPresent()) {
            Question existingQuestion = existingQuestionOptional.get();
            existingQuestion.setCategory(question.getCategory());
            existingQuestion.setDifficulty(question.getDifficulty());
            existingQuestion.setOption1(question.getOption1());
            existingQuestion.setOption2(question.getOption2());
            existingQuestion.setOption3(question.getOption3());
            existingQuestion.setOption4(question.getOption4());
            existingQuestion.setQuestion(question.getQuestion());
            existingQuestion.setRightAnswer(question.getRightAnswer());
            questionDao.save(existingQuestion);
        }
        return "Updated Successfully "+question;
	}

}
