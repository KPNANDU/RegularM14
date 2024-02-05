package testcasesassignment1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tc7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String given_url = "https://www.shoppersstack.com/";
		String given_title="ShoppersStack | Shopper | Signup";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("you are in shoppersstack webpage");
			Thread.sleep(5000);
			driver.findElement(By.id("loginBtn")).click();
			System.out.println("you are in login page");
			WebElement create_account = driver.findElement(By.xpath("//span[text()='Create Account']"));
			create_account.click();
			String current_title = driver.getTitle();
			if(given_url.equals(current_url)) {
				System.out.println("you are in create account");
				WebElement signin = driver.findElement(By.id("signIn"));
				Actions a = new Actions(driver);
				a.moveToElement(signin).perform();
				System.out.println("signin text is color changed");
			}
			else {
		        System.out.println("you are not in create account");
			}}
		else
			System.out.println("you are not in shoppersstack webpage");
	}

}
