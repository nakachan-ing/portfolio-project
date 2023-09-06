package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.FrameworkType;

@Mapper
public interface FrameworkTypeMapper {

	List<FrameworkType> findAll();
	
	List<FrameworkType> findGroupByProjectId(int id);
}
