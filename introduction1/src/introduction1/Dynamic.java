package introduction1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bobby Carelse\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.spicejet.com");
		//a[@value='MAA']
		
		//a[@value='BLR']
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//we add the 2 because chinia also appears from as well as to so you have to identify that it must click on the second one
	  //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	    //you can use this code if you dont want to use the index this is just another way of searching for a path by using parent and child remember the parent selects the whole thing but a child selects the specific thing you want
	    
	    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']")).click();
	 
	}

}
