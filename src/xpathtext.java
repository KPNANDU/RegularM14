import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathtext {
	static WebDriver driver;
	
public static void openBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		openBrowser();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
        Thread.sleep(3000);
        
	}

}
