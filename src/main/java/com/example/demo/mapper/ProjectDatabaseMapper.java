package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.ProjectDatabase;

@Mapper
public interface ProjectDatabaseMapper {

	void insertProjectDatabase(ProjectDatabase projectDatabase);
}
