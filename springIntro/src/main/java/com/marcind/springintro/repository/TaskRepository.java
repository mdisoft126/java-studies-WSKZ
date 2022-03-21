package com.marcind.springintro.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.marcind.springintro.model.Task;
import com.marcind.springintro.model.TaskType;

@Component
public class TaskRepository {
	public List<Task> tasks = new ArrayList<>(Arrays.asList(
			new Task("Java Learning",
					LocalDateTime.of(2020, 2, 10, 3, 25),
					TaskType.LEARNING),
			new Task("Spring Learning",
					LocalDateTime.of(2021, 4, 2, 5, 40),
					TaskType.IMPLEMENTATION),
			new Task("Spring Project",
					LocalDateTime.of(2020, 7, 29, 11, 15),
					TaskType.IMPLEMENTATION),
			new Task("GITHUB project implementation",
					LocalDateTime.of(2019, 12, 6, 7, 50),
					TaskType.DEPLOY)
			));

}
