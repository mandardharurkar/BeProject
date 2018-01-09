package com.ucan.sharedLib;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "Answers")
public class Answer implements Serializable
{
	@Id
	@GeneratedValue
	private long id;
	private String description;
	private long upvoteCount;
	private long downvoteCount;
	
	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Question ownerQuestion;
	

	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	private User ownerUser;
	
	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	private DiscussionSession session;
	
	
	public DiscussionSession getSession() {
		return session;
	}

	public void setSession(DiscussionSession session) {
		this.session = session;
	}

	public long getUpvoteCount() {
		return upvoteCount;
	}

	public void setUpvoteCount(long upvoteCount) {
		this.upvoteCount = upvoteCount;
	}

	public long getDownvoteCount() {
		return downvoteCount;
	}

	public void setDownvoteCount(long downvoteCount) {
		this.downvoteCount = downvoteCount;
	}
		public User getOwnerUser() {
		return ownerUser;
	}
	
	public void setOwnerUser(User ownerUser) {
		this.ownerUser = ownerUser;
	}
	
	public Question getOwnerQuestion() {
		return ownerQuestion;
	}
	public void setOwnerQuestion(Question ownerQuestion) {
		this.ownerQuestion = ownerQuestion;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
