import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class day26omayoassgnment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String given_url="https://omayo.blogspot.com/";
	    driver.navigate().to("https://omayo.blogspot.com/");
	    String current_url=driver.getCurrentUrl();
	    if(given_url.equals(current_url)) {
	    	System.out.println("you are in omayo blogspot");
	    	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
	    	WebElement dropdown= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dropdown']")));
	    	dropdown.click();
	    	WebElement flipkart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='http://facebook.com']")));
	    	flipkart.click();
	    	driver.navigate().back();
	}

}
}
