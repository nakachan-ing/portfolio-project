package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Comment;

public interface CommentService {
	
	List<Comment> findAll();
	
	Optional<Comment> findById(int id);
	
	Optional<Comment> findByIdJoinProject(int id);
	
	void insertComment(Comment comment);
	
	void deleteByProjectId(int ProjectId);

}
