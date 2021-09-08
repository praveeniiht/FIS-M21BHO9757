package com.example.microservice.microservice2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="comments")
public class Comments {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int commentId;
	
	@Column
	int postId;
	@Column
	String comenterName;
	
	@Column
	String comment;
	
	public Comments() {
		
	}
	
	public Comments(int commentId, int postId, String comenterName, String comment) {
		super();
		this.commentId = commentId;
		this.postId = postId;
		this.comenterName = comenterName;
		this.comment = comment;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getComenterName() {
		return comenterName;
	}

	public void setComenterName(String comenterName) {
		this.comenterName = comenterName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
