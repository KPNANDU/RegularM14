package testng;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class day43baseclass {
	public WebDriver driver;
	@BeforeClass
	public void precondition() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@BeforeMethod
	public void login() {
		System.out.println("login is succesfull");
	}
	@AfterMethod
	public void logout(){
		System.out.println("logout is successfull");
	}
	@AfterClass
	public void postcondition() {
		driver.quit();
	}

}
