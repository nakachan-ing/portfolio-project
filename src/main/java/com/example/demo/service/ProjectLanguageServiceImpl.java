package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ProjectLanguage;
import com.example.demo.mapper.ProjectLanguageMapper;

@Service
public class ProjectLanguageServiceImpl implements ProjectLanguageService {

	private final ProjectLanguageMapper projectLanguageMapper;
	
	@Autowired
	public ProjectLanguageServiceImpl(ProjectLanguageMapper projectLanguageMapper) {
		this.projectLanguageMapper = projectLanguageMapper;
	}
	
	@Override
	public void insertProjectLanguage(ProjectLanguage projectLanguage) {
		projectLanguageMapper.insertProjectLanguage(projectLanguage);
	}

}
