package com.example.demo.entity;

import lombok.Data;

/*
 * ProjectとLanguageの中間テーブル
 * */

@Data
public class ProjectLanguage {

	private int plId;
	
	private int projectId;
	
	private int languageId;

}
