package introduction1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bobby Carelse\\Documents\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver ();
		
		driver.get("https://www.rediff.com");
		driver.findElement(By.cssSelector("a[class*='signin']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("anathimahlathi@gmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("liyabona@1");
		driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();
		
	
	
	
	}
}
