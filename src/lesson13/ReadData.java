package lesson13files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {

	// Demo code to read the content from file using Scanner
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("scores1.txt");

	    // Create a Scanner for the file
	    Scanner input = new Scanner(file);

	    // Read data from a file
	    while (input.hasNext()) {
	      String firstName = input.next();
	      String lastName = input.next();
	      int score = input.nextInt();
	      System.out.println(
	        firstName + " " + lastName + " " + score );
	    }

	    // Close the file
	    input.close();

	}

}
