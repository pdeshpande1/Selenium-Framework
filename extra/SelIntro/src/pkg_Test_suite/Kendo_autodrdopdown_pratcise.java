package pkg_Test_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kendo_autodrdopdown_pratcise 
{
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PrachiDocs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.telerik.com/kendo-angular-ui/components/dropdowns/autocomplete/");
		Thread.sleep(2000);
		//driver.findElement(By.id("k-eafcee44-48ff-4c09-aa6b-287102b6a0f5"));
		//driver.findElement(By.id("k-eafcee44-48ff-4c09-aa6b-287102b6a0f5")).sendKeys("united");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//String script= "document.getElementById('k-eafcee44-48ff-4c09-aa6b-287102b6a0f5').click();";
		js.executeScript("document.getElementById('k-eafcee44-48ff-4c09-aa6b-287102b6a0f5').click();");
	}
}
