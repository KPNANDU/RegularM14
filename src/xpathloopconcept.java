import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathloopconcept {
	static WebDriver driver;
	static String given_url="https://demowebshop.tricentis.com/";
	static String given_title="Demo Web Shop. $25 Virtual Gift Card";
public static void openBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
	public static void giftcart() throws InterruptedException {
	driver.get("https://demowebshop.tricentis.com/");
	String current_url=driver.getCurrentUrl();
	String[]name= {"nandu","nandu@gmail.com","nandu","nandu@gmail.com"};
	if(given_url.equals(current_url)) {
		System.out.println("you are in demo webshop page ");
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(2000);
		String current_title=driver.getTitle();
		Thread.sleep(2000);
		if(given_title.contains(current_title)) {
			System.out.println("you are in gifts card page");
			Thread.sleep(2000);
			 List<WebElement> gift_field = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
			 Thread.sleep(2000);
			 int i=0;
			 for(WebElement web :gift_field ) {
				 web.sendKeys(name[i++]);
				 Thread.sleep(2000);
				 }
			 driver.findElement(By.xpath("//textarea[@id='giftcard_2_Message']")).sendKeys("hi hello");
			  WebElement qty = driver.findElement(By.xpath("//input[@name='addtocart_2.EnteredQuantity']"));
			  qty.clear();
			  Thread.sleep(2000);
			  qty.sendKeys("3");
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();
			  Thread.sleep(5000);
			  driver.findElement(By.xpath("(//a[@class='ico-cart'])[1]")).click();
			  Thread.sleep(3000);
			  driver.close();
			  }
		else {
			System.out.println("check the title of the page");
		driver.close();
		}
		}
	else {
		System.out.println("check the url of the page");
		driver.close();
	}
	}
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		openBrowser();
		giftcart();
		//driver.close();
		
	}}


	

