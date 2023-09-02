package com.example.demo.entity;

import lombok.Data;

/*
 * ProjectとInfrastructureの中間テーブル
 * */

@Data
public class ProjectInfrastructure {

	private int piId;
	
	private int projectId;
	
	private int infrastructureId;
}
