import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day24ismultiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/nandu/Downloads/demo.html");
		WebElement singledropdown = driver.findElement(By.xpath("//select[@id='standard_cars']"));
		WebElement multipledropdown = driver.findElement(By.xpath("//select[@id='multiple_cars']"));
		Select s1= new Select(singledropdown);
		Select s2= new Select(multipledropdown);
		if(s1.isMultiple()) {
			System.out.println("you are using singledropdown");
			Thread.sleep(5000);
			List<WebElement> s1_values = s1.getOptions();
			Thread.sleep(2000);
			for(WebElement web :s1_values) {
				web.click();
				Thread.sleep(5000);
		}
			s1.deselectAll();	
			}
		else {
			System.out.println("you are using multiple dropdown");
		    Thread.sleep(2000);
		    List<WebElement> s2_values = s2.getOptions();
		    Thread.sleep(2000);
		    System.out.println(s2_values);
		    for(WebElement web :s2_values) {
		    	web.click();
		    	Thread.sleep(5000);
		    	}
		    s2.deselectAll();
		    }
	 driver.close();
}
}
 