package actionclass;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day29keyupandkeydown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		Actions a = new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		a.keyUp(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		a.keyDown(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
		a.keyDown(Keys.PAGE_UP).build().perform();
	     Thread.sleep(2000);
		a.keyUp(Keys.PAGE_UP).build().perform();
		Thread.sleep(2000);
	
		
	}

}
