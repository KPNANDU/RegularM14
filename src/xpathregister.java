import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpathregister {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String given_url="https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("you are in demowebshop page ");
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
			WebElement registerpage = driver.findElement(By.cssSelector("div[class='page-title']"));
			Thread.sleep(5000);
			if(registerpage.isDisplayed()) {
				System.out.println("you are in register webpage");
			}
			else
				System.out.println("you are not in register webpage");
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[2]/a")).click();
			Thread.sleep(5000);
			 WebElement loginpage = driver.findElement(By.cssSelector("div[class='page-title']"));
			 if(loginpage.isDisplayed()) {
				 System.out.println("you are in login page");
			 }
			 else
				 System.out.println("you are not in login page");
			}
		   driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[3]/a")).click();
		   Thread.sleep(5000);
		   WebElement shoppingcart = driver.findElement(By.cssSelector("div[class='page-title']"));
		   if(shoppingcart.isDisplayed()) {
			   System.out.println("you are in shopping cart page ");
		   }
		   else
			   System.out.println("you are not in shopping cart page");
		   driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[4]/a")).click();
		   Thread.sleep(5000);
		   WebElement wishlist = driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[4]/a"));
		   if(wishlist.isDisplayed()) {
			   System.out.println("you are in wishlist");
		   }
		   else
			   System.out.println("you are not in wishlist");
		   
		driver.close();
	}

}
