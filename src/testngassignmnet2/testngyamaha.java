package testngassignmnet2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngyamaha {
	@Test(groups = "smoke")
	public void yamaha() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.yamaha-motor-india.com/");
		WebElement yamaha = driver.findElement(By.xpath("//a[@class='header__logo']"));
		if(yamaha.isDisplayed())
		{
			System.out.println("you are in yamaha webpage");
		}
		else 
			System.out.println("you are not");
		
		driver.close();
	}

}
