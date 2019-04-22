package pkg_Test_suite;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class makeMy_Trip 
{
static //automate calendars for travel website Make My Trip
	
	//Enter date
	
			String date= "15-November 2018";
			
			//Split the date using split function
			
			static String splitter[];
			static String date_Month;
			static String date_Day;
			
	
	public static void main(String []args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "E:\\PrachiDocs\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			/*driver.get("https://www.makemytrip.com/");
			System.out.println(driver.getTitle());
			
			//select dates from date dropdown. expected date-october 10
			
			Thread.sleep(5000);
			
		    driver.findElement(By.id("hp-widget__depart")).click(); //click on date field
		    //driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText()
		    Thread.sleep(5000);
		    while (!driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().contains("OCTOBER"))//use while loop to verify if october month is present
		    {
		    	Thread.sleep(5000);
		    	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		    	System.out.println("print");
		    }*/
			
		driver.get("https://www.goibibo.com/");
		System.out.println(driver.getTitle());
		
		String splitter[]= date.split("-");
		String date_Month= splitter[1];
		String date_Day= splitter[0];
		
		//System.out.println(date_Month);
		//System.out.println(date_Day);

		
				
		String to_Xpath="//div[@class='shCalenderBox col-md-5 col-sm-5 col-xs-12 pad0 marginTB10 marginAdjust']/div[1]/div/input[@class='form-control inputTxtLarge widgetCalenderTxt']";
		String from_Xpath="//div[@class='shCalenderBox col-md-5 col-sm-5 col-xs-12 pad0 marginTB10 marginAdjust']/div[2]/div/input[@class='form-control inputTxtLarge widgetCalenderTxt']";
		
		//Create & call function to select date and month
		
		//makeMy_Trip mt=new makeMy_Trip();
		
		//select_to_Date(driver,date_Month,date_Day,to_Xpath);	
		select_to_Date(driver,date_Month,date_Day,from_Xpath);
		
		
	}
	
	  public static void select_to_Date(WebDriver driver,String month,String day, String from_Path) throws InterruptedException
	  {
			 driver.findElement(By.xpath(from_Path)).click();
		      
			//For To date-Take all  months in collection and verify if expected month is selected, select the expected month
			
			int count =driver.findElements(By.xpath("//div[@class='DayPicker-Caption']")).size();
			 
			System.out.println(count);
			//System.out.println(month);
				
			for (int i=0;i<count;i++)
			{
				String mth=driver.findElements(By.xpath("//div[@class='DayPicker-Caption']")).get(i).getText();
				System.out.println(month);
				
				if(mth.equals(month))
				{
					//selecting the date
					Thread.sleep(5000);
					List<WebElement> wb=driver.findElements(By.xpath("//div[@class='DayPicker-Month']["+(i+1)+"]/div[@class='DayPicker-Body']/div/div[@class='DayPicker-Day']/div"));
					//System.out.println(wb.size());
					
					for(WebElement d:wb)
					{
						String date_day=d.getText();
						System.out.println(date_day);
						
						if(date_day.contentEquals(day))
						{
							//System.out.println(date_day);
							d.click();
							return;
						}
					}
					
					//div[@class='DayPicker-Month'][1]/div[@class='DayPicker-Body']/div/div[@class='DayPicker-Day']
					//div[@class='DayPicker-Month'][i+1]/div[@class='DayPicker-Caption']
				}
				
			
			}
			
			driver.findElement(By.xpath("//div[@class='DayPicker DayPicker--en']/div/span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			Thread.sleep(5000);
			select_to_Date(driver,month,day, from_Path);
			
			
			
			
			
			//driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
	  }

	
}

