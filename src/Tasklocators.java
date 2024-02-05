import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasklocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Computers");
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
