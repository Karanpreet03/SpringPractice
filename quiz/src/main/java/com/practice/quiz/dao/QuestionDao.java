package com.practice.quiz.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.quiz.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {
// JpaRepository just requires two things that is table name and type of ID
	List<Question> findByCategory(String category);
}
