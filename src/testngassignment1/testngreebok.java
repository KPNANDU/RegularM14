package testngassignment1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngreebok {
	@Test
	public void reebok() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		String giventitle="Reebok";
		driver.get("https://reebok.abfrl.in/");
		String current_title=driver.getTitle();
		if(giventitle.equals(current_title)) {
			System.out.println("you are in reebok webpage");
		}
		else
		{
			System.out.println("you are in different webpage");
		}
		driver.close();
		
		
		
	}

}
