package com.ucan.answerMgmt.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucan.answerMgmt.repository.DiscussionSessionRepository;
import com.ucan.sharedLib.DiscussionSession;

@Service
public class DiscussionSessionService
{
	@Autowired
	DiscussionSessionRepository sRepo;
	
	public void createDiscussionSession(List<DiscussionSession> sessionList) 
	{
		Iterator<DiscussionSession> sit = sessionList.iterator();
		while(sit.hasNext())
		{
			sRepo.save(sit.next());
		}
	}

	public List<DiscussionSession> getUserDiscussionSession(long uid) 
	{
		List<DiscussionSession> sessions = sRepo.findByseeker(uid);
		sessions.addAll(sRepo.findByexpert(uid));
		return sessions;
	}
	
}