package introduction1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class demoIN {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code-
		
		// Create Driver object for Firefox browser
		
		// We will strictly implement methods of webdriver
		
		/* class name = FirefoxDriver,
		 * x driver= new x();*/
		
// invoke .exe file first
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Bobby Carelse\\Desktop\\MicrosoftWebDriver.exe");
		WebDriver driver=new InternetExplorerDriver ();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
}
}