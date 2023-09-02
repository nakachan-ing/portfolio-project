package com.example.demo.entity;

import lombok.Data;

/*
 * ProjectとCommunicationの中間テーブル
 * */

@Data
public class ProjectCommunication {

	private int pcId;
	
	private int projectId;
	
	private int communicationId;
}
