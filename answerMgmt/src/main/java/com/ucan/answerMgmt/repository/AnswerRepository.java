package com.ucan.answerMgmt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ucan.sharedLib.Answer;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> 
{
	List<Answer> findByownerQuestionId(long questionId);
	List<Answer> findByownerUserId(long userId);
	List<Answer> findBysession(long sid);
	
	
}
