package com.example.demo.entity;

import java.util.List;

import lombok.Data;

@Data
public class InfrastructureType {

	private int infrastructureId;
	
	private String infrastructureType;
	
	private List<ProjectInfrastructure> projectInfrastructureList;
}
