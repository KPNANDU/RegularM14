import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wishlist {
	public static WebDriver driver;
	public static void ChromeBrowser(){
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		}
	public static void closeBrowser() {
		driver.close();
	}
	public static void openDWS() {
		driver.get("https://demowebshop.tricentis.com/");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeBrowser();
		String given_url="https://demowebshop.tricentis.com/";
		openDWS();
		String  current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("you are in demowebpage");
			Thread.sleep(2000);
		    driver.findElement(By.linkText("Digital downloads")).click();
		    Thread.sleep(2000);
		     WebElement book_page = driver.findElement(By.cssSelector("div[class='page-title']"));
		     if(book_page.isDisplayed()) {
		    	 System.out.println("you are in digital downloads page");
		    	 driver.findElement(By.linkText("3rd Album")).click();
		    	 Thread.sleep(2000);
		    	 driver.findElement(By.cssSelector("input[value='Add to wishlist']")).click();
		    	 Thread.sleep(2000);
		    	 driver.findElement(By.linkText("10.00")).click();
		    	 Thread.sleep(2000);
		    
		    	 
		    	   }
		    
		closeBrowser();
		}

	}

}
