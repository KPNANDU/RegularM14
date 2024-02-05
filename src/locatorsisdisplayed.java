import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsisdisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String given_url="https://demowebshop.tricentis.com/";
		String given_title="Demo Web Shop. Digital downloads";
		driver.get("https://demowebshop.tricentis.com/");
		if((given_url).equals(driver.getCurrentUrl()))
		{
			System.out.println("you are in dempwebshop page ");
			driver.findElement(By.partialLinkText("Digital")).click();
			if(given_title.contains(driver.getTitle()))
			{
				System.out.println("you are in digital downloads webpage");
				 List<WebElement> digital_download = driver.findElements(By.cssSelector("input[value='Add to cart']"));
				 for(WebElement web : digital_download)
				 {
					 web.click();
						Thread.sleep(4000);
						 }
				driver.findElement(By.cssSelector("span[class='cart-label']")).click();
				  WebElement shopping_cart = driver.findElement(By.cssSelector("div[class='page-title']"));
				  if(shopping_cart.isDisplayed())
				  {
					  System.out.println("you are in shopping cart webpage");
				  }
				  else
	
					  System.out.println("you are not in shopping cart webpage");
			}
				  else

					  
				  
					  System.out.println("you are not in digital downloads");
		}
		
			else
				System.out.println("you are not in demowebshop ");
				
				 
				 
			}
	

}


