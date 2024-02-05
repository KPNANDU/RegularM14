package actionclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day29kalkiassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String given_url="https://www.kalkifashion.com/in/";
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.kalkifashion.com/in/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("you are in kalki fashion website");
			List<WebElement> kalki = driver.findElements(By.xpath("//div[@class='level0 cmsb519-lg:text-center cmsb519-relative cmsb519-min-h-[42px] cmsb519-flex']/div"));
			Actions a =new Actions(driver);
			for(WebElement web : kalki) {
				a.moveToElement(web).keyDown(Keys.SHIFT).click().build().perform();
				Thread.sleep(2000);
			}
			driver.quit();
			
		}
		else
			System.out.println("you are not in kalki website");
	}

}
