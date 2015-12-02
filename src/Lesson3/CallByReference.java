package lesson3democode;
class Test2 {
	int a, b;
	Test2(int i, int j) {
	a = i;
	b = j;
	}
	/* Pass an object. Now, ob.a and ob.b in object
	used in the call will be changed. */
	void change(Test2 ob) {
	ob.a = ob.a + ob.b;
	ob.b = -ob.b;
	}
	}
public class CallByReference {
	
	public static void main(String[] args) {
		Test2 ob = new Test2(15, 20);
		System.out.println("ob.a and ob.b before call: " +
		ob.a + " " + ob.b);
		ob.change(ob);
		System.out.println("ob.a and ob.b after call: " +
				ob.a + " " + ob.b);
		// Assigning References
		Test2 ob1 = ob;
		
		System.out.println("ob1.a and ob1.b by assigning reference of ob: " +
				ob1.a + " " + ob1.b);
		ob1.a = 20;
		ob1.b = 40;
		//ob1.change(ob);
		System.out.println("ob.a and ob.b values are modifying by the ob1: " +
				ob.a + " " + ob.b);
	}

}
