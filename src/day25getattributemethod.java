import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day25getattributemethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String id="small-searchterms";
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement search_field = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		Thread.sleep(2000);
		String attributevalue = search_field.getAttribute("id");
		Thread.sleep(2000);
		if(id.equals(attributevalue)) {
			System.out.println("your script is correct");
		}
		else
		{
			System.out.println("you script is not correct ");
		}
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
