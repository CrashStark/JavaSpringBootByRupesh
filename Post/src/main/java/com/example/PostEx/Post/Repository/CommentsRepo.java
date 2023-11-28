package com.example.PostEx.Post.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PostEx.Post.Entity.Comments;

public interface CommentsRepo extends JpaRepository<Comments, Integer>{

}
