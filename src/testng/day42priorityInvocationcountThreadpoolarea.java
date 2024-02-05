package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class day42priorityInvocationcountThreadpoolarea {
	@Test(priority = 2)
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
	@Test(priority = 3,invocationCount = 2 ,threadPoolSize = 2)
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
	@Test(priority = 4)
	public void kawasaki() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.husqvarna-motorcycles.com/en-in.html");
		WebElement bike= driver.findElement(By.xpath("//div[@class='nav__logo']"));
		if(bike.isDisplayed())
		{
			System.out.println("you are in husqvarna webpage");
		}
		else 
			System.out.println("you are not in husqvarna webpage ");
		
		driver.close();
		}
	@Test(priority = 1)
	public void yamaha() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.yamaha-motor-india.com/");
		WebElement yamaha = driver.findElement(By.xpath("//a[@class='header__logo']"));
		if(yamaha.isDisplayed())
		{
			System.out.println("you are in yamaha webpage");
		}
		else 
			System.out.println("you are not");
		
		driver.close();
	}

}
