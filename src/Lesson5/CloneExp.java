package lesson7democode1;

public class CloneExp implements Cloneable 
{

	  private String name;
	  private String address;
	  private int age;
	  private String depart;
	  public CloneExp(){
	    
	  }
	  public CloneExp(String aName, int aAge, String aDepart) {

	    this.name = aName;
	    this.age = aAge;
	    this.depart = aDepart;
	  }

	  public Object clone() throws CloneNotSupportedException {

	    CloneExp clone=(CloneExp)super.clone();
	   
	    return clone;

	  }

		public static void main(String[] args) throws CloneNotSupportedException {
		CloneExp ce=new CloneExp("Amala",24,"Compro");

	       // make deep copy of the object of type CloneExp
	      CloneExp cloned=(CloneExp)ce.clone();
	      System.out.println(ce.name + " " + ce.age + " " + ce.depart);
	      System.out.println(cloned.name + " " + cloned.age + " " + cloned.depart); 
	      
	    }
	}


