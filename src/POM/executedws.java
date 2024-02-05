package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class executedws {
	@Test
	public void receiver() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		day46DWSHomePage execute = new day46DWSHomePage(driver);
		//execute.searchField.sendKeys("mobile");
		//execute.searchbutton.click();
		execute.searchField("mobile");
		execute.searchbutton();
	}

}
