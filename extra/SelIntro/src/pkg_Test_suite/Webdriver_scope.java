package pkg_Test_suite;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Webdriver_scope 
{
	public static void main(String []args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\PrachiDocs\\chromedriver_win32\\chromedriver.exe");//very important step
        WebDriver driver= new ChromeDriver();
    	
    	driver.get("http://www.qaclickacademy.com/");
    	 
    	//Test case1- to get the count of all links on the practise page
    	//WebElement ver=null; 
    	driver.findElement(By.cssSelector("a[href='practice.php']")).click();
    	
    	//Page takes time to load, so insert explicit wait to verify
    	WebDriverWait d =new WebDriverWait(driver, 10); //webDriverWait is a class
    	d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/h1")));
    	/*WebElement wb= driver.findElement(By.xpath("/html/body/h1"));
    
    	if (wb.getText()=="Practice Page")
    	{
    	  System.out.println(driver.findElements(By.tagName("a")).size());
    	}
    	else
    		System.out.println("Wrong navigation"); */
    	
    	System.out.println(driver.findElements(By.tagName("a")).size());
    	
    	//Test case2- Take count of all links in footer, create a new footerdriver object to limit scope till footer section. Get locator of entire footer section
    	
    	 WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
    	 System.out.println(footerdriver.findElements(By.tagName("a")).size());
    	
    	//Test case3- Take count of footer links present in 1 section, click on them nad print their title
    	//Create another WebElement for 1 column offooter section links
    	 
    	 WebElement columnDriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
    	 //here we are using footerdriver to access column of footer links.The xpath also started from table, as footerdriver contains xpath for id=gf-BIG.Column driver has access to column of footer links
    	 System.out.println(columnDriver.findElements(By.tagName("a")).size());//It will print count of 1st column links in footer
    	 
    	 //Click all 5 links and open them new tab or window. to open new tab click using shift+enter
    	 
    	 for (int i=1;i< columnDriver.findElements(By.tagName("a")).size();i++)// here we can put count in some variable and use it for i< condition
    	 {
    		//here we need to user findElements, since findElement method cannot access get(int), also columnDriver has multiple count so need to use findElements to access 
    		 columnDriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);//just sendKeys(Keys.CONTROL.ENTER) will not open in new tab, need to use chord().Chord() is used when we need to build & perform multiple keyboard functions like copy, paste etc
    		 
    		 //columnDriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
    	 }
		 
    	 //Pass control to each new tab and get title by windows handle. Windows handle gives styring ids
    	 
    	 Set<String> wndHandle = driver.getWindowHandles();
    	 //to access a Set data type we need to iterate through all values using Iterator type
    	 Iterator<String> it= wndHandle.iterator();
    	
    	 //Now take string id in it variable and switch to child window
    	 
    	 while(it.hasNext())//hasnext cheks if it has any id left, then it will enter loop. The 1st string id in wndHandle will be of parent window
    	 {
    		 System.out.println(driver.switchTo().window(it.next()).getTitle());//here it.next gets the id of child window since the 1st id is of parent window
    		 
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
	}
}
