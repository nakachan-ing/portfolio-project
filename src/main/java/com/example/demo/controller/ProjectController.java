package com.example.demo.controller;

import java.time.LocalDate;
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
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Comment;
import com.example.demo.entity.LanguageType;
import com.example.demo.entity.Project;
import com.example.demo.form.CommentForm;
import com.example.demo.form.ProjectForm;
import com.example.demo.form.ProjectLanguageForm;
import com.example.demo.mapper.LanguageTypeMapper;
import com.example.demo.service.CommentService;
import com.example.demo.service.ProjectService;

@Controller
@RequestMapping("/")
public class ProjectController {
	
	private final ProjectService projectService;
	private final CommentService commentService;
	private final LanguageTypeMapper languageTypeMapper;
	
	@Autowired
	public ProjectController(ProjectService projectService,
			CommentService commentService,
			LanguageTypeMapper languageTypeMapper) {
		this.projectService = projectService;
		this.commentService = commentService;
		this.languageTypeMapper = languageTypeMapper;
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
			ProjectLanguageForm projectLanguageForm,
			Model model) {
		List<LanguageType> languageList = languageTypeMapper.findAll();
		model.addAttribute("headerTitle", "投稿する｜Portfolio Community");
		model.addAttribute("title", "プロジェクトを投稿する");
		model.addAttribute("languageList", languageList);
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
			project.setCreated(LocalDate.now());
			project.setUpdated(LocalDate.now());
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
			CommentForm commentForm,
			Model model) {
		Project project = projectService.findByIdJoin(id).get();
		commentForm.setNewComment(true);
		model.addAttribute("headerTitle", project.getProjectName());
		model.addAttribute("project", project);
		model.addAttribute("commentForm", commentForm);
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
			project.setUpdated(LocalDate.now());
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
	
	@PostMapping("/project/{id}/comment")
	public String postComment(@Validated @ModelAttribute CommentForm commentForm,
			BindingResult result,
			Model model) {
		if(!result.hasErrors()) {
			Comment comment = new Comment();
			comment.setCommentId(commentForm.getId());
			comment.setProjectId(commentForm.getProjectId());
			comment.setRemark(commentForm.getRemark());
			comment.setCreated(LocalDateTime.now());
			commentService.insertComment(comment);
			return "redirect:/project/" + comment.getProjectId();
		} else {
			return "redirect:/";
		}
	}
	
	@PostMapping("/project/{id}/comment/edit")
	public String editComment(@RequestParam(name="commentId") int commentId,
			@RequestParam(name="projectId") int projectId,
			Model model) {
		Comment comment = commentService.findById(commentId).get();
		CommentForm commentForm = new CommentForm();
		commentForm.setId(commentId);
		commentForm.setProjectId(projectId);
		commentForm.setRemark(comment.getRemark());
		Project project = projectService.findByIdJoin(projectId).get();
		model.addAttribute("project", project);
		model.addAttribute("commentForm", commentForm);
		return "/project/show";
	}
	
	@PostMapping("/project/{id}/comment/update")
	public String updateComment(@Validated @ModelAttribute CommentForm commentForm,
			BindingResult result,
			Model model) {
		if(!result.hasErrors()) {
			Comment comment = new Comment();
			comment.setCommentId(commentForm.getId());
			comment.setProjectId(commentForm.getProjectId());
			comment.setRemark(commentForm.getRemark());
			commentService.updateComment(comment);
			return "redirect:/project/" + comment.getProjectId();
		} else {
			return "redirect:/";
		}
	}
	
	@PostMapping("/project/{id}/comment/delete")
	public String deleteComment(@RequestParam(name="commentId") int commentId,
			@RequestParam(name="projectId") int projectId,
			Model model) {
		commentService.deleteById(commentId);
		return "redirect:/project/" + projectId;
	}

}
