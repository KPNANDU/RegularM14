import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class day24dwsbook1 {
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
		String given_url="https://demowebshop.tricentis.com/";
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("you are in demowebshop page ");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@href='/books'][1]")).click();
			Thread.sleep(2000);
			 WebElement sortby = driver.findElement(By.xpath("//select[@name='products-orderby']"));
			 Thread.sleep(2000);
			 Select s_ref=new Select(sortby);
			 s_ref.selectByVisibleText("Price: Low to High");
			 System.out.println(s_ref.getOptions());
			 Thread.sleep(2000);
			 WebElement display = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
			 Select s_ref1=new Select(display);
			 s_ref1.selectByIndex(0);
			 WebElement viewas = driver.findElement(By.xpath("//select[@onchange='setLocation(this.value);'][1]"));
			 Thread.sleep(2000);
			 Select s_ref2=new Select(viewas);
			 s_ref2.selectByValue("value=\"https://demowebshop.tricentis.com/books?viewmode=list\"");
			 
			
			
		}
		
		

	}

}
