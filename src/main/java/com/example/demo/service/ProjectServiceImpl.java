package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Project;
import com.example.demo.mapper.ProjectMapper;

@Service
public class ProjectServiceImpl implements ProjectService {

	private final ProjectMapper projectMapper;
	
	@Autowired
	public ProjectServiceImpl(ProjectMapper projectMapper) {
		this.projectMapper = projectMapper;
	}
	
	@Override
	public List<Project> findAll() {
		return projectMapper.findAll();
	}

	@Override
	public Optional<Project> findById(int id) {
		return projectMapper.findById(id);
	}

}
