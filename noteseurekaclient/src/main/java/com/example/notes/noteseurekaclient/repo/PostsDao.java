package com.example.notes.noteseurekaclient.repo;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.notes.noteseurekaclient.model.Posts;


@Repository
@Transactional
public interface PostsDao extends CrudRepository<Posts,Integer> {

}
