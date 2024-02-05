import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsregisterassign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("FirstName")).sendKeys("Nandini");
		Thread.sleep(3000);
		driver.findElement(By.id("LastName")).sendKeys("sathish");
		Thread.sleep(3000);
		driver.findElement(By.name("Email")).sendKeys("dinisaroo@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.id("Password")).sendKeys("1234567kjhgf");
		Thread.sleep(3000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("1234567kjhgf");
		Thread.sleep(3000);
		driver.findElement(By.name("register-button")).click();
		
		
		
	}

}
