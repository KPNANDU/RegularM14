package iframe;

import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day38screenshotwebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LocalDate time = LocalDate.now();
		String date=time.toString().replace(':', '-');
		driver.navigate().to("https://demowebshop.tricentis.com/");
		

	}

}
