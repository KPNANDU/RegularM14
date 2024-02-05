package testcasesassignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc6 {

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
		WebElement create_account = driver.findElement(By.xpath("//span[text()='Create Account']"));
		create_account.click();
		Thread.sleep(2000);
		System.out.println("signup page is displayed");
		WebElement signin = driver.findElement(By.id("signIn"));
		Actions a = new Actions(driver);
		a.moveToElement(signin).perform();
		if(signin.isEnabled()) {
			System.out.println("signin is enablled");
			signin.click();
		}
		else
		{
			System.out.println("signin is not enabled");
		}
		

	}

}
