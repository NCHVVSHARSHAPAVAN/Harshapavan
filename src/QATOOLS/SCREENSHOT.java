package QATOOLS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SCREENSHOT {
	public WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
	  String ATM = "Print";
	  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 org.openqa.selenium.io.FileHandler.copy(scrFile, new File("D:\\SCR"+ATM+".png"));
		 
		 System.out.println(ATM);
		 
		  Thread.sleep(3000);
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mypc\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.youtube.com");
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
