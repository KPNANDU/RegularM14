package testngassignment1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testnggucci {
	@Test
	public void gucci() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String given_title="Gucci Shoes for Men | Men's Designer Shoes  | GUCCI® US";
		String given_url="https://www.gucci.com/us/en/ca/men/shoes-for-men-c-men-shoes";
		driver.get("https://www.gucci.com/us/en/ca/men/shoes-for-men-c-men-shoes");
		String current_url=driver.getCurrentUrl();
		String current_title=driver.getTitle();
		System.out.println(given_title.equals(current_title));
		System.out.println(current_title);
		if(given_url.contains(current_url)) {
			System.out.println("you are in gucci webpage");
		}
		else
		{
			System.out.println("you are in different webpage");
		}
		driver.close();
		
	}

}
