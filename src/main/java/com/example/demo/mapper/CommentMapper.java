package com.example.demo.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Comment;

@Mapper
public interface CommentMapper {
	
	List<Comment> findAll();
	
	Optional<Comment> findById(int id);
	
	Optional<Comment> findByIdJoinProject(int id);
	
	void insertComment(Comment comment);
	
	void updateComment(Comment comment);
	
	void deleteById(int id);
	
	void deleteByProjectId(int ProjectId);

}
