package introduction1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Bobby Carelse\\Documents\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver ();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		//driver.findElement(By.xpath("//input[@value='Milk ']")).click();
		//if you want to know how many radio buttons are present in that session and base on the radio buttons i want to select first index assume that the developer didnt give you the name or the values of the present index
		//assume that we only have name and type attributes, we have a common type and name so how do you seperate these attributes
		
		//if you notice that the index contains the same name when you type in findelement add an S (elements plural)
	//System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size());
	
	//so now i want to click on butter but i dont have the value and attribute
	
		int count =driver.findElements(By.xpath("//input[@name='group1']")).size();
		for (int i=0;i<count;i++)
		{
			//driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			
			
			//now i only want to click the radio button only if it is cheese, assume there is no value attribute
			String text= driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			 if (text.equals("Cheese"))
			 {
				 driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			 }
			 
			
		}  
	}

}
