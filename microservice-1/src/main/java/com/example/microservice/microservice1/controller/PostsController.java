package com.example.microservice.microservice1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.microservice1.model.CommentsDto;
import com.example.microservice.microservice1.model.Posts;
import com.example.microservice.microservice1.service.PostsService;


@RestController
@RequestMapping("/posts")
public class PostsController {
	
	@Autowired
	PostsService service;
	
	@GetMapping("/test")
	public String hello() {
		return "Hello";
	}
	@GetMapping("/all")
	public List<Posts> getAllPosts(){
		return service.displayAllPosts();
	}
	
	@PostMapping("/add")
	public Posts addPost(@RequestBody Posts post) {
		return service.addPost(post);
	}
	
	@DeleteMapping("/delete/{postId}")
	public String deletePost(@PathVariable int postId) {
		service.deletePost(postId);
		return "Post deleted";
	}
	
	@PostMapping("/update")
	public Posts updatePost(@RequestBody Posts post) {
		return service.addPost(post);
	}
	
	@GetMapping("/author/{authorName}")
	public List<Posts> searchByAuthor(@PathVariable String authorName){
		return service.searchPostsByAuthor(authorName);
	}
	
	@GetMapping("/status/{statusName}")
	public List<Posts> searchByStatus(@PathVariable String statusName){
		return service.searchPostsByStatus(statusName);
	}
	
	@GetMapping("/title/{titleName}")
	public List<Posts> searchByTitle(@PathVariable String titleName){
		return service.searchPostsByTitle(titleName);
	}
	
	@GetMapping("/comments/{postId}")
	public List<CommentsDto> searchCommentsByPostId(@PathVariable int postId){
		return (List<CommentsDto>) service.searchCommentsByPostId(postId);
	}

}
