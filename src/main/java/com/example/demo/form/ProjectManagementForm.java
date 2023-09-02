package com.example.demo.form;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectManagementForm {

	private int id;
	
	@NotNull
	private int projectId;
	
	private int managementId;
	
	private int[] managementIdList;
}
