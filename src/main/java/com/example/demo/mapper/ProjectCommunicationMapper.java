package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.ProjectCommunication;

@Mapper
public interface ProjectCommunicationMapper {

	void insertProjectCommunication(ProjectCommunication projectCommunication);
}
