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

import com.ucan.answerMgmt.service.DiscussionSessionService;
import com.ucan.sharedLib.DiscussionSession;
import com.ucan.sharedLib.URLConstants;

@Named
@Path("/v1.0/")
public class DiscussionSessionRest {
	
	@Autowired
	DiscussionSessionService sService;
	
	@POST
	@Path(URLConstants.POST_DISCUSSION_SESSION_URL)
	@Produces(MediaType.APPLICATION_JSON)
	public void createDiscussionSession(@RequestBody List<DiscussionSession> sessionList) {
		System.out.println("in post db session service");
		sService.createDiscussionSession(sessionList);		
	}
	
	@GET
	@Path(URLConstants.GET_USER_DISCUSSION_SESSION_URL)
	@Produces(MediaType.APPLICATION_JSON)
	public List<DiscussionSession> getUserNegotiationDiscussionSession(@PathParam("userid") long uid)
	{
		return sService.getUserDiscussionSession(uid);
	}

}