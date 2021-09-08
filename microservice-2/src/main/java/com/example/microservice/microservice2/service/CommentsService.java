package com.example.microservice.microservice2.service;

import com.example.microservice.microservice2.model.Comments;
import com.example.microservice.microservice2.model.PostsDto;

import java.util.*;

public interface CommentsService {
	
	public List<Comments> displayAllComments();
	public Comments addComments(Comments comment);
	public void deleteComment(int commentId);
	public List<Comments> searchCommentsByPostId(int postId);
	public List<Comments> searchCommentsBycomenterName(String comenterName);
	public List<PostsDto> searchPostByComenterName(String comenterName);
}
