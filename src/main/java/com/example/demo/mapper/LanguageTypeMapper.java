package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.LanguageType;

@Mapper
public interface LanguageTypeMapper {
	
	List<LanguageType> findAll();
}
