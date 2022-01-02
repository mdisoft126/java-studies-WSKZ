package fileOperations;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalTime;

public class FileOperations {
	public static void main(String[] args) {
		PrintWriter pw;
		try {
			pw = new PrintWriter("C:\\Users\\Lenovo\\eclipse-workspace\\JavaStudiesWSKZ\\JavaBasic\\src\\fileOperations\\current_time.txt");
			pw.println("Current time: " + LocalTime.now());
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
