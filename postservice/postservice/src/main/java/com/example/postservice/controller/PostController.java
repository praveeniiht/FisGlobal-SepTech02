package com.example.postservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postservice.model.Comments;
import com.example.postservice.model.Posts;
import com.example.postservice.service.PostService;

@RestController
@RequestMapping("/posts")
public class PostController {

	@Autowired
	PostService postService;

	@GetMapping("/all")
	public ResponseEntity<List<Posts>> getAll() {

		return new ResponseEntity(postService.displayAll(), HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<Posts> addPost(@RequestBody Posts post) {
		return new ResponseEntity(postService.addPost(post), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{pid}")
	public ResponseEntity<String> deletePost(@PathVariable("pid") int pid) {

		String result = postService.deletePost(pid);
		return new ResponseEntity(result, HttpStatus.ACCEPTED);

	}

	@PutMapping("/update")
	public ResponseEntity<Posts> updatePost(@RequestBody Posts post) {

		return new ResponseEntity(postService.updatePost(post), HttpStatus.ACCEPTED);
	}

	@GetMapping("/author/{author}")
	public ResponseEntity<List<Posts>> getAllByAuthorName(@PathVariable("author") String author) {

		return new ResponseEntity(postService.searchPostsByAuthor(author), HttpStatus.OK);
	}
	@GetMapping("/title/{title}")
	public ResponseEntity<List<Posts>> getAllByTitle(@PathVariable("title") String title) {

		return new ResponseEntity(postService.searchPostsByTitle(title), HttpStatus.OK);
	}
	
	@GetMapping("/comments/{pid}")
	public ResponseEntity<List<Comments>> getAllCommentsByPid(@PathVariable("pid") int pid){
		return new ResponseEntity(postService.searchCommentsByPid(pid), HttpStatus.OK);
	}
	
	@GetMapping("/id/{pid}")
	public ResponseEntity<Posts> getPostById(@PathVariable("pid") int pid){
		return new ResponseEntity(postService.getPostsById(pid), HttpStatus.OK);
	}
}
