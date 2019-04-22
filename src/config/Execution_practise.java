package config;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Execution_practise
{
	static String new_locator;
	static String url;
	
		public static void main(String args[])
		{
			//System.setProperty("webdriver.chrome.driver", "E:\\PrachiDocs\\chromedriver_win32\\chromedriver.exe");
			
			System.setProperty("webdriver.ie.driver", "E:\\PrachiDocs\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe");
		    //WebDriver driver = new ChromeDriver();
			
			WebDriver driver=new InternetExplorerDriver();
			
			//System.out.println("hello");
			//driver.get("www.google.com");
			
			//Web_lib .getWebElement(driver,new_locator);

			Web_lib.LaunchBrowser(driver, "https://www.google.com");
			
			Web_lib.EnterTextValue(driver, "name:q", "hello");
		}
			
		
}
