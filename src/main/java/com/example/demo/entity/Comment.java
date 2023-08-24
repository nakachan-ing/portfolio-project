package com.example.demo.entity;

import lombok.Data;

@Data
public class Comment {

	private int id;
	
	private Project project;
	
	private String remark;
}
