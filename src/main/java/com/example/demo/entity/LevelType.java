package com.example.demo.entity;

import java.util.List;

import lombok.Data;

@Data
public class LevelType {

	private int id;
	
	private String levelType;
	
	private List<Project> projectList;
}
