package com.ucan.answerMgmt.rest;


import java.util.List;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.ucan.sharedLib.URLConstants;
import com.ucan.sharedLib.Answer;
import com.ucan.answerMgmt.service.AnswerService;

@Named
@Path("/v1.0/")
public class AnswerRest {
	@Autowired
	AnswerService answerServe;

	@GET
	@Path(URLConstants.GET_ANSWER_URL)
	@Produces(MediaType.APPLICATION_JSON)
	public Answer getAnswer(@PathParam("id") long id) {
		System.out.println("in get one db answer service");
		Answer u = answerServe.getOneAnswer(id);

		return u;

	}

	@POST
	@Path(URLConstants.POST_ANSWER_URL)
	@Produces(MediaType.APPLICATION_JSON)
	public void createAnswer(@RequestBody Answer u) {
		System.out.println("in post db answer service");
		answerServe.createAnswer(u);
	}

	@GET
	@Path(URLConstants.GET_SESSION_ANSWERS_URL)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Answer> getSessionAnswers(@PathParam("dsid") long sid) {
		System.out.println("in get one db message service");
		List<Answer> answerList = answerServe.getSessionAnswers(sid);

		return answerList;

	}
}
