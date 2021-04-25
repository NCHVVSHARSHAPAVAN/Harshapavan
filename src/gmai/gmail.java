package gmai;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class gmail {
	public WebDriver driver;
	
	
  @Test
  public void login() {
	  driver.findElement(By.id("identifierId")).sendKeys("nchvvsharshapavan@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		driver.findElement(By.id("password")).sendKeys("harshA1234@");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mypc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
	
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
