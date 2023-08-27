package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Project;
import com.example.demo.service.ProjectService;

@Controller
@RequestMapping("/")
public class ProjectController {
	
	private final ProjectService projectService;
	
	@Autowired
	public ProjectController(ProjectService projectService) {
		this.projectService = projectService;
	}
	
	@GetMapping("/")
	public String home(Model model) {
		List<Project> projectList = projectService.findAll();
		model.addAttribute("headerTitle", "Portfolio Community - 共同制作プラットフォーム");
		model.addAttribute("projectList", projectList);
		model.addAttribute("title", "プロジェクト一覧");
		return "project/index";
	}
	
	@GetMapping("project/{id}")
	public String showProject(@PathVariable("id") int id,
			Model model) {
		Project project = projectService.findByIdJoin(id).get();
		model.addAttribute("headerTitle", project.getProjectName());
		model.addAttribute("project", project);
		return "/project/show";
	}
	
	@PostMapping("/")
	public String goBackHome(Model model) {
		return "redirect:/";
	}
	

}
