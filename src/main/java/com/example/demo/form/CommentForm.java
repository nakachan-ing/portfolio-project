package com.example.demo.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentForm {
	
	private int id;
	
	private int projectId;
	
	@NotBlank
	@Size(max=140)
	private String remark;
	
	private boolean isNewComment;

}
