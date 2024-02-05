import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class xpathassignmentattribute {
	public static WebDriver driver;
	public static void ChromeBrowser(){
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		}
	public static void OpenDws() {
		driver.get("https://demowebshop.tricentis.com/");
	}
	public static void BrowserClose() {
		driver.close();
		}
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeBrowser();
		OpenDws();
		String given_url="https://demowebshop.tricentis.com/";
		Thread.sleep(3000);
	    String current_url=driver.getCurrentUrl();
	    if(given_url.equals(current_url)) {
	    	System.out.println("you are in demowebshop home page");
	    	driver.findElement(By.xpath("//h2[@class='product-title']")).click();
		    Thread.sleep(3000);
		    WebElement productlist = driver.findElement(By.xpath("//div[@class='product-name']"));
		    if(productlist.isDisplayed()) {
		    	System.out.println("you are in giftscard page");
		    	driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("dingi");
		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath("//input[@id='giftcard_2_RecipientEmail']")).sendKeys("dingi05@gmail.com");
		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("dinga");
		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath("//input[@name='giftcard_2.SenderEmail']")).sendKeys("dinga04@gmail.com");
		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("from:dinga  to:dingi qwertyuiohgfdsazxcvbnmkjhgfdsertyuikjhgcv");
		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath("//input[@value='1']")).click();
		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
		    	Thread.sleep(2000);
		    }
		    else
		    	System.out.println("you are not in giftscard page");
		    driver.findElement(By.xpath("//a[@class='ico-cart']")).click();
		    WebElement shoppingcart = driver.findElement(By.xpath("//div[@class='page-title']"));
			   if(shoppingcart.isDisplayed()) {
				   System.out.println("you are in shopping cart page ");
				   driver.findElement(By.xpath("//td[@class='remove-from-cart']")).click();
				   Thread.sleep(3000);
				   driver.findElement(By.xpath("//input[@name='updatecart']")).click();	   
			   }
			   else
				   System.out.println("you arenot in shoppingcart page");
			   BrowserClose();
		
		
	    }
	    else
	    	System.out.println("you are not in demowebshop page");
	}

}
