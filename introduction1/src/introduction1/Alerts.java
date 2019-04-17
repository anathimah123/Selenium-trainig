package introduction1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bobby Carelse\\Documents\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver ();
		
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
		//you need to switch your driver web element to alert
		//after switching to the alert i want to click to the okay button
System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); //accept is for ok or done yes 
		//driver.switchTo().alert().dismiss(); //used for negative buttons such as cancel
		//if you want to check if the message inside the pop up is correct
		//if you want to enter something in the pop up box
		//driver.switchTo().alert().sendKeys("huahd");  only if its a java pop up
		
	}

}
