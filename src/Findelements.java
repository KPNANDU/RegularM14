import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		List<WebElement> community_pool = driver.findElements(By.cssSelector("input[type='radio']"));
		for  ( WebElement web:community_pool)
		{
			web.click();
			Thread.sleep(4000);
		}
          driver.close();
	}

}
