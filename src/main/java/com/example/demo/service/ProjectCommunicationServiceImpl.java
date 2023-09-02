package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProjectCommunication;
import com.example.demo.mapper.ProjectCommunicationMapper;

@Service
public class ProjectCommunicationServiceImpl implements ProjectCommunicationService {

	private final ProjectCommunicationMapper projectCommunicationMapper;
	
	@Autowired
	public ProjectCommunicationServiceImpl(ProjectCommunicationMapper projectCommunicationMapper) {
		this.projectCommunicationMapper = projectCommunicationMapper;
	}
	
	@Override
	public void insertProjectCommunication(ProjectCommunication projectCommunication) {
		projectCommunicationMapper.insertProjectCommunication(projectCommunication);

	}

}
