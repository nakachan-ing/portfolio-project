package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProjectInfrastructure;
import com.example.demo.mapper.ProjectInfrastructureMapper;

@Service
public class ProjectInfrastructureServiceImpl implements ProjectInfrastructureService {

	private final ProjectInfrastructureMapper projectInfrastructureMapper;
	
	@Autowired
	
	public ProjectInfrastructureServiceImpl(ProjectInfrastructureMapper projectInfrastructureMapper) {
		this.projectInfrastructureMapper = projectInfrastructureMapper;
	}
	
	@Override
	public void insertProjectInfrastructure(ProjectInfrastructure projectInfrastructure) {
		projectInfrastructureMapper.insertProjectInfrastructure(projectInfrastructure);

	}

}
