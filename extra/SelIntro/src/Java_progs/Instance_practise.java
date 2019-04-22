package Java_progs;

public class Instance_practise {

	int count1=0;
	static int count2=0;
	
	public Instance_practise()
	{
		count1++;
		count2++;
		System.out.println(count2);
	}
	
	public static void main(String args [])
	{
		
		Instance_practise ip= new Instance_practise();
		Instance_practise ip1= new Instance_practise();
		Instance_practise ip2= new Instance_practise();
		System.out.println(ip.count1 + " " + ip1.count1 + " " + ip2.count1);
		
				
	}
}
