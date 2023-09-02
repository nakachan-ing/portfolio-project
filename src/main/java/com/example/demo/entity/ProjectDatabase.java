package com.example.demo.entity;

import lombok.Data;

/*
 * ProjectとDatabaseの中間テーブル
 * */

@Data
public class ProjectDatabase {

	private int pdId;
	
	private int projectId;
	
	private int databaseId;
}
