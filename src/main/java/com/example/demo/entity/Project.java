package com.example.demo.entity;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

@Data
public class Project {
	private int id;
	
	private String projectName;
	
	private String detail;
	
	private LevelType levelType;
	
	private DurationType durationType;
	
	private LocalDateTime created;
	
	private LocalDateTime updated;
	
	private List<Comment> commentList;
}
