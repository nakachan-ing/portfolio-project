package com.example.demo.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.LevelType;

@Mapper
public interface LevelTypeMapper {

	List<LevelType> findAll();
	
	Optional<LevelType> findById(int id);
	
	List<LevelType> findAllJoinProject();
	
	Optional<LevelType> findByIdJoinProject();
	
}
