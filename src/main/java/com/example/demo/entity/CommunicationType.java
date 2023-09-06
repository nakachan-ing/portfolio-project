package com.example.demo.entity;

import java.util.List;

import lombok.Data;

@Data
public class CommunicationType {

	private int communicationId;
	
	private String communicationType;
	
	private List<ProjectCommunication> projectCommunicationList;
}
