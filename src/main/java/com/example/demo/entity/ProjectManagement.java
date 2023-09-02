package com.example.demo.entity;

import lombok.Data;

/*
 * ProjectとManagementの中間テーブル
 * */

@Data
public class ProjectManagement {

	private int pmId;
	
	private int projectId;
	
	private int managementId;
}
