package pkg_Test_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cls_Testcase1 {
	//create object of chrome browser and open browser
	


	public static void main(String[] args) 
	{
		
		//invoke .exe file for chrome driver
		System.setProperty("webdriver.chrome.driver", "E:\\PrachiDocs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		/*driver.get("http://www.google.com");//hit url on browser
		System.out.println(driver.getTitle()); // verify page title
		System.out.println(driver.getCurrentUrl());//validate the url that is passed
	    driver.get("http://www.yahoo.com");
	    driver.navigate().back();
	    driver.close();//closes only current browser
	    //driver.quit();//closes all browsers opened by selenium
	    driver.get("http://facebook.com");
	    driver.findElement(By.id("email")).sendKeys("my first script");
	    driver.findElement(By.name("pass")).sendKeys("ABC");
	    driver.findElement(By.linkText("Forgotten account?")).click();
	    driver.findElement(By.xpath("//*[@id='identify_email']")).sendKeys("ABC");
	    driver.findElement(By.cssSelector("#u_0_5")).click();*///any object locator with alphanumeric values should not be used
		
		//write same code using xpaths
		
		driver.get("http://www.facebook.com");
		driver.navigate();
		//ystem.out.println(driver.getTitle());
		
		/*driver.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("ABC");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@data-testid='royal_login_button']")).click();*/
		
		//click on forgotten account uisng methods in xpath
		
		//driver.findElement(By.xpath("//*[contains(text(),'Forgotten account?')]")).click(); //click on forgot pass
		//driver.findElement(By.xpath("//*[contains(text(),'Find Your Account')]")).getText();
		//driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("ABC");
		//example syntax for  regular expression xpath= //tagname[contains(@attribute,'value')], this can be used in case some part of value keeps on changing
		//or xpath=//tagname[@attribute='value']
		
		//Syntax for CSS
		
		//CSS= tagName[attribute='value']
		//CSS with regular expression =tagName[attribute*='value']
		
		
		
	}
}
	