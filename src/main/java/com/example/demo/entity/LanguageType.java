package com.example.demo.entity;

import java.util.List;

import lombok.Data;

@Data
public class LanguageType {

	private int languageId;
	
	private String languageType;
	
	private List<ProjectLanguage> projectLanguageList;
}
