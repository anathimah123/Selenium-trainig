package introduction1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bobby Carelse\\Documents\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver ();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("anathimahlathi@gmail.com");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Liyabona@1");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//verify in firebug before you run the script
		//learn't css customized syntax
		//you can also identify css using short cuts like //id, name
		
		
		
	}

}