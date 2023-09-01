package com.example.demo.form;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Range;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectForm {
	
	private int id;
	
	@NotBlank
	@Size(max=50)
	private String projectName;
	
	@NotBlank
	@Size(max=1000)
	private String detail;
	
	@Range(min=1, max=3)
	@NotNull
	private int levelId;
	
	@Range(min=1, max=3)
	@NotNull
	private int durationId;
	
	private LocalDate created;
	
	private LocalDate updated;

}
