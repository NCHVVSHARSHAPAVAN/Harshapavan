package QATOOLS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class TTD {
	
	public WebDriver driver;
	public Actions action;
  @Test
  public void f() throws Exception {
	  action = new Actions(driver);
	  WebElement seva = driver.findElement(By.xpath("//div[@id='hdrDirective']/header/div/nav/div"));
	  
	  action.moveToElement(seva).build().perform();
	  driver.findElement(By.xpath("a[contains(@href, '#/sedAvailability')]")).click();
	  driver.findElement(By.name("accept")).click();
	  driver.findElement(By.xpath("div[@id='covidguide']/div/div/div[2]/div[2]/span/button")).click();
	  Thread.sleep(3000);
	  
	  
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mypc\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://tirupatibalaji.ap.gov.in/#/welcome");
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
