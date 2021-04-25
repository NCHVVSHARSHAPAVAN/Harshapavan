package QATOOLS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;

public class Informationcommand {
	
	public WebDriver driver;
 
	@Test(priority =1)
	
  public void f() throws Exception {
	 String hh = driver.findElement(By.name("btnK")).getAttribute("aria-label");
	  
	  System.out.println(hh);
	  //String str3 =  driver.findElement(By.name("btnK")).getAttribute("value");
		//System.out.println(str3);

	  Thread.sleep(10000);
	  }
  @Test(priority = 2)
  public void iamfeelinglucky() throws Exception {
	  String hh2 = driver.findElement(By.name("btnI")).getAttribute("value");
	  System.out.println(hh2);
	  Thread.sleep(2000);
  }
 @Test(priority = 3)
  public void googleapps() throws Exception {
	  String hh3 = driver.findElement(By.xpath("//*[@id=\"gbwa\"]/div/a")).getAttribute("aria-label");
	  System.out.println(hh3);
	  Thread.sleep(2000);
  
  
  
	//String screenshot = "screenshot1";
	//File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 //FileHandler.copy(scrfile, new File("D:\\dad\\WhatsApp\\.Shared"+screenshot+".png"));
	 
  String screenshot = "screenshot1";
	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(scrFile,new File("D:\\dad\\WhatsApp\\screenshot\\"+screenshot+".png"));

//"D:\dad\WhatsApp\screenshot"
  }

  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mypc\\Downloads\\chromedriver_win32\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.get("http:/google.com");
  
  
  }

  @AfterTest
  public void afterTest() {
  
  }

}
