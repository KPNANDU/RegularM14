package testngassignmnet2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngducati {
	@Test(groups = "smoke")
	public void ducati() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String given_url="https://www.ducati.com/in/en/home";
		driver.navigate().to("https://www.ducati.com/in/en/home");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("you are in ducati webpage");
		}
		else {
			System.out.println("you are in different webpage");
		}
		driver.close();
		
	}
	

}
