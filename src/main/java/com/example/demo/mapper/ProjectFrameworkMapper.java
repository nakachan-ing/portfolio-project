package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.ProjectFramework;

@Mapper
public interface ProjectFrameworkMapper {

	void insertProjectFramework(ProjectFramework projectFramework);
}
