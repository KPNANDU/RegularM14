import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class day26omayoassignment2 {

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
	    	WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timerButton")));
	    	button.click();
	    	WebElement button3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='timerButton']")));
	    	button3.click();    
	    	
	    	
	    }
		

	}

}
