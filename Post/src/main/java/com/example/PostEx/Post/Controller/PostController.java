package com.example.PostEx.Post.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.PostEx.Post.Entity.Comments;
import com.example.PostEx.Post.Entity.Post;
import com.example.PostEx.Post.Repository.CommentsRepo;
import com.example.PostEx.Post.Repository.PostRepo;

@RestController
public class PostController {
	@Autowired
	PostRepo postrepo;
	@Autowired
	CommentsRepo commentRepo;
	
	@PostMapping("/post")
	public Post saveAllPost(@RequestBody Post post){
		System.out.println(post);
		return postrepo.save(post);
		 
		 
		 
	}
	@GetMapping("/getAll")
	public List<Post> getAllPost() {
		
		return postrepo.findAll();
		}
	
	@GetMapping("/messages")
	public String message() {
		return "Message is working";
	}
}
