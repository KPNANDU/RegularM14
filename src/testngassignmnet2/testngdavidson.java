package testngassignmnet2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngdavidson {
	@Test
	public void davidson() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	String given_url="https://www.harley-davidson.com/in/en/current/reveals/2024/h-d-24-launch.html";
	driver.navigate().to("https://www.harley-davidson.com/");
	String current_url=driver.getCurrentUrl();
	if(given_url.equals(current_url)) {
		System.out.println("you are in haeleydavidson webpage");
	}
	else {
		System.out.println("you are in different webpage");
	}
	driver.close();
	}
}
