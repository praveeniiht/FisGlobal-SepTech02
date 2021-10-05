package com.example.eureka.noteseurekaclient.service;

import java.util.List;
import java.util.Optional;

import com.example.eureka.noteseurekaclient.model.Comments;
import com.example.eureka.noteseurekaclient.model.Posts;



public interface PostService {
	
	public List<Posts> displayAll();
	public Posts addPost(Posts post);
	public String deletePost(int pid);
	public Posts updatePost(Posts pid);
	public List<Posts> searchPostsByAuthor(String author);
	public List<Posts> searchPostsByTitle(String title);
	public List<Comments> searchCommentsByPid(int pid);
	public Optional<Posts> getPostsById(int id);

}
