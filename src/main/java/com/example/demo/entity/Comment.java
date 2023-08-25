package com.example.demo.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Comment {

	private int commentId;
	
	private int projectId;
	
	private String remark;
	
	private LocalDateTime created;
	
	private Project project;
}
