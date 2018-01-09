package com.ucan.answerMgmt.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucan.sharedLib.Answer;
import com.ucan.answerMgmt.repository.AnswerRepository;

@Service
public class AnswerService {
	@Autowired(required = true)
	AnswerRepository answerRepo;

	public List<Answer> getAllAnswers() {

		List<Answer> answerList = new ArrayList<Answer>();
		System.out.println("in get answer Db service");
		Iterator<Answer> answerIterator = answerRepo.findAll().iterator();
		while (answerIterator.hasNext()) {
			answerList.add(answerIterator.next());
		}
		return answerList;
	}

	public Answer getOneAnswer(long id) {
		try {
			Answer u = answerRepo.findOne(id);
			System.out.println("in get one db answer service");
			return u;
		} catch (Exception e) {
			return null;
		}

	}

	public List<Answer> createAnswer(Answer u) {
		System.out.println("in post db answer service");
		try {
			answerRepo.save(u);
			return getAllAnswers();
		} catch (Exception e) {
			return null;
		}
	}

	public List<Answer> getSessionAnswers(long sid) {
		return answerRepo.findBysession(sid);
	}

}
