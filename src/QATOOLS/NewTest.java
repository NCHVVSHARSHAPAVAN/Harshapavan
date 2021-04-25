package QATOOLS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void alert() throws Exception {
	  driver.findElement(By.id("alertButton")).click();
	  String stng = driver.switchTo().alert().getText();
	  System.out.println(stng);
	  driver.switchTo().alert().accept();
	  Thread.sleep(0);
  }
  
  @BeforeTest
  public void beforeTest() {
  
  System.setProperty("webdriver.chrome.driver","C:\\Users\\mypc\\Downloads\\chromedriver_win32\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("https://demoqa.com/alerts");
  
  
  }

  @AfterTest
  public void afterTest() {
  }

}
