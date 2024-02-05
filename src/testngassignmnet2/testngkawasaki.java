package testngassignmnet2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngkawasaki {
	@Test
	public void husqvarna() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.husqvarna-motorcycles.com/en-in.html");
		WebElement bike= driver.findElement(By.xpath("//div[@class='nav__logo']"));
		if(bike.isDisplayed())
		{
			System.out.println("you are in husqvarna webpage");
		}
		else 
			System.out.println("you are not in husqvarna webpage ");
		
		driver.close();
		
	}

}
