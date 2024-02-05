import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class day26explicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.shoppersstack.com/");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement login =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
		login.click();
		WebElement create_account =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Create Account']")));
		create_account.click();
		driver.close();
		

	}

}
