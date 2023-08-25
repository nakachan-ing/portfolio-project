package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.demo.mapper.DurationTypeMapper;

@Controller
//@RequestMapping("/")
public class IndexController {
	
	private final DurationTypeMapper durationTypeMapper;
	
	@Autowired
	public IndexController(DurationTypeMapper durationTypeMapper) {
		this.durationTypeMapper = durationTypeMapper;
	}

//	@GetMapping("/")
//	public String index(Model model) {
//		List<DurationType> durationList = durationTypeMapper.findAll();
//		DurationType durationType = durationTypeMapper.findById(2).get();
//		List<DurationType> durationList2 = durationTypeMapper.findAllJoinProject();
//		DurationType durationType3 = durationTypeMapper.findByIdJoinProject(2).get();
//		model.addAttribute("durationList", durationList);
//		model.addAttribute("durationType", durationType);
//		model.addAttribute("durationList2", durationList2);
//		model.addAttribute("durationType3", durationType3);
//		return "home";
//	}
}
