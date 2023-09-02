package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.ProjectInfrastructure;

@Mapper
public interface ProjectInfrastructureMapper {

	void insertProjectInfrastructure(ProjectInfrastructure projectInfrastructure);
}
