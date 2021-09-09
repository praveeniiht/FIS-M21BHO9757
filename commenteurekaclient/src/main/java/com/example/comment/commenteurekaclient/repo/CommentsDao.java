package com.example.comment.commenteurekaclient.repo;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.comment.commenteurekaclient.model.Comments;



@Repository
@Transactional
public interface CommentsDao extends CrudRepository<Comments,Integer> {

}
