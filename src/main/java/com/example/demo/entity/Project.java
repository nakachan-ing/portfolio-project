package com.example.demo.entity;

import java.time.LocalDate;
import java.util.List;

import lombok.Data;

@Data
public class Project {
	private int projectId;
	
	private String projectName;
	
	private String detail;
	
	private int levelId;
	
	private int durationId;
	
	private LocalDate created;
	
	private LocalDate updated;
	
	private LevelType levelType;
	
	private DurationType durationType;
	
	private List<Comment> commentList;
}
