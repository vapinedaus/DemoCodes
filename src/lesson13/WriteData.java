package lesson13files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteData {
// Demo code for to write the data in a File using PrintWriter
	public static void main(String[] args) throws FileNotFoundException {
		 File file = new File("scores2.txt");
		    if (file.exists()) {
		      System.out.println("File already exists");
		      System.exit(0);
		    }
		    // Create a file
		    PrintWriter output = new PrintWriter(file);

		    // Write formatted output to the file
		    output.print("Ram Sudhan ");
		    output.println(90);
		    output.print("Jane Smith ");
		    output.println(85);
		    System.out.println("Write Successfully");  
		    // Close the file
		    output.close();

	   

	}

}
