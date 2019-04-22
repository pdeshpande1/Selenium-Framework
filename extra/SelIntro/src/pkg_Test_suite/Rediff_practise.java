package pkg_Test_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_practise 
{
	//create object of chrome browser and open browser
	
		public static void main(String[] args) 
		{
			 
			//invoke .exe file for chrome driver
			System.setProperty("webdriver.chrome.driver", "E:\\PrachiDocs\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://mail.rediff.com/");
			System.out.println(driver.getTitle());
			
			driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
			driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("ABC");//can use login instead of login1 as we have used reg expression. 
			driver.findElement(By.cssSelector("input#password")).sendKeys("ABC");
			driver.findElement(By.cssSelector("input[name='proceed']")).click();
			String txt=driver.findElement(By.xpath("//*[@id='login']/div[2]/div[2]/div[4]/div")).getText();
		    System.out.println(txt);
       }
}
