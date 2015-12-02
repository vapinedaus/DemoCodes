package lesson5democode1;


class EmployeeV {
	private String name = "Unknown";

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

class EmpUtil {
	public static void printName(EmployeeV emp) {
		// Get the name of EmployeeV
		String name = emp.getName();
		// Print EmployeeV name
		System.out.println(emp.getClass().getSimpleName() +":"+ name);
	}
}

class ManagerV extends EmployeeV {
	double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}

public class UpcastDemo {
	public static void main(String[] args) {
		EmployeeV emp = new EmployeeV();
		EmployeeV emp1 = new EmployeeV();
		emp.setName("Ken Wood");
		ManagerV mgr = new ManagerV();
		mgr.setName("Ken Furr"); // Inheritance of setName() at work
		mgr.setBonus(5000);
		System.out.println("Bonus :" + mgr.getBonus());
		
		// Print names
		EmpUtil.printName(emp);
		EmpUtil.printName(mgr); // Upcasting at work
		
		// Down casting
		
		EmployeeV e1 = new ManagerV();
		e1.setName("Hari");
		e1.getName();
		((ManagerV)e1).setBonus(3500);
		((ManagerV)e1).getBonus();
		
	
	}
}
