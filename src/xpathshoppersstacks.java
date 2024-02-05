import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpathshoppersstacks {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String given_url="https://www.shoppersstack.com/";
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(5000);
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("you are in shoppers stack ");
		    WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		    if(login.isEnabled()) {
			  System.out.println("login is enabled");
			  login.click();
			  WebElement createaccount = driver.findElement(By.xpath("//span[text()='Create Account']"));
			  if(createaccount.isDisplayed()) {
				  System.out.println("create button is displayed");
				  createaccount.click();
				  driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("dingi");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys("dingi");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//input[@name='Female']")).click();
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//input[@id='Phone Number']")).sendKeys("1234567789");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//input[@name='Email Address']")).sendKeys("dingi@gmail.com");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("1234@Qwert");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//input[@id='Confirm Password']")).sendKeys("1234@Qwert");
				  Thread.sleep(2000);
				  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
				  WebElement register = driver.findElement(By.xpath("//button[text()='Register']"));
				  if(register.isEnabled()) {
					  System.out.println("register button is enabled");
					  register.click();
					  Thread.sleep(3000);
					  System.out.println("registration done succesfully");
					  driver.close();
				  }
				  else 
					  System.out.println("check the details ");
				  
			  }
			  else
				  System.out.println("ypu are not in wrong webpage");
			  
		}
		    else
		    	System.out.println("login is not enabled");
		}
		else
			System.out.println("you are in different website");
		}

}
