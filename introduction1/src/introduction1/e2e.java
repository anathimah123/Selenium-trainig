package introduction1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bobby Carelse\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.spicejet.com");
		
		//so once you have landed in the url you have to select from option and then to option city, then select the current date the future date will be delt with in another lacture
		//then click the passenger information, then enter search but before we click the search button
		
		//DROPE DOWN-FROM Bengaluru (BLR)
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		
		//DROPE DOWN TO-CHINIA MAAI THIS XPATH>glsctl00_mainContent_ddl_originStation1_CTNR IS CREATED BASED ON PARENT AND CHILD REFERENCE BECAUSE THERE WERE MULTIPLE INSTANCES FOUND AND WE WANTED TO FIND IT UNIQUELY WITH THE HELP OF PARENT REFRENCE
		
		 driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		 //SELECT CALENDER CURRENT DATE
		 driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	
		 //AFTER THE ABOVE STEP:WE NEED TO MAKE SURE THE CALENDER IS DISABLED
		 //(STYLE)>WE ARE GETTING THE ATTRIBUTE AND BASED ON SOME RESEARCH WE FOUND THAT IF
		 //THE ATTRIBUTE STYLE IS 0.5 ITS ENABLED
		 if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
				
			{
				System.out.println("it's enabled");
				Assert.assertTrue(true);// AS WE ARE NOT SELECTING ROUND TRIP IT SHOULD BE ENABLED
			}
			else
			{
				Assert.assertTrue(false);// 
				
			}
	//PASSENGERS CHECKBOX
		 driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
		 
		 driver.findElement(By.id("divpaxinfo")).click();
		 Thread.sleep(2000L); 
		 
		 //UPDATED DROPE DOWN
		 int i =1;
			while(i<5)
			{
				driver.findElement(By.id("hrefIncAdt")).click();
				 
			i++;
			}
			
			driver.findElement(By.id("btnclosepaxoption")).click();
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 
		 
		 
		 
		 
		//for( int i =1; i<5; i++)
			
			//{
				//driver.findElement(By.id("hrefIncAdt")).click();
				 
			//}
			
			//driver.findElement(By.id("btnclosepaxoption")).click();
			//Assert.assertequals(driver.findelement(by.id("dicpaxinfo")).gtetext(),"5 adult");
			
			//System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			
			//CLICK ON THE SEARCH BUTTON
			//driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click(); if you know the id
			driver.findElement(By.cssSelector("input[value='Search']")).click();//CUSTOMIZE CSS
			//driver.findElement(By.xpath("//input[@value='Search']")).click(); //CUSTOMIZED XPATH
		
		}
	
}
				
	
		 
	

