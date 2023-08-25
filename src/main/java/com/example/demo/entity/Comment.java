package com.example.demo.entity;

import lombok.Data;

@Data
public class Comment {

	private int commentId;
	
	private int projectId;
	
	private String remark;
}
