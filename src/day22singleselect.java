import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day22singleselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/nandu/Downloads/demo.html");
		Thread.sleep(2000);
		WebElement single_select = driver.findElement(By.xpath("//select[@id='standard_cars']"));
		Thread.sleep(2000);
		Select s_ref=new Select(single_select);
		//s_ref.selectByVisibleText("BMW");
		//s_ref.selectByIndex(6);
		s_ref.selectByValue("min");
		Thread.sleep(2000);
		driver.close();
		

	}

}
