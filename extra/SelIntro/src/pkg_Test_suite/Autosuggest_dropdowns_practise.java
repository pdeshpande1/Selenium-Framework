package pkg_Test_suite;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest_dropdowns_practise 
{
	
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PrachiDocs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).click();
		driver.findElement(By.id("fromPlaceName")).sendKeys("Bang");
		/*driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);*/
		
		//Since the text is in hidden mode, we need to use Javascript executor. Javascript DOM can extract hidden elements
		
		JavascriptExecutor js=  (JavascriptExecutor) driver;
		
		//create script using javascript DOM. Refer W3schools javascript DOM
		
		String script= "return document.getElementById(\"fromPlaceName\").value;";
		String text= (String)js.executeScript(script);
		System.out.println(text);
		int count=0;
		
		
		//Verify if the dropdown contains mentioned text and yes then select it.You can check it till 4 keys down
		
		while(!text.equals("ABCBANGALORE INTERNATION AIPORT"))
		{
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text= (String)js.executeScript(script);
			count++;
			
			if(count>4)
			{
				System.out.println("Element not found");
				break;
			}
		}
		
		if (text.equals("ABCBANGALORE INTERNATION AIPORT"))
		{
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
			System.out.println("Element found");
		}
		
	}
}
