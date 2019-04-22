package Java_progs;

public class A 
{
	A()
	{
		System.out.println("hello");
	}
	
	A(int x)
	{
		this();
		System.out.println(x);
		
		
	}
	
	public static void main(String args[])
	{
		A a= new A(5);
	}
}


	