package com.example.microservice.microservice2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.microservice.microservice2.model.Comments;
import com.example.microservice.microservice2.model.PostsDto;
import com.example.microservice.microservice2.repo.CommentsDao;


@Service
public class CommentsServiceImpl implements CommentsService{
	
	@Autowired
	CommentsDao dao;
	
	@Autowired
	RestTemplate template;

	@Override
	public Comments addComments(Comments comment) {
		// TODO Auto-generated method stub
		return dao.save(comment);
	}

	@Override
	public void deleteComment(int commentId) {
		// TODO Auto-generated method stub
		dao.deleteById(commentId);
		
	}

	@Override
	public List<Comments> searchCommentsByPostId(int postId) {
		// TODO Auto-generated method stub
		List<Comments> data = new ArrayList();
		List<Comments> comments = (List<Comments>) dao.findAll();
		for(Comments com :comments) {
			if(com.getPostId()==postId) {
				data.add(com);
			}
		}
		return data;
	}

	@Override
	public List<Comments> searchCommentsBycomenterName(String comenterName) {
		// TODO Auto-generated method stub
		List<Comments> data = new ArrayList();
		List<Comments> comments = (List<Comments>) dao.findAll();
		for(Comments com :comments) {
			if(com.getComenterName().equals(comenterName) ){
				data.add(com);
			}
		}
		return data;
	}

	@Override
	public List<PostsDto> searchPostByComenterName(String comenterName) {
		// TODO Auto-generated method stub
		//we have to connect to microservice1 for the data
		
	List<PostsDto> data=	template.getForObject("http://localhost:8081/posts/author/"+comenterName, List.class);
		return data;	
	}

	@Override
	public List<Comments> displayAllComments() {
		// TODO Auto-generated method stub
		return (List<Comments>) dao.findAll();
	}

}
