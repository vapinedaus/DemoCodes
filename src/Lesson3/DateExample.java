package lesson3democode;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DateExample {
public static void main(String[] args) throws ParseException{
	Date d = new Date(); 
	System.out.println("Today's Date : " +d);
	System.out.println("d.getTime(): " + d.getTime());
	Date d1 = new Date(1425927919470l);  
	System.out.println("d1 = " + d1);		
	System.out.println("d.after(d1) : " + d.after(d1));   // true
	System.out.println("d1.after(d) : " + d1.after(d));   // false
	Date d2 = (Date) d1.clone();  
		
	System.out.println("d.compareTo(d1) : " + d.compareTo(d1));    //  1
	System.out.println("d1.compareTo(d): " + d1.compareTo(d));    // -1
	System.out.println("d1.compareTo(d2) : " + d1.compareTo(d2)); //0
	System.out.println("d1.equals(d) :" + d1.equals(d));
	System.out.println("d.getTime() : " + d.getTime()); // returns how many milliseconds have passed since January 1, 1970
	System.out.println("d.toString() : " + d.toString());
	 
	// Parsing and formatting of Date using SimpleDateFormat
	
	 Date curDate = new Date();
	 SimpleDateFormat sdf1 = new SimpleDateFormat();
	 String Date1 = sdf1.format(curDate);
	 System.out.println("Default pattern: " + Date1);
	
	 // MM represents Month, mm represents minutes
	
	 SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MM-yyyy"); 
	 String Date2 = sdf2.format(curDate);
	 System.out.println("Specified pattern: " + Date2);
	
	 // Converting String input into Date object
	 Date dt = sdf2.parse("12-09-1998"); 
	 System.out.println("String Input into Date : " + sdf2.format(dt));

	}
}
