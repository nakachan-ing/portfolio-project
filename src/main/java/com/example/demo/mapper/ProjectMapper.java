package com.example.demo.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Project;

@Mapper
public interface ProjectMapper {

	List<Project> findAll();
	
	Optional<Project> findById(int id);
	
	List<Project> findAllJoin();
	
	Optional<Project> findByIdJoin(int id);
}
