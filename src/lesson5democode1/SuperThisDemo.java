package lesson5democode1;
class FirstV
{
	String name;
	int score;
	FirstV()
	{
		System.out.println("Super Class Constructor");
	}
	 FirstV(String s, int sc)
	{
		name = s;
		score = sc;
		
	}
	 void print()
	 {
		 System.out.println("Name : " + name);
		 System.out.println("Score :" + score);
		 
	 }
}

class SecondV extends FirstV
{
	int ec;
	SecondV()
	{
		System.out.println("Sub Class Constructor");
	}
	SecondV(String s1, int m1, int ec)
	{
		super(s1,m1);	
		this.ec=ec;
						
	}
	public void print()
	{
		super.print();
		System.out.println("Extra Score : "+ec);
		System.out.println("Total Score : " + (score + ec));
	}
}

public class SuperThisDemo {
 // Demo code to call constructors and other methods using super
	public static void main(String[] args) {
		SecondV s = new SecondV();
		FirstV ft = new FirstV("Banu",80);
		ft.print();
		SecondV sd = new SecondV("Aruna", 85, 10);
        sd.print();
	}
}
