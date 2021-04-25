package QATOOLS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class windowpopup {
	public WebDriver driver;
	
  @Test
  public void f() {
	  
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mypc\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://demoqa.com/browser-windows");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
