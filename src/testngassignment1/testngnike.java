package testngassignment1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngnike {
@Test
	public void nike() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String given_url="https://www.nike.com/in/";
		driver.navigate().to("https://www.nike.com/in/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("you are in nike webpage");
		}
		else {
			System.out.println("you are in different webpage");
		}
		driver.close();
	}

    

}
