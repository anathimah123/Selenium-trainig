package introduction1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoF {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code-
		
		// Create Driver object for Firefox browser
		
		// We will strictly implement methods of webdriver
		
		/* class name = FirefoxDriver,
		 * x driver= new x();*/
		
// invoke .exe file first
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bobby Carelse\\Documents\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver ();
		driver.get("http://facebook.com");
		//System.out.println(driver.getTitle());
		//driver.findElement(By.id("email")).sendKeys("anathimahlathi@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("Liyabona@1");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("anathimahlathi@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("nosave");
		//driver.findElement(By.xpath("//*[@id='u_0_2']")).click(); when you want it to click the login button
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
}
}