import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsassignmentcart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String given_title="Demo Web Shop. Shopping Cart";
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Shopping cart")).click();
		Thread.sleep(5000);
		String current_title=driver.getTitle();
		if(current_title.equals(given_title))
		{
			System.out.println("you are in shopping cart page");
		}
		else
		{
			System.out.println("you are not in shoppingcart page");
		}
		driver.close();
		

	}

}
