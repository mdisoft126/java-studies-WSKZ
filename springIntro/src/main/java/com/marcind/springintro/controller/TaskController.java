package com.marcind.springintro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.marcind.springintro.service.TaskService;

@Controller
public class TaskController {
	private TaskService taskService;
	
	@Autowired
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@ResponseBody
	@GetMapping("/")
	public String home() {
		return taskService.textToUpperCase("Hello Spring!");
	}
	
	@ResponseBody
	@GetMapping("/tasks")
	public String publishTasks() {
		return taskService.publishAllTasks();
	}
}
