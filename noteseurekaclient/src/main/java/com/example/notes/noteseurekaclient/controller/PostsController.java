package com.example.notes.noteseurekaclient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notes.noteseurekaclient.model.CommentsDto;
import com.example.notes.noteseurekaclient.model.Posts;
import com.example.notes.noteseurekaclient.repo.service.PostsService;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;


@RestController
@RequestMapping("/posts")
public class PostsController {
	
	@Autowired
	PostsService service;
	
	@Autowired
    private DiscoveryClient client;

	
	@GetMapping("/test")
	public List<ServiceInstance> hello() {
		List<ServiceInstance> insts = client.getInstances("COMMENTSERVICE");
		insts.forEach(System.out::println);
		
		return insts;
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
//localhost:8081/posts/comments/
