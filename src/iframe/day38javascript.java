package iframe;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day38javascript {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://skillrary.com/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000);");
		//Thread.sleep(1000);
		//js.executeScript("window.scrollBy(0,-1000);");
		js.executeScript("window.scrollTo(0,1000);");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,-1000);");

	}

}