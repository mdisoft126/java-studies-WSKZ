package fileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.Scanner;

public class FileOperations {
	public static void main(String[] args) {
//		PrintWriter pw;
//		try {
//			pw = new PrintWriter("C:\\Users\\Lenovo\\eclipse-workspace\\JavaStudiesWSKZ\\JavaBasic\\src\\fileOperations\\current_time.txt");
//			pw.println("Current time: " + LocalTime.now());
//			pw.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			String absPath = Paths.get("").toAbsolutePath().toString() +
					"\\src\\fileOperations\\current_time.txt";
			FileWriter fw = new FileWriter(absPath, true);
			fw.append("Time log: " + LocalTime.now() + "\n");
			fw.close();
			File file = new File(absPath);
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {	// it checks, is there a line of code to get
				System.out.println(input.nextLine());
			}
			input.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
