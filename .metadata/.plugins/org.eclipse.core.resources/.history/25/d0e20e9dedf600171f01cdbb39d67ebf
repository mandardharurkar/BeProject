package com.ucan.questionMgmt.rest;

import java.util.List;

import javax.inject.Named;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.ucan.questionMgmt.service.QuestionTagService;
import com.ucan.sharedLib.Question;
import com.ucan.sharedLib.Topic;
import com.ucan.sharedLib.URLConstants;



@Named
@Path("/v1.0/")
public class QuestionTagRest 
{
		@Autowired
		QuestionTagService tqServe;
		
		
		/* function to fetch the tags of a question */
		@GET
		@Path(URLConstants.GET_TAGS_QUESTION_URL)
		@Produces(MediaType.APPLICATION_JSON)
		public List<Topic> getTags(@PathParam("questionid") long qId)
		{
			System.out.println("in get topic question service");
			return tqServe.getTags(qId);			
		}
		
		/* function to fetch the questions of multiple topics when ids are given */
		@GET
		@Path(URLConstants.GET_QUESTIONS_TAGS_URL)
		@Produces(MediaType.APPLICATION_JSON)
		public List<Question> getQuestions(@RequestBody List<Topic> topicId)
		{
			System.out.println("in get question of topics service");
			return tqServe.getQuestionsService(topicId);			
		}
		
		/* Function to get questions belonging to topics of interest of particular user */
		@GET
		@Path(URLConstants.GET_QUESTIONS_TOPIC_INTERESTED)
		@Produces(MediaType.APPLICATION_JSON)
		public List<Question> getInterestedTopicQuestions(@PathParam("userid") long uid)
		{
			return tqServe.getInterestedTopicQuestions(uid);
		}
		
		/* Function to get questions belonging to topics of expertise of particular user */
		@GET
		@Path(URLConstants.GET_QUESTIONS_TOPIC_EXPERTISE)
		@Produces(MediaType.APPLICATION_JSON)
		public List<Question> getExpertiseTopicQuestions(@PathParam("userid") long uid)
		{
			return tqServe.getExpertiseTopicQuestions(uid);
		}
		
		/* function: to add multiple tags to a question.
		 * input   : Request Body - List of topics with id field, Path parameter the question id.
		 * output  : particular tag assigned to question.
		 */
		@POST
		@Path(URLConstants.POST_TAGS_QUESTION_URL)
		@Produces(MediaType.APPLICATION_JSON)
		public Question addTags(@PathParam("questionid") long qId,@RequestBody List<Topic> tList )
		{
			System.out.println("in post topic question service for one tag");
			return tqServe.addTagService(qId, tList);
		}

		/* function: to delete a tag assigned to a question.
		 * input   : Path parameter the question id, topic id.
		 * output  : Particular tag is removed from question.
		 */
		@DELETE
		@Path(URLConstants.DELETE_TAG_QUESTION_URL)
		@Produces(MediaType.APPLICATION_JSON)
		public Question removeTag(@PathParam("questionid") long qId,@PathParam("tagid") long topicId )
		{
			System.out.println("in delete topic question service for one tag");
			return tqServe.removeTagService(qId, topicId);	
		}
	
}
