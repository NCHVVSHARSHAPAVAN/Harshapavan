package QATOOLS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class mouseactions {
	public WebDriver driver;
	public Actions action;
  @Test
  public void f() throws Exception {
  action = new Actions(driver);
  WebElement ele = driver.findElement(By.linkText("SwitchTo"));
  action.moveToElement(ele).build().perform();
  driver.findElement(By.linkText("Windows")).click();
  Thread.sleep(3000);  
  
  }
  
  @BeforeTest
  public void beforeTest() {
  
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mypc\\Downloads\\chromedriver_win32\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("http://demo.automationtesting.in/Register.html");
  }

  @AfterTest
  public void afterTest() {
  }

}
