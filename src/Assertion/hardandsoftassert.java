package Assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardandsoftassert{
	@Test
	public void dws() {
		String given_url="https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String current_url = driver.getCurrentUrl();
		//Assert.assertEquals(given_url, current_url);
		//Assert.assertNotEquals(given_url, current_url);
		SoftAssert soft_assert = new SoftAssert();
		//soft_assert.assertEquals(given_url, current_url);
		soft_assert.assertNotEquals(given_url, current_url);
		System.out.println("successfull");
		driver.quit();
		
	}
	
}