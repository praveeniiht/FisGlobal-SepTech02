package com.example.commentservice.controller;

import java.util.List;

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

import com.example.commentservice.model.Comments;
import com.example.commentservice.model.Posts;
import com.example.commentservice.service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	CommentService commentService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Comments>> getAll(){
		return new ResponseEntity(commentService.getAll(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Comments> addComment(@RequestBody Comments comment){
		return new ResponseEntity(commentService.addComment(comment), HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<Comments> updateComment(@RequestBody Comments comment){
		return new ResponseEntity(commentService.updateComment(comment), HttpStatus.ACCEPTED);
	}
	@DeleteMapping("/delete/{cid}")
	public ResponseEntity<String> deleteComment(int cid){
		return new ResponseEntity(commentService.deleteComment(cid), HttpStatus.ACCEPTED);
	}
	@GetMapping("/pid/{pid}")
	public ResponseEntity<List<Comments>> getAllByPid(@PathVariable("pid") int pid){
		return new ResponseEntity(commentService.getCommentsByPostId(pid),HttpStatus.OK);
	}
	
	@GetMapping("/post/{pid}")
	public ResponseEntity<List<Posts>> getAllPostsById(@PathVariable("pid") int pid){
		return new ResponseEntity(commentService.getPostByPostId(pid), HttpStatus.OK);
	}
}
// localhost:8083/comments/pid/1001