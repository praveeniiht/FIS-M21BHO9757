package com.example.microservice.microservice2.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PostsDto {
	
	int postId;
	

	String title;
	

	String author;
	

	String description;
	

	String status;
	public PostsDto() {
		
	}
	public PostsDto(int postId, String title, String author, String description, String status) {
		super();
		this.postId = postId;
		this.title = title;
		this.author = author;
		this.description = description;
		this.status = status;
	}


	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
