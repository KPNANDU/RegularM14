package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day41addtocartchronologicalorder {
  public static WebDriver driver;
 @BeforeClass
  public void openTheBrowser() {
	 driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	 driver.get("https://demowebshop.tricentis.com/");
	  }
 @BeforeMethod(enabled=true)
 public void login() {
	 driver.findElement(By.className("ico-login")).click();;
	 System.out.println("you are in login page");
		driver.findElement(By.id("Email")).sendKeys("dinisaroo@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("1234567kjhgf");
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}
 @Test
 public void addtocart() {
	 System.out.println("successfull..");
	 driver.findElement(By.xpath("//a[text()='Build your own cheap computer']")).click();
	 }
 @AfterMethod(enabled = true)
 public void logout() {
	 driver.findElement(By.className("ico-logout")).click();
	 }
 @AfterClass
 public void closebrowser() {
	 driver.quit();
 }
  }
