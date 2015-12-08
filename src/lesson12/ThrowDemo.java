package lesson12exceptionhandling;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ThrowDemo {
  // Demo code to throw an exception
	public static void main(String[] args)  {
		int studentAge = 0;
		Scanner scnr = new Scanner(System.in);
      		try {
		    System.out.print("Student Age: ");
		    studentAge = scnr.nextInt();
		    if( studentAge < 0 )
			throw new Exception("Age should not be Negative");
		    //throw new Exception();
		    System.out.println("Student Age: " + studentAge);
		    System.out.println("End");
		}
		catch(Exception exc)
		{
		    System.out.println("Error:" + exc.getMessage());
		}
   			
	}
}


