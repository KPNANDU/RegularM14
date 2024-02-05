import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslocatorloginassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String given_url="https://demowebshop.tricentis.com/";
		String given_logintitle="Demo Web Shop. Login";
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		String current_url=driver.getCurrentUrl();
		if(current_url.equals(given_url))
		{
			System.out.println("you are in demo webpage");
		}
		else
			System.out.println("you are not in demo webpage");
		driver.findElement(By.linkText("Log in")).click();
		String currentlogin_title=driver.getTitle();
		if(currentlogin_title.equals(given_logintitle))
		{
			System.out.println("you are in login webpage");
		}
		else
			System.out.println("you are not in login webpage ");
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("dinisaroo@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("1234567kjhgf");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[value='true']")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(8000);
		driver.close();	
	}

}
