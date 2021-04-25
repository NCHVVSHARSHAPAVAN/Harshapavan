package QATOOLS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Firstselectedoption {
	public WebDriver driver;
	
	
  @Test
  public void f() {
	 //driver.findElement(By.name("q")).click();
	 WebElement  str = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).getFirstSelectedOption();
	  System.out.println(str.getText());
	  //if(str.getText().equalsIgnoreCase("INR")){
		//	System.out.println("Pass");
		//}
		//else {
			//System.out.println("Failed");
		//}
	  if(str.getText().equalsIgnoreCase("INR")){
		  System.out.println("pass");
		 
	  }
	  else {
		System.out.println("fail");
	}
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mypc\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http:/spicejet.com");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
