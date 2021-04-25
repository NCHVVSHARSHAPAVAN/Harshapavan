package Pavan;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class fb {
	
	
	public WebDriver driver;
  @Test
  public void login() {
	  
	  driver.findElement(By.id("email")).sendKeys("nchvvsharshapavan@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("harshA1234@");
		driver.findElement(By.name("login")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mypc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
	
		driver.get("https://www.facebook.com");
  }

  @AfterTest
  public void afterTest() {
  }

}
