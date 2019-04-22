package pkg_Test_suite;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class QAclick_test 

{
     public static void main(String []args)
     {
    	System.setProperty("webdriver.chrome.driver", "E:\\PrachiDocs\\chromedriver_win32\\chromedriver.exe");//very important step
    	 
    	 //System.setProperty("webdriver.ie.driver", "E:\\PrachiDocs\\IEDriverServer_x64_3.13.0\\IEDriverServer.exe");
    	 
    //	WebDriver driver= new InternetExplorerDriver();
    	WebDriver driver= new ChromeDriver();
    	
    	driver.get("http://www.qaclickacademy.com/");
    	driver.getCurrentUrl();
    	 
    	/*Object locator technique
    	 1) Relative 2) Absolute 3) Parent child 4) Sibling relation 5) Child parent 6) Using text() */
    	 
    	// click on Interview guide # used parent child xpath technique #used contains text method
    	
    	driver.findElement(By.xpath("//div[@class='navbar navbar-default navbar-static-top']/div/nav/ul/li[4]/a")).click();	
        //System.out.println(driver.findElement(By.xpath("//div[@class='col-sm-12 text-center']")).getText());
        //System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Interview Guide')]")).getText());
        
        //Click on Appium # used relative technique # absolute technique
        
        /*System.out.println(driver.findElement(By.xpath("//li[@id='tablist1-tab1']")).getText());
        System.out.println(driver.findElement(By.xpath("//li[@class='list-tabs']/div/h3")).getText());
        System.out.println(driver.findElement(By.xpath("//li[@class='list-tabs']/div/h3[2]")).getText());*/
        
        // Click on Selenium # used sibling relationship
        
        System.out.println(driver.findElement(By.xpath("//div[@class='responsive-tabs responsive-tabs--enabled']/ul/li/following-sibling::li[1]")).getText());
        //System.out.println(driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).getText());
        driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[1]")).click();
        
        
     /*driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='tablist1-panel2']/ul/li/div/h3")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@id='tablist1-panel2']/ul/li/div/h3/b")).getText());*/
        
        //driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();
      
        // Click  on SOAP UI #used text method
        
        //System.out.println(driver.findElement(By.xpath("//li[contains(text(),' Soap UI ')]")).getText());
        //driver.findElements(By.xpath("//li[contains(text(),' Soap UI ')]/parent::div"));
     }
}


