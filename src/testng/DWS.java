package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DWS {
	@Test
	public void demowebshop(){
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.navigate().to("https://www.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("fb",true);
		System.out.println("werthjds");
		//driver.quit();
		}
	@Test
	public void nest() {
		System.out.println("wertyuhgvbnm");
	}
	@Test
	public void zest() {
		System.out.println("duassjcnmal");
	}

}
