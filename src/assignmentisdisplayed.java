import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class assignmentisdisplayed {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    String given_url= "https://demowebshop.tricentis.com/";
    driver.get("https://demowebshop.tricentis.com/");
    String current_url =driver.getCurrentUrl();
    if(given_url.contains(current_url)){
    	System.out.println("you are in demowebshop");
    	driver.findElement(By.cssSelector(".nivo-imageLink"));
    	Thread.sleep(3000);
    	WebElement homepage = driver.findElement(By.cssSelector("div[id='nivo-slider']"));
    	if(homepage.isDisplayed()){
    		System.out.println("you are in demowebshop homepage");
    		driver.findElement(By.linkText("Digital downloads")).click();
    		WebElement digital_downloadspage = driver.findElement(By.cssSelector("div[class='page-title']"));
    		if(digital_downloadspage.isDisplayed()) {
    			System.out.println(" you are in digital downloads webpage ");
    			List<WebElement> digital_downloads = driver.findElements(By.cssSelector("input[value='Add to cart']"));
			    for  ( WebElement web: digital_downloads){
					web.click();
					Thread.sleep(4000);
				}}
			    else {
			    	System.out.println("you are not in digital download webpage");
			    }
    		driver.findElement(By.cssSelector("a[class='ico-cart']")).click();
    		WebElement shopping_cartpage = driver.findElement(By.cssSelector("div[class='page-title']"));
    		if(shopping_cartpage.isDisplayed()) {
    			System.out.println("you are in shoppingcart webpage");
    			List<WebElement> shoppingcart = driver.findElements(By.cssSelector("input[name='removefromcart']"));
    			for( WebElement web: shoppingcart) {
    				web.click();
    				Thread.sleep(3000);
    				}
    		driver.findElement(By.cssSelector("input[name='updatecart']")).click();
    		driver.close();
    		}
    			else 
    				System.out.println("you are not in shoppingcartwebpage");

    		}
    	else
    		System.out.println("you are not in demowebshop home page");
		}
    else
    	System.out.println("you are not in demowebpage");
    	}
    }
    


