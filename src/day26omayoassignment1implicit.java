import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day26omayoassignment1implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String given_url="https://omayo.blogspot.com/";
	    driver.navigate().to("https://omayo.blogspot.com/");
	    driver.findElement(By.xpath("//div[@class='dropdown']")).click();
	    driver.findElement(By.xpath("//a[@href='http://facebook.com']")).click();

	}

}
