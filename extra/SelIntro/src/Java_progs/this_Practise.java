package Java_progs;

public class this_Practise
{
  int roll_No;
  String s;
  
  this_Practise( int roll_No, String s)
  {
	  roll_No = roll_No;
	  s= s;
	  
	  System.out.println(this.roll_No + " "+this.s);// if print is kept in constructor then instead of Null for string input, Karan is given. It takes then Karan as just string
	  
	 // this.roll_No =roll_No;
	  //this.s=s;
	  
	 //System.out.println(this.roll_No + " "+this.s);
  }
  
  
  /*public void display()
   {
	   System.out.println(roll_No + " "+s);//With print command in another method, Karan is taken as input, so null is displayed
   }*/
  public static void main(String args [])
  {
	  
	  this_Practise tp= new this_Practise(10,"Karan");
	   //tp.display();
	  
  }
  
}
