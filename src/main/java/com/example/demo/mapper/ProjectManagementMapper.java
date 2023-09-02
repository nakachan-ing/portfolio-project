package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.ProjectManagement;

@Mapper
public interface ProjectManagementMapper {

	void insertProjectManagement(ProjectManagement projectManagement);
}
