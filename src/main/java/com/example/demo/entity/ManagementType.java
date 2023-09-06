package com.example.demo.entity;

import java.util.List;

import lombok.Data;

@Data
public class ManagementType {

	private int managementId;
	
	private String managementType;
	
	private List<ProjectManagement> projectManagementList;
}
