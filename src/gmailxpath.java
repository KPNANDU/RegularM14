import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("");
		Thread.sleep(3000);
	}

}
