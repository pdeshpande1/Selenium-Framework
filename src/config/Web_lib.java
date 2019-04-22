package config;

import java.util.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;




public class Web_lib 
{
	
	public static WebElement getWebElement( WebDriver driver, String locator)
	{
		String token[]= locator.split(":");
		String locator_type= token[0];
		String strng_locator=token[1];
		WebElement  webElement=null;
		
		try{
			
			if (locator_type.equalsIgnoreCase("XPATH"))
			{
				webElement= driver.findElement(By.xpath(strng_locator));
			}
			else if(locator_type.equalsIgnoreCase("ID"))
			{ 
				webElement= driver.findElement(By.id(strng_locator)); 
			}
			else if(locator_type.equalsIgnoreCase("NAME"))
			{
				webElement= driver.findElement(By.name(strng_locator));
			}
		} catch(NoSuchElementException e)
		{
			e.printStackTrace();
		}
		
		return webElement;
		
	}
	
	public static void LaunchBrowser(WebDriver driver, String URL)
	{
		driver.get(URL);
	}
	
	public static void EnterTextValue(WebDriver driver,String locator, String value)
	{
		try{
			if (getWebElement(driver, locator).isEnabled())
			{
				getWebElement(driver, locator).sendKeys(value);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
			
	}

}
