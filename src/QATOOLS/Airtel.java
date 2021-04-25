package QATOOLS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Airtel {
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	 
 String pp1 = driver.findElement(By.xpath("//a[@target='_self'][contains(.,'BUSINESS')])[1]")).getAttribute("href");
 System.out.println(pp1);
		
	 Thread.sleep(2000);
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mypc\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.airtel.in/s/selfcare?normalLogin");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
