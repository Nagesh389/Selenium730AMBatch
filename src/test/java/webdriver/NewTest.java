package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {


	private WebDriver driver;
	@Test //Test Scenario
	public void mFAQs() {
		driver.findElement(By.linkText("Manual FAQs")).click();	
	}
	@Test
	public void sFAQs(){
		driver.findElement(By.linkText("Selenium FAQs")).click();	
	}
	@Test
	public void cFAQs(){
		driver.findElement(By.linkText("Core Java FAQs")).click();	
	}
  @BeforeTest
  public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://selenium4testing.com/");
		driver.findElement(By.id("closediv")).click();
  }

  @AfterTest
  public void afterTest() {
  }



}
