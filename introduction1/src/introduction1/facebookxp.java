package introduction1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bobby Carelse\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("anathimahlathi@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("nosave");
		//driver.findElement(By.xpath("//*[@id='Login']")).click();
		 
	}

}
