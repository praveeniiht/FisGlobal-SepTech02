package com.example.postservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.postservice.dao.PostsDao;
import com.example.postservice.model.Comments;
import com.example.postservice.model.Posts;


@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	PostsDao postDao;
	
	@Autowired
	RestTemplate restTemplate;

	@Override
	public List<Posts> displayAll() {
		// TODO Auto-generated method stub
		return postDao.findAll();
	}

	@Override
	public Posts addPost(Posts post) {
		// TODO Auto-generated method stub
		return postDao.save(post);
	}

	@Override
	public String deletePost(int pid) {
		// TODO Auto-generated method stub
		postDao.deleteById(pid);
		return "Post Deleted";
	}

	@Override
	public Posts updatePost(Posts post) {
		// TODO Auto-generated method stub
		return postDao.save(post);
	}

	@Override
	public List<Posts> searchPostsByAuthor(String author) {
		// TODO Auto-generated method stub
		List<Posts> data = postDao.findAll();
		List<Posts> result = new ArrayList();
		for(Posts post:data) {
			if(post.getAuthor().equals(author))
				result.add(post);
		}
		return result;
	}

	@Override
	public List<Posts> searchPostsByTitle(String title) {
		// TODO Auto-generated method stub
		List<Posts> data = postDao.findAll();
		List<Posts> result = new ArrayList();
		for(Posts post:data) {
			if(post.getTitle().equals(title))
				result.add(post);
		}
		return result;
	}

	@Override
	public List<Comments> searchCommentsByPid(int pid) {
		// TODO Auto-generated method stub
		String url = "http://localhost:8083/comments/pid/";
		List<Comments> data = restTemplate.getForObject(url+pid, List.class);
		return data;
	}

	@Override
	public Optional<Posts> getPostsById(int id) {
		// TODO Auto-generated method stub
		return postDao.findById(id);
	}

}
