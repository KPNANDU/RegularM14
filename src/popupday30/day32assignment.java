package popupday30;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day32assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right_click = driver.findElement(By.xpath("//span[text()='right click me']"));
		//Actions a=new Actions(driver);
		//a.moveToElement(right_click).contextClick(right_click).build().perform();
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		for (WebElement web : options) {
			Actions a=new Actions(driver);
			a.moveToElement(right_click).contextClick(right_click).build().perform();
			web.click();
			Thread.sleep(2000);
			Alert a1=driver.switchTo().alert();
			System.out.println(a1.getText());
			a1.dismiss();
			Thread.sleep(2000);
			//driver.close();
		}

	}

}
