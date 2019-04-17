package introduction1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropedown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bobby Carelse\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://www.orbitz.com");
		Select S = new Select(driver.findElement(By.id("package-1-children-hp-package")));
		S.selectByValue("3");
		S.selectByIndex(6);
		S.selectByVisibleText("5 Adults");
	
	}

}
