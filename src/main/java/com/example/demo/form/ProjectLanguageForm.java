package com.example.demo.form;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectLanguageForm {

	private int id;
	
	@NotNull
	private int projectId;
	
	@Range(min=1, max=24)
	@NotNull
	private int languageId;
}
