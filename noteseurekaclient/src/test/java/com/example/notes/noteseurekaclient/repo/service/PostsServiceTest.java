package com.example.notes.noteseurekaclient.repo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.example.notes.noteseurekaclient.model.Posts;
import com.example.notes.noteseurekaclient.repo.PostsDao;

class PostsServiceTest {
	
	@Mock
	PostsDao dao;
	
	@InjectMocks
	PostsServiceImpl service;

	List<Posts> data;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		//service =new PostsServiceImpl();
		data = new ArrayList();
		data.add(new Posts(1,"sunny","java","OOPS Program","done"));
		data.add(new Posts(2,"kishore","oracle","best rdbms","done"));
	}

	@Test
	void testAddPost() {
	//	fail("Not yet implemented");
		Posts post = new Posts(1,"sunny","java","OOPS Program","done");
		Mockito.when(dao.save(post)).thenReturn(post);
		
		Posts result = service.addPost(post);
		assertEquals(result.getPostId(), post.getPostId());
		
	}

	@Test
	void testDeletePost() {
	//	fail("Not yet implemented");
	}

	@Test
	void testUpdatePost() {
		//fail("Not yet implemented");
	}

	@Test
	void testSearchPostsByAuthor() {
		//fail("Not yet implemented");
	}

	@Test
	void testSearchPostsByStatus() {
		//fail("Not yet implemented");
	}

	@Test
	void testSearchPostsByTitle() {
		//fail("Not yet implemented");
		
		
	}

	@Test
	void testSearchCommentsByPostId() {
	//	fail("Not yet implemented");
	}

	@Test
	void testDisplayAllPosts() {
	//	fail("Not yet implemented");
		Mockito.when(dao.findAll()).thenReturn(data);
		List<Posts> temp = service.displayAllPosts();
		assertEquals(temp.size(),2);
	}

}
