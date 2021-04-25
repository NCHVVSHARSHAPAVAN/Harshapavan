package Registrationform;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class registrationform {
	public WebDriver driver;
	
	
  @Test
  public void f() {
	  driver.findElement(By.id("firstName")).sendKeys("Harsha Pavan");
	  driver.findElement(By.id("lastName")).sendKeys("N CH V V S");
	  driver.findElement(By.id("userEmail")).sendKeys("nchvvsharshapavan@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
	  driver.findElement(By.id("userNumber")).sendKeys("8464048484");
	  driver.findElement(By.id("dateOfBirthInput")).click();
	  new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"))).selectByVisibleText("1997");
	  new Select(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).selectByVisibleText("July");
	  driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[3]")).click();
	  
	  WebElement str =  driver.findElement(By.id("uploadPicture"));
	  str.sendKeys("D:\\ramya\\god images\\download (7).jpg");
	  driver.findElement(By.id("currentAddress")).sendKeys("H.no:- 14/3-60, Ballepalli, Khammam");
	  driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")).click();
		//WebElement str1 = driver.findElement(By.xpath("//*[@id=\\\"state\\\"]/div/div[1]"));
		
	 // new Select(driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]"))).selectByVisibleText("select state");
	  //new Select(driver.findElement(By.xpath("react-select-3-option-2"))).selectByVisibleText("Haryana");
	  //driver.findElement(By.xpath("//*[@id=\"city\"]/div/div[1]/div[1]")).click();
	  //new Select(driver.findElement(By.xpath("//div[@id='react-select-3-option-2']"))).selectByVisibleText("Karnal");
	  
		WebElement str1 = new Select(driver.findElement(By.xpath("//div[@class=' css-1hwfws3'][contains(.,'Select State')]"))).getFirstSelectedOption();
		System.out.println(str1.getText());

		if(str.getText().equalsIgnoreCase("NCR")){
			System.out.println("Pass");
		}
		else {
			System.out.println("Failed");
		}
		  
		
	  driver.findElement(By.id("submit")).click();
	  
	  
	  
	  
	  
  }
  
 // private Object newselect(WebElement findElement) {
	// TODO Auto-generated method stub
	//return null;
//}

@BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\mypc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
