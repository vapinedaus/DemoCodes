package lesson3democode;
class Vehicle {
int passengers; // number of passengers
int fuelcap; // fuel capacity in gallons
int mpg; // fuel consumption in miles per gallon
//void range() 
int range()
{
//System.out.println("Range of Miles is " + fuelcap * mpg);
	return fuelcap * mpg;
}
}
public class ClassObjectExample1 {
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle();
		Vehicle sportscar = new Vehicle();
		int range1, range2;
		// assign values to fields in minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		// assign values to fields in sportscar
		sportscar.passengers = 2;
		sportscar.fuelcap = 14;
		sportscar.mpg = 12;
		System.out.print("Minivan can carry " + minivan.passengers +
		" Passengers");
		System.out.println("\nRange of Miles is " + minivan.range()); // display range of minivan
		System.out.print("Sportscar can carry " + sportscar.passengers +
		" Passengers");
		System.out.println("\nRange of Miles is " +sportscar.range()); // display range of sportscar.
		}
}
