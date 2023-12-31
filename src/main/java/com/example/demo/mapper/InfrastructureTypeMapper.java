package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.InfrastructureType;

@Mapper
public interface InfrastructureTypeMapper {

	List<InfrastructureType> findAll();
	
	List<InfrastructureType> findGroupByProjectId(int id);
}
