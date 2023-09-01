package com.example.demo.entity;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Comment {

	private int commentId;
	
	private int projectId;
	
	private String remark;
	
	@DateTimeFormat(pattern = "yyyy_MM_dd HH:mm:ss")
	private LocalDateTime created;
	
	private Project project;
}
