import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class utilitydigitaldownload {
	public static WebDriver driver;
	public static void EdgeBrowser(){
		driver =new EdgeDriver();
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
		EdgeBrowser();//precondition
		String given_url="https://demowebshop.tricentis.com/";
		openDWS();//TESTSCRIPT
		Thread.sleep(3000);
		String current_url = driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("you are in demowebshop");
			driver.findElement(By.linkText("Digital downloads")).click();
			Thread.sleep(3000);
			WebElement digital_download = driver.findElement(By.cssSelector("div[class='page-title']"));
			if(digital_download.isDisplayed()) {
				System.out.println("you are in digital downloads webpage");
				List<WebElement> digital_downloads = driver.findElements(By.cssSelector("input[value='Add to cart']"));
			    for  ( WebElement web: digital_downloads){
					web.click();
					Thread.sleep(3000);
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
    		Thread.sleep(3000);
    		System.out.println("updated successfully");
    		closeBrowser();//postcondition 
			}
		}
	}
}



