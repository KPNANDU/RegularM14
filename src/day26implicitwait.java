import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day26implicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement create_account = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		if(create_account.isDisplayed()) {
			System.out.println("you are in create new account page");
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("dinga");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("dingi");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='_8idr img']")).click();
			Thread.sleep(2000);
			WebElement create_account1 = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
			if(create_account1.isDisplayed()) {
				System.out.println("you are in facebook home page ");
			}
		}
		else
			System.out.println("you are in facebook home page");

}
}
