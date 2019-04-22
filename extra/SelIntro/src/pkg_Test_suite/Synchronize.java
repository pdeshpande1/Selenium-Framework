package pkg_Test_suite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synchronize 
{
	public static void main(String []args)
	{
		//System.setProperty("Webdriver.chrome.driver","E:\\PrachiDocs\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "E:\\PrachiDocs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.phptravels.net/");
		driver.findElement(By.xpath("//span[@class='select2-chosen']")).click();
		driver.findElement(By.xpath("//span[@class='select2-chosen']")).sendKeys("Pune");
		//driver.findElement(By.id("gosuggest_inputL")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//span[@class='select2-chosen']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.cssSelector("button[class='width100 button orange xlarge']")).click();
		
		//driver.findElement(By.xpath("//button[@class='button orange fr']")).click();
	}
}

