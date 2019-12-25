package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {
 WebDriver driver;
  @Test
  public void f() {
	  driver.findElement(By.id("user_full_name")).sendKeys("Sadhvi Singh");
	  driver.findElement(By.id("user_email_login")).sendKeys("sadhvisingh9049+1@gmail.com");
	  driver.findElement(By.id("user_password")).sendKeys("BrowserStack123*");
	  driver.findElement(By.xpath("//input[@name='terms_and_conditions']")).click();
	  driver.findElement(By.id("user_submit")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }
  
  @BeforeMethod
  public void openBrowser() {
	  driver.get("https://www.browserstack.com/");
	  driver.findElement(By.id("signupModalButton")).click();
	  System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
  }
  
  @AfterMethod
  public void postSignUp()
  {
	  System.out.println(driver.getCurrentUrl());

  }

}
