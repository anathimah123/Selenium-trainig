package introduction1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bobby Carelse\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.spicejet.com");
		
	
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);//putting it to sleep for 2 hours
		
		//if you want it to click 5 times you will select the underneath method 4 times 
		
		// this is the syntax for whileloop
		int i =1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			 
		i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}
// for loop the difference between for loop and while loop is instead of writing peaces write everything in one single line
	
	//for(int i=1;i<5;i++)
	//driver.findelement(by.id("hrefincadt")).click();
	//driver.findelement(by.id("btnclosepaxoption")).click();
}
