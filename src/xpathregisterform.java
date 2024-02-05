import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpathregisterform {
public static void main(String[] args) throws InterruptedException {
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
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[2]/input")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("nandini");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[3]/input")).sendKeys("kp");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[4]/input")).sendKeys("dinisaro@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[1]/input")).sendKeys("1234567kjhgf");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[3]/div[2]/div[2]/input")).sendKeys("1234567kjhgf");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div[2]/form/div/div[2]/div[4]/input")).click();
			Thread.sleep(5000);
				
			}
			else
				System.out.println("you are not in register webpage");

	}
		driver.close();

}
}