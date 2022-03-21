package com.marcind.springintro.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Task {
	private String title;
	private LocalDateTime registrationTime;
	private TaskType taskType;

}
