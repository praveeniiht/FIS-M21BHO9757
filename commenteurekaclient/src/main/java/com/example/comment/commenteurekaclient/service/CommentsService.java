package com.example.comment.commenteurekaclient.service;

import java.util.List;

import com.example.comment.commenteurekaclient.model.Comments;
import com.example.comment.commenteurekaclient.model.PostsDto;



public interface CommentsService {
	
	public List<Comments> displayAllComments();
	public Comments addComments(Comments comment);
	public void deleteComment(int commentId);
	public List<Comments> searchCommentsByPostId(int postId);
	public List<Comments> searchCommentsBycomenterName(String comenterName);
	public List<PostsDto> searchPostByComenterName(String comenterName);
}
