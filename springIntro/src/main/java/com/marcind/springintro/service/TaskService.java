package com.marcind.springintro.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcind.springintro.repository.TaskRepository;

@Service
public class TaskService {
	private TaskRepository taskRepository;
	@Autowired
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	public String textToUpperCase(String text) {
		return text.toUpperCase();
	}

	public String publishAllTasks() {
		return taskRepository.tasks.stream()
				.map(task-> String.format("Title: %50s Production date: %20s Type: %15s",
						task.getTitle(), task.getRegistrationTime(), task.getTaskType()
						))
				.collect(Collectors.joining("\n"));
	}
	
}
