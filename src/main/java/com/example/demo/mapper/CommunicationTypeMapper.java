package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.CommunicationType;

@Mapper
public interface CommunicationTypeMapper {

	List<CommunicationType> findAll();
	
	List<CommunicationType> findGroupByProjectId(int id);
}
