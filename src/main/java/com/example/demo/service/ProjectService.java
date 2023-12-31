package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Project;

public interface ProjectService {
	
	List<Project> findAll();
	
	Optional<Project> findById(int id);
	
	List<Project> findAllJoin();
	
	Optional<Project> findByIdJoin(int id);
	
	int insertProject(Project project);
	
	void updateProject(Project project);
	
	void deleteById(int id);

}
