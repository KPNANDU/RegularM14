import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselectorintro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("mobile");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		}

}
