package com.ucan.Negotiation.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ucan.sharedLib.NegotiationSession;



@Repository
public interface SessionRepository extends CrudRepository<NegotiationSession, Long> 
{
	List<NegotiationSession> findByseeker(long uid);
	List<NegotiationSession> findByexpert(long uid);
}
