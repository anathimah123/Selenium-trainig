package introduction1;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSugestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bobby Carelse\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver.get("https://www.jetaways.net");
		//
		//clear edit box
			//driver.findElement(By.id("flights-origin-prepop-whitelabel_en")).clear();
		WebElement source = driver.findElement(By.id("flights-origin-prepop-whitelabel_en"));
		source.clear(); //you can use this or the first one in line 19
			driver.findElement(By.id("flights-origin-prepop-whitelabel_en")).sendKeys("CPT");
			Thread.sleep(2000);
			driver.findElement(By.id("flights-origin-prepop-whitelabel_en")).sendKeys(Keys.ENTER);
			
			//rather than source  im using a varaible to clear the destination field
			WebElement destination = driver.findElement(By.id("flights-destination-prepop-whitelabel_en"));
			destination.clear();
			destination.sendKeys("JNB");
			Thread.sleep(2000);
			destination.sendKeys(Keys.ARROW_DOWN);
	//we have to loop if we want the arrow to go down four times
			destination.sendKeys(Keys.ENTER);
	}       

}
