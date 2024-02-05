package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class day36dream11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeOptions c_options = new ChromeOptions();
			c_options.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(c_options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			driver.get("https://www.dream11.com/");
			driver.switchTo().frame(0);
			//driver.switchTo().frame("send-sms-iframe");
			//WebElement iframe = driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']"));
		    //driver.switchTo().frame(iframe);
			driver.findElement(By.id("regEmail")).sendKeys("1234567865");
			driver.switchTo().parentFrame();
			driver.findElement(By.id("hamburger")).click();
			

	}

}
