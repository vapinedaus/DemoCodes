package lesson3democode;
class Area1
{
	int a,b;
	public  Area1()
	{
		a=10;
		b=20;
	}
	Area1(int x, int y)
		{
		  
		a=x;
		b=y;
	}
	void cal()
	{
		
		System.out.println("Sum =" + (a + b));
	}
}

public class ConstructorDemo {
public static void main(String args[])
{
	/*Area1 a1 = new Area1();
	Area1 a2 = new Area1(10,10);
	a1.cal();
	a2.cal();*/
	Area1[] obj = { new Area1(), new Area1(20,20)};
	for(int i=0;i<obj.length;i++)
		obj[i].cal();
}
}
