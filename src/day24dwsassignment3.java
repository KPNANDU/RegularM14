import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day24dwsassignment3 {
	public static WebDriver driver;
	public static void ChromeBrowser(){
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		}
	public static void closeBrowser() {
		driver.close();
	}
	public static void OpenDWS() {
		driver.get("https://demowebshop.tricentis.com/");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeBrowser();
		OpenDWS();
		Thread.sleep(2000);
		String given_url="https://demowebshop.tricentis.com/";
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("you are in demowebshop page ");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='/books'][1]")).click();
			Thread.sleep(2000);
			 WebElement sortby = driver.findElement(By.xpath("//select[@id='products-orderby']"));
			 Select s=new Select(sortby);
			 Thread.sleep(2000);
			 List<WebElement> options = s.getOptions();
			 int i=0;
			 for(WebElement web : options) {
				 sortby = driver.findElement(By.xpath("//select[@id='products-orderby']"));
				 Thread.sleep(2000);
				 s=new Select(sortby);
				 s.selectByIndex(i++);
				 Thread.sleep(2000);
				 //System.out.println(s.getOptions());
			 }
			 driver.close();


	}

}
}