package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class Project {
	private int projectId;
	
	private String projectName;
	
	private String detail;
	
	private int levelId;
	
	private int durationId;
	
	private LocalDateTime created;
	
	private LocalDateTime updated;
	
	private List<Comment> commentList;
}
