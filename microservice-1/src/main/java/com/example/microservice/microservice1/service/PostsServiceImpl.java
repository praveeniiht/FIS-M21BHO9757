package com.example.microservice.microservice1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.microservice.microservice1.model.Posts;
import com.example.microservice.microservice1.repo.PostsDao;

@Service
public class PostsServiceImpl implements PostsService {

	@Autowired
	PostsDao dao;

	@Override
	public Posts addPost(Posts post) {
		// TODO Auto-generated method stub
		return dao.save(post);
	}

	@Override
	public void deletePost(int postId) {
		// TODO Auto-generated method stub
		dao.deleteById(postId);
	}

	@Override
	public Posts updatePost(Posts post) {
		// TODO Auto-generated method stub
		return dao.save(post);
	}

	@Override
	public List<Posts> searchPostsByAuthor(String author) {
		// TODO Auto-generated method stub
		List<Posts> data = (List<Posts>) dao.findAll();
		List<Posts> temp = new ArrayList<>();
		for(Posts post:data) {
			if(post.getAuthor().equals(author)) {
				temp.add(post);
			}
		}
		return temp;
	}

	@Override
	public List<Posts> searchPostsByStatus(String status) {
		// TODO Auto-generated method stub
		List<Posts> data = (List<Posts>) dao.findAll();
		List<Posts> temp = new ArrayList<>();
		for(Posts post:data) {
			if(post.getStatus().equals(status)) {
				temp.add(post);
			}
		}
		return temp;
	}

	@Override
	public List<Posts> searchPostsByTitle(String title) {
		// TODO Auto-generated method stub
		List<Posts> data = (List<Posts>) dao.findAll();
		List<Posts> temp = new ArrayList<>();
		for(Posts post:data) {
			if(post.getTitle().equals(title)) {
				temp.add(post);
			}
		}
		return temp;
	}

	@Override
	public Object searchCommentsByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Posts> displayAllPosts() {
		// TODO Auto-generated method stub
		return (List<Posts>) dao.findAll();
	}

}
