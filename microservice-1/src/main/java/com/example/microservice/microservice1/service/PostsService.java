package com.example.microservice.microservice1.service;

import java.util.List;

import com.example.microservice.microservice1.model.Posts;



public interface PostsService {
	
	public Posts addPost(Posts post);
	public void deletePost(int postId);
	public Posts updatePost(Posts post);
	public List<Posts> searchPostsByAuthor(String author);
	public List<Posts> searchPostsByStatus(String status);
	public List<Posts> searchPostsByTitle(String title);
	public Object searchCommentsByPostId(int postId);
	public List<Posts> displayAllPosts();

}
