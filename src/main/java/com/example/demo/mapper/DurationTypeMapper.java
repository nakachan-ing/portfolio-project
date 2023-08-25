package com.example.demo.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.DurationType;

@Mapper
public interface DurationTypeMapper {
	
	List<DurationType> findAll();
	
	Optional<DurationType> findById(int id);
	
	List<DurationType> findAllJoinProject();
	
	Optional<DurationType> findByIdJoinProject(int id);
	
}
