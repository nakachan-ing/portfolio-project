package com.example.demo.entity;

import java.util.List;

import lombok.Data;

@Data
public class DatabaseType {

	private int databaseId;
	
	private String databaseType;
	
	private List<ProjectDatabase> projectDatabaseList;
}
