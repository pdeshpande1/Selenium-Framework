package pkg_Test_suite;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;

//practise for CSS selector locators

public class Redifff_practise_CSS 
{
	
	// Static and Dynamic dropdowns
	
	//Use newtoursdemoaut.com for static dropdowns
	
      public static void main(String []args) throws InterruptedException 
      {
    	  System.setProperty("webdriver.chrome.driver", "E:\\PrachiDocs\\chromedriver_win32\\chromedriver.exe");
    	  
          //WebDriver driver; //driver object created with no memmory allocation
          
          //driver= new ChromeDriver();
    	  
    	  WebDriver driver= new ChromeDriver();
         
        /*driver.get("http://www.newtours.demoaut.com"); //open the URL
         
         driver.findElement(By.name("userName")).sendKeys("pdaaa");//Enter username and password
         driver.findElement(By.name("password")).sendKeys("pdbbb");
         driver.findElement(By.name("login")).click();
         
         //select number of passengers and flight
         
        // WebElement wb= driver.findElements(By.name("passCount"));
         
         
         /*Select pcount= new Select(driver.findElement(By.name("passCount")));//pcount is object of select class.it has to be created to access elemnts in Select class, here static dropdown
         List<WebElement> wb= pcount.getOptions();// List is a class in java.util.wb is object of list class which takes all options in dropdown passed in select class
         System.out.println(wb.size());
         pcount.selectByIndex(3);
         
         
         Select df= new Select(driver.findElement(By.name("fromPort")));//select from place
         df.selectByVisibleText("Sydney");
         
         Select Ain= new Select(driver.findElement(By.name("toPort")));
         Ain.selectByValue("Paris"); 
         
         //driver.quit();
           driver.close();
          //driver= null;  */
         //WORK ON DYNAMIC DROPDOWNS
         
        //WebDriver driver= new ChromeDriver();
         
         driver.get("http://www.spicejet.com");
         
         //driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click(); //click on dropdown
         
         //driver.findElement(By.cssSelector("a[value='IXM']")).click();//select values from dropdown
         
         //driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
         //driver.findElement(By.xpath("(//a[@value='CCU'])[2]")).click();
         
         //driver.findElement(By.xpath("(//a[@value='CCU'])[2]")).click();
         driver.findElement(By.xpath("(//a[contains(text(),'Kolkata (CCU)')])[2]")).click();
        driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[2]/li[7]/a")).click();
        
         //Verify checkboxes
         
         System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_IndArm']")).isSelected()); //verify if checkbox fro Indian Armed forces is checked
         driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_IndArm']")).click();//check checkbox fro Indian Armed forces
         System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_IndArm']")).isSelected());//again verify if checkbox is checked
         Thread.sleep(20);
         driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_IndArm']")).click();//Uncheck the checked checkbox
         System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_IndArm']")).isSelected());
         System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_IndArm']")).isEnabled());//verify if checkbox is enabled
         //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2' and @value='TripPlanner']")).click();//click radiobutton using multiple attributes in xpath
         //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2'][@value='TripPlanner']")).click(); //same as above just without AND operator in xpath
         System.out.println(driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size());
         //driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
         
         //click on radiobutton when dont have unique attribute to click. 
         int count = driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
         
         for (int i=0;i<count;i++)
         {
        	 String att= driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value");
        	 
        	 if (att.equals("TripPlanner"))
        	 {
        		 driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
        		 
        	 } 
         }
        	 
        	 
         
      }
      
}
