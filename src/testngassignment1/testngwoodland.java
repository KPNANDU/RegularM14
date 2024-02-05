package testngassignment1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngwoodland {
	@Test
	public void woodland() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String given_url="https://www.woodlandworldwide.com/";
		driver.get("https://www.woodlandworldwide.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.contains(current_url)) {
			System.out.println("you are in woodland webpage");
		}
		else
		{
			System.out.println("you are in different webpage");
		}
		driver.quit();
		
	}

}
