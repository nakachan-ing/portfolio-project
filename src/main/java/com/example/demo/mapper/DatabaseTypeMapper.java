package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.DatabaseType;

@Mapper
public interface DatabaseTypeMapper {

	List<DatabaseType> findAll();
}
