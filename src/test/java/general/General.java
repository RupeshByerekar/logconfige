package general;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import log4j.Log;

public class General {

	WebDriver driver;
	public void setup()
	{
		Log.info("launch browser");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		Log.info("Enter ulr");
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		
	}
	
	public void login() throws Exception
	{
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Log.info("Login successful");
		Thread.sleep(3000);
	}
	
	public void logout()
	{
		driver.findElement(By.linkText("Logout")).click();
		Log.info("Logout from Application");
	}
	
	public void closure()
	{
		driver.close();
		Log.info("close the Browser");
	}
}
