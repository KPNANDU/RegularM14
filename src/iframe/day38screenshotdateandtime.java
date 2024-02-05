package iframe;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class day38screenshotdateandtime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://demowebshop.tricentis.com/");
		LocalDate time = LocalDate.now();
		String date=time.toString().replace(':', '-');
		driver.navigate().to("https://demowebshop.tricentis.com/login");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:/Users/nandu/Pictures/Screenshots/"+date+".png");
		FileHandler.copy(from, to);
	}

}
