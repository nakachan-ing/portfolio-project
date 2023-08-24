package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.DurationType;

@Mapper
public interface DurationTypeMapper {
	/**
	 * 期間のタイプを全取得
	 * @return 期間のタイプ
	 */
	List<DurationType> findAll();
}
