package com.example.microservice.microservice1.repo;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.microservice.microservice1.model.Posts;



@Repository
@Transactional
public interface PostsDao extends CrudRepository<Posts,Integer> {

}
