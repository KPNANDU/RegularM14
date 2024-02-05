package testcasesassignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc5 {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(10000);
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(45));
		WebElement login =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
		login.click();
		System.out.println("shoppers login page is displayed");
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		System.out.println("signup page is displayed");
		WebElement signin = driver.findElement(By.id("signIn"));
		Actions a = new Actions(driver);
		a.moveToElement(signin).perform();
		System.out.println("signup link is underlined");
		

	}

}
