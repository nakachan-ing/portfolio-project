package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.ProjectLanguage;

@Mapper
public interface ProjectLanguageMapper {
	
	void insertProjectLanguage(ProjectLanguage projectLanguage);
}
