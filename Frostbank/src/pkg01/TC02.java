package pkg01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC02 {
	
	WebDriver driver;
	
	@BeforeClass
	
	public void lunchBrowser(){
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.frostbank.com/");
	}
	
	@Test
	
	public void testcase(){
		
		driver.findElement(By.id("username-field")).sendKeys("abc");
		
		driver.findElement(By.id("password-field")).sendKeys("abc");
		
		driver.findElement(By.id("login-button")).click();
		
		
		
	}
	
	@AfterClass
	
	public void quit(){
		
		//driver.quit();
		
	}

}
