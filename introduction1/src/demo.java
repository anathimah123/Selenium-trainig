import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code-
		
		// Create Driver object for chrome browser
		
		// We will strictly implement methods of webdriver
		
		/* class name = ChromeDriver,
		 * x driver= new x();*/
		
// invoke .exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bobby Carelse\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		
		driver.get("http://facebook.com");//this will hit url on the browser
		System.out.println(driver.getTitle()); // this will help you validate if your page title is correct
		driver.findElement(By.cssSelector("#email")).sendKeys("anathimahlathi@gmail.com");//email
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("nosave");//password
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
		
		
		
		//System.out.println(driver.getCurrentUrl()); //validate if you have landed on a correct url 
		
		//if you want to print your web page source, there is a rule, you can use you page source to search for an item for an example if you are looking for a person id
		//if you are unable to get the page source when you right click you can say:
		//System.out.println(driver.getPageSource()); //this is how you will print page source
		
		//driver.get("http://yahoo.com");
		//if you landed in a different page and for an example you want to go back you simply do thi:
		//driver.navigate().back();
		
		//this is what you will use if you want to go foward:
		//driver.navigate().forward();
		
		//so if you want to close the web driver:if you are working on a single page
		//driver.close();
		//driver.quit(); //it closes all the browser opened by selenium script,this will close child windows
		
		//locaters
		//driver.get("http://facebook.com"); //this actually opens the url of the browser
		//once we entered in the facebook web page we are interested in entering your id in the email and password fields
		
		//driver.findElement(By.id("email")).sendKeys("this is my first code");
		//selenuim will go to the facebook page and search for the field id that contains email
		//password field locater
		//driver.findElement(By.name("pass")).sendKeys("123456");
	}
}
 