package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProjectManagement;
import com.example.demo.mapper.ProjectManagementMapper;

@Service
public class ProjectManagementServiceImpl implements ProjectManagementService {

	private final ProjectManagementMapper projectManagementMapper;
	
	@Autowired
	public ProjectManagementServiceImpl(ProjectManagementMapper projectManagementMapper) {
		this.projectManagementMapper = projectManagementMapper;
	}
	
	@Override
	public void insertProjectManagement(ProjectManagement projectManagement) {
		projectManagementMapper.insertProjectManagement(projectManagement);

	}

}
