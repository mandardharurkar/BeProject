package com.ucan.answerMgmt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ucan.answerMgmt.repository.AnswerRepository;
import com.ucan.sharedLib.Answer;

public class QuestionAnswerService {
	
	@Autowired
	AnswerRepository answerRepo;

	public List<Answer> getAllAnswers(long questionId) {
		return answerRepo.findByownerQuestionId(questionId);
	
	}

	public List<Answer> getUserAllAnswers(long userId) {
		return answerRepo.findByownerUserId(userId);
	}
	
	public void upvoteAnswer(long aId) 
	{
		Answer q = answerRepo.findOne(aId);
		long upvote = q.getUpvoteCount() + 1;
		q.setUpvoteCount(upvote);
		answerRepo.save(q);
	}
	
	public void downvoteAnswer(long qId) 
	{
		Answer q = answerRepo.findOne(qId);
		long upvote = q.getDownvoteCount() + 1;
		q.setDownvoteCount(upvote);
		answerRepo.save(q);
	}


}
