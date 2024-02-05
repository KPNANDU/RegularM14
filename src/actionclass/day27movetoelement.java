package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day27movetoelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("(//a[@href='/shop/women'])[1]"));
		Actions action=new Actions(driver);
		action.moveToElement(men).perform();
		driver.findElement(By.xpath("(//a[text()='Ethnic Wear'])[1]")).click();
		

	}

}
