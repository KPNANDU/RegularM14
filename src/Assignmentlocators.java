import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentlocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String Current_title=driver.getTitle();
		Thread.sleep(3000);
		driver.navigate().to("https://www.abhibus.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		String given_title="Demo Web Shop";
		if(Current_title.equals(given_title))
		{
			System.out.println(" you are in  demo web shop ");
		}
		else
		{
			System.out.println("you are in abhibus webpage ");
		}
		driver.findElement(By.name("q")).sendKeys("Jewelry");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.quit();

	}

}
