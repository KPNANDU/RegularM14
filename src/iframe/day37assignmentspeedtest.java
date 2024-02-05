package iframe;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class day37assignmentspeedtest {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		ChromeOptions c_options = new ChromeOptions();
		c_options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(c_options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.speedtest.net/");
		Actions a = new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("See Solutions")).click();
		}

}
