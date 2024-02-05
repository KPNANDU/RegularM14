import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorassignmentwishlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		String given_title = "Demo Web Shop. Wishlist";
		driver.findElement(By.linkText("Wishlist")).click();
		Thread.sleep(5000);
		String current_carttitle=driver.getTitle();
		if(current_carttitle.equals(given_title))
		{
			System.out.println("you are in wishlist page ");
		}
		else
		{
			System.out.println("you are not in wishlist page ");
		}
		driver.close();
		
		
		

	}

}
