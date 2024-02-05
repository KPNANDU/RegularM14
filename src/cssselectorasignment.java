	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class cssselectorasignment {
public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String given_url="https://demowebshop.tricentis.com/";
		String given_title="Demo Web Shop. Register";
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		String current_url=driver.getCurrentUrl();
		if(current_url.equals(given_url))
		{
			System.out.println("you are in demo webpage");
		}
		else
			System.out.println("you are not in demo webpage");
		driver.findElement(By.className("ico-register")).click();
		String current_title=driver.getTitle();	
		if(current_title.equals(given_title))
		{
			System.out.println("you are in register webpage");
		}
		else
			System.out.println("you are not in register webpage");
	   driver.findElement(By.cssSelector("input[value='F']")).click();
	   Thread.sleep(4000);
	   driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("Nandini");
	   Thread.sleep(4000);
	   driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("kp");
	   Thread.sleep(4000);
	   driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("dinisaroo@gmail.com");
	   Thread.sleep(4000);
	   driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123456hgfds");
	   Thread.sleep(4000);
	   driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("123456hgfds");
	   Thread.sleep(4000);
	   driver.findElement(By.cssSelector("input[value='Register']")).click();
	   Thread.sleep(4000);
	   driver.close();
	}

}
