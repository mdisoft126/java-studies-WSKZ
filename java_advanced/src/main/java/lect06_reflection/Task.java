package lect06_reflection;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Task {
	private String title;
	private LocalDateTime registrationTime;
	private int days;

}
