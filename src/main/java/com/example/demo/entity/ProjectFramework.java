package com.example.demo.entity;

import lombok.Data;

/*
 * ProjectとFrameworkの中間テーブル
 * */

@Data
public class ProjectFramework {

	private int pfId;
	
	private int projectId;
	
	private int frameworkId;
}
