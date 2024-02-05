package popupday30;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class day35assignmentredbus {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		 ChromeOptions c_options = new ChromeOptions();
		c_options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(c_options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Chennai']")));
		act.keyDown(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("coorg");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//text[text()='Coorg']")));
		act.keyDown(Keys.ENTER).build().perform();
	     driver.findElement(By.cssSelector("div[class='labelCalendarContainer']")).click();
	     driver.findElement(By.xpath("//span[text()='25']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.id("search_button")).click();
	     

		 
		

	}

}
