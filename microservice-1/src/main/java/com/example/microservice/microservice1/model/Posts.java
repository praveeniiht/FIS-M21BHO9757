package com.example.microservice.microservice1.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="posts")
public class Posts {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	int postId;
	
	@Column 
	String title;
	
	@Column 
	String author;
	
	@Column
	String description;
	
	@Column
	String status;
	public Posts() {
		
	}
	public Posts(int postId, String title, String author, String description, String status) {
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
