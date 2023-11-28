package com.example.PostEx.Post.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PostEx.Post.Entity.Post;

public interface PostRepo extends JpaRepository<Post, Integer> {

}
