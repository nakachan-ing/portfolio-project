package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProjectDatabase;
import com.example.demo.mapper.ProjectDatabaseMapper;

@Service
public class ProjectDatabaseServiceImpl implements ProjectDatabaseService {

	private final ProjectDatabaseMapper projectDatabaseMapper;
	
	@Autowired
	public ProjectDatabaseServiceImpl(ProjectDatabaseMapper projectDatabaseMapper) {
		this.projectDatabaseMapper = projectDatabaseMapper;
	}
	
	@Override
	public void insertProjectDatabase(ProjectDatabase projectDatabase) {
		projectDatabaseMapper.insertProjectDatabase(projectDatabase);

	}

}
