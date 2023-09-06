package com.example.demo.entity;

import java.util.List;

import lombok.Data;

@Data
public class FrameworkType {

	private int frameworkId;
	
	private String frameworkType;
	
	private List<ProjectFramework> projectFrameworkList;
}
