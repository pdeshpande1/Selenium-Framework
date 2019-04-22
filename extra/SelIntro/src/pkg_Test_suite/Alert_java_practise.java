package pkg_Test_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_java_practise 
{
       public static void main(String args[]) throws InterruptedException
       {
    	   //WebDriver driver =new FirefoxDriver();
    	   System.setProperty("webdriver.chrome.driver", "E:\\PrachiDocs\\chromedriver_win32\\chromedriver.exe");
    	   WebDriver driver= new ChromeDriver();
    	   driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
    	   Thread.sleep(1000);
    	   driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();//click on button which generates java alert pop up
    	   System.out.println(driver.switchTo().alert().getText());//get text gets the text displayed on java alert
    	   driver.switchTo().alert().accept(); //switchTo.alert() is used to switch selenium from web page to java pop up as we cant spy java alerts
    	   /*//Accept method to be used for -OK, accept, Save etc
    	   driver.switchTo().alert().dismiss();//dismiss used- Cancel etc
    	   driver.switchTo().alert().sendKeys("Yes");//sendKeys used to enter any text in java alert if required.*/
    	   
    			   
       }
}
