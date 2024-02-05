import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day23deselectall {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/nandu/Downloads/demo-1.html");
		WebElement multipledropdown = driver.findElement(By.id("multiple_cars"));
		Select s_ref = new Select(multipledropdown);
		List<WebElement> web = s_ref.getOptions();
		for(WebElement a: web) {
			a.click();
			Thread.sleep(2000);
			}
		Thread.sleep(2000);
		s_ref.deselectAll();

	}

}
