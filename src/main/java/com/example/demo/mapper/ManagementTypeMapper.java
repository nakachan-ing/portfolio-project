package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.ManagementType;

@Mapper
public interface ManagementTypeMapper {

	List<ManagementType> findAll();
	
	List<ManagementType> findGroupByProjectId(int id);
}
