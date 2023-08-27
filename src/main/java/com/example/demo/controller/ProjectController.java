package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Project;
import com.example.demo.form.ProjectForm;
import com.example.demo.service.CommentService;
import com.example.demo.service.ProjectService;

@Controller
@RequestMapping("/")
public class ProjectController {
	
	private final ProjectService projectService;
	private final CommentService commentService;
	
	@Autowired
	public ProjectController(ProjectService projectService,
			CommentService commentService) {
		this.projectService = projectService;
		this.commentService = commentService;
	}
	
	@GetMapping("/")
	public String home(Model model) {
		List<Project> projectList = projectService.findAll();
		model.addAttribute("headerTitle", "Portfolio Community - 共同制作プラットフォーム");
		model.addAttribute("projectList", projectList);
		model.addAttribute("title", "プロジェクト一覧");
		return "project/index";
	}
	
	@GetMapping("/project/add")
	public String form(ProjectForm projectForm,
			Model model) {
		model.addAttribute("headerTitle", "投稿する｜Portfolio Community");
		model.addAttribute("title", "プロジェクトを投稿する");
		return "project/add";
	}
	
	@PostMapping("/project/insert")
	public String insert(@Validated @ModelAttribute ProjectForm projectForm,
			BindingResult result,
			Model model) {
		if(!result.hasErrors()) {
			Project project = new Project();
			project.setProjectId(projectForm.getId());
			project.setProjectName(projectForm.getProjectName());
			project.setDetail(projectForm.getDetail());
			project.setLevelId(projectForm.getLevelId());
			project.setDurationId(projectForm.getDurationId());
			project.setCreated(LocalDateTime.now());
			project.setUpdated(LocalDateTime.now());
			projectService.insertProject(project);
			return "redirect:/";
		} else {
			model.addAttribute("headerTitle", "投稿する｜Portfolio Community");
			model.addAttribute("title", "プロジェクトを投稿する");
			model.addAttribute("projectForm", projectForm);
			return "project/add";
		}
	}
	
	@GetMapping("/project/{id}")
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
	
	@PostMapping("/project/{id}/edit")
	public String edit(ProjectForm projectForm,
			Model model) {
		model.addAttribute("headerTitle", "編集する｜Portfolio Community");
		model.addAttribute("projectForm", projectForm);
		return "project/edit";
	}
	
	@PostMapping("/project/{id}/update")
	public String update(@Validated @ModelAttribute ProjectForm projectForm,
		BindingResult result,
		Model model) {
		if(!result.hasErrors()) {
			Project project = new Project();
			project.setProjectId(projectForm.getId());
			project.setProjectName(projectForm.getProjectName());
			project.setDetail(projectForm.getDetail());
			project.setLevelId(projectForm.getLevelId());
			project.setDurationId(projectForm.getDurationId());
			project.setCreated(projectForm.getCreated());
			project.setUpdated(LocalDateTime.now());
			projectService.updateProject(project);
			return "redirect:/project/" + project.getProjectId();
		} else {
			model.addAttribute("headerTitle", "編集する｜Portfolio Community");
			model.addAttribute("title", "プロジェクトを編集する");
			model.addAttribute("projectForm", projectForm);
			return "project/edit";
		}
	}
	
	@PostMapping("/project/{id}/delete")
	public String delete(@ModelAttribute ProjectForm projectForm,
			Model model) {
		projectService.deleteById(projectForm.getId());
		commentService.deleteByProjectId(projectForm.getId());
		return "redirect:/";
	}

}
