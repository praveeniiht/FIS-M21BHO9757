package com.example.microservice.microservice2.repo;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.microservice.microservice2.model.Comments;


@Repository
@Transactional
public interface CommentsDao extends CrudRepository<Comments,Integer> {

}
