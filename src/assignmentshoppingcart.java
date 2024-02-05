import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class assignmentshoppingcart {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String given_url="https://demowebshop.tricentis.com/";
		String given_title="Demo Web Shop. Digital downloads";
		String given_title2="Demo Web Shop. Shopping Cart";
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		String current_url=driver.getCurrentUrl();
		if(current_url.equals(given_url))
		{
			System.out.println("you are in demo webpage");
			Thread.sleep(4000);
				driver.findElement(By.linkText("Digital downloads")).click();
				String current_title=driver.getTitle();
				if(given_title.equals(current_title))
				{
					System.out.println("you are in digital downloads webpage ");
				    List<WebElement> digital_downloads = driver.findElements(By.cssSelector("input[value='Add to cart']"));
				    for  ( WebElement web: digital_downloads)
					{
						web.click();
						Thread.sleep(4000);
					}
				    driver.findElement(By.partialLinkText("Shopping")).click();
				    String current_title2=driver.getTitle();
				    if(given_title2.contains(current_title2))
				    {
				    	System.out.println("you are in shopping cart webpage");
				    	Thread.sleep(5000);
				    	driver.close();
				    	
				    }  }}
		else 
			System.out.println("you are not in demowebpage");
		}

}

