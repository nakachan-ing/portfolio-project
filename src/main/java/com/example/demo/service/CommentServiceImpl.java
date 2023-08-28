package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Comment;
import com.example.demo.mapper.CommentMapper;

@Service
public class CommentServiceImpl implements CommentService {

	private final CommentMapper commentMapper;
	
	@Autowired
	public CommentServiceImpl(CommentMapper commentMapper) {
		this.commentMapper = commentMapper;
	}
	
	@Override
	public List<Comment> findAll() {
		return commentMapper.findAll();
	}

	@Override
	public Optional<Comment> findById(int id) {
		return commentMapper.findById(id);
	}

	@Override
	public Optional<Comment> findByIdJoinProject(int id) {
		return commentMapper.findByIdJoinProject(id);
	}

	@Override
	public void insertComment(Comment comment) {
		commentMapper.insertComment(comment);
	}
	
	@Override
	public void updateComment(Comment comment) {
		commentMapper.updateComment(comment);
	}
	
	@Override
	public void deleteByProjectId(int ProjectId) {
		commentMapper.deleteByProjectId(ProjectId);
	}

}
