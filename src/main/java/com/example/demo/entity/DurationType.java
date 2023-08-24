package com.example.demo.entity;

import java.util.List;

import lombok.Data;

@Data
public class DurationType {

	private int id;
	
	private String durationType;
	
	private List<Project> projectList;
}
