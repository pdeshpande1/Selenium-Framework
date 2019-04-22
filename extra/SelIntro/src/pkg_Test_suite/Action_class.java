package pkg_Test_suite;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class
{
   public static void main(String []args)
   {
	   System.setProperty("webdriver.chrome.driver", "E:\\PrachiDocs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.findElement(By.xpath("//span[@class='nav-logo-base nav-sprite']")).getText());
		
		Actions act= new Actions(driver);//pass driver object as argument, so driver gets capabilities of action class methods 
		act.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-yourAccount']"))).build().perform();
		
		//Now enter text in the text box
		
		act.click(driver.findElement(By.id("twotabsearchtextbox"))).keyDown(Keys.SHIFT).sendKeys("hello").sendKeys(Keys.ENTER).build().perform();
		
		//products releated to hello are displayed in separate window, right click on the product name
		
		Set <String> ids= driver.getWindowHandles();//windows have string ids which are capture in variable ids.
		Iterator<String> it= ids.iterator();
		String parent_Id=it.next();
		String child_Id=it.next();
		
		//Iterator is used to iterate over set/arraylist/hashmap/set in collections.Iterator object is created to iterate over ids collected in set variable ids.
		// Use child_Id to acces child window
		
		driver.switchTo().window(child_Id); 
		System.out.println(driver.getTitle()); //gets title of browser
		
		act.click(driver.findElement(By.xpath("//h2[@class='a-size-medium s-inline  s-access-title  a-text-normal']"))).contextClick().build().perform();
		
   }
}