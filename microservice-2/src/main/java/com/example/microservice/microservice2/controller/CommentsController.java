package com.example.microservice.microservice2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.microservice2.model.Comments;
import com.example.microservice.microservice2.model.PostsDto;
import com.example.microservice.microservice2.service.CommentsService;
//http://localhost:8082/comments/postId/5
@RestController
@RequestMapping("comments")
public class CommentsController {
	
	@Autowired
	CommentsService service;
	
	@GetMapping("/all")
	public List<Comments> getAll(){
		return service.displayAllComments();
	}
	
	@PostMapping("/add")
	public Comments addComment(@RequestBody Comments comment) {
		return service.addComments(comment);
	}
	
	@DeleteMapping("/delete/{commentId}")
	public String deleteComment(@PathVariable int commentId) {
		service.deleteComment(commentId);
		return "comment deleted";
	}
	
	@GetMapping("/postId/{postId}")
	public List<Comments> searchCommentsByPostId(@PathVariable int postId){
		return service.searchCommentsByPostId(postId);
	}
	
	@GetMapping("/name/{comenterName}")
	public List<Comments> searchCommentsBycomenterName(@PathVariable String comenterName){
		return (List<Comments>) service.searchCommentsBycomenterName(comenterName);
	}

	@GetMapping("/posts/{name}")
	public List<PostsDto> searchPostByComenterName(@PathVariable String name){
		return (List<PostsDto>) service.searchPostByComenterName(name);
	}
	
}
