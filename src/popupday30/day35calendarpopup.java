package popupday30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class day35calendarpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://www.agoda.com/");
		WebElement no_thanks = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='No thanks']")));
		no_thanks.click();
		driver.findElement(By.xpath("//div[@data-selenium='checkInText']")).click();
		driver.findElement(By.xpath("(//span[@data-selenium-date='2024-01-24'])")).click();
		driver.findElement(By.xpath("//div[@data-selenium='checkOutBox']")).click();
		driver.findElement(By.xpath("//div[@data-selenium='checkOutBox']")).click();
		WebElement next_month = driver.findElement(By.xpath("//button[@aria-label='Next Month']"));
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//span[@data-selenium-date='2024-05-23']")).click();
			System.out.println("script is succesfull");
			
		 }
			catch (Exception e) { 
			// TODO: handle exception
			
			next_month.click();
		
		}
		
}

}

