package pkg_Test_suite;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_handle 
{
	public static void main(String []args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PrachiDocs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20823/bel-vs-sml-21st-match-karnataka-premier-league-2018");
		
		//Take all elements of table in a webelement and traverse with the webelement instead of driver.
		
		WebElement table= driver.findElement(By.xpath("//div[@id='innings_1']/div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']")); //cb-col cb-col-100 cb-ltst-wgt-hdr
		
		
		int count= table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			System.out.println(table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[@class='cb-col cb-col-8 text-right text-bold']")).get(i).getText());
		}
	
		
		
	}
}
	