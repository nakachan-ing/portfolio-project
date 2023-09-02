package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProjectFramework;
import com.example.demo.mapper.ProjectFrameworkMapper;

@Service
public class ProjectFrameworkServiceImpl implements ProjectFrameworkService {

	private final ProjectFrameworkMapper projectFrameworkMapper;
	
	@Autowired
	public ProjectFrameworkServiceImpl(ProjectFrameworkMapper projectFrameworkMapper) {
		this.projectFrameworkMapper = projectFrameworkMapper;
	}
	
	@Override
	public void insertProjectFramework(ProjectFramework projectFramework) {
		projectFrameworkMapper.insertProjectFramework(projectFramework);

	}

}
