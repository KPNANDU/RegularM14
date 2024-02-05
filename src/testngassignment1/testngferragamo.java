package testngassignment1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngferragamo {
	@Test
	public void ferragamo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String givenurl="https://www.ferragamo.com/en-in/";
		driver.get("https://www.ferragamo.com/en-in/");
		String current_url=driver.getCurrentUrl();
		//System.out.println(driver.getTitle());
		if(givenurl.contains(current_url)) {
			System.out.println("you are in ferragamo webpage");
		}
		else
		{
			System.out.println("you are in different webpage");
		}
		driver.close();
		
	}

}
