package testngassignmnet2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngbmw {
@Test(groups = "smoke")
public void bmw() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	String given_title="BMW India";
	driver.navigate().to("https://www.bmw.in/en/index.html");
	String current_title=driver.getTitle();
	if(given_title.equals(current_title)) {
		System.out.println("you are in bmw webpage");
	}
	else {
		System.out.println("you are in different webpage");
	}
	driver.close();
}
}
