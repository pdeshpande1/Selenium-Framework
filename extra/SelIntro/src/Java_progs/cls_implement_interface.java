package Java_progs;

public class cls_implement_interface implements interface_implement
{
		public void run()
		{
			System.out.println("I am implemented in class");
		}
		
		public  void  msg()
		{
			System.out.println("I sm implemented in interface");
		}
		
		public static void main(String []args)
		{
			interface_implement ci= new cls_implement_interface();
			
			ci.msg();
			ci.run();
		}
}
