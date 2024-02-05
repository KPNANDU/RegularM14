import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day23deselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/nandu/Downloads/demo-1.html");
		WebElement multipledropdown = driver.findElement(By.id("multiple_cars"));
		Select s_ref = new Select(multipledropdown);
		s_ref.selectByIndex(3);
		Thread.sleep(2000);
		s_ref.deselectByIndex(3);
		Thread.sleep(2000);
		s_ref.selectByValue("merc");
		Thread.sleep(2000);
		s_ref.selectByVisibleText("Jaguar");
		Thread.sleep(2000);
		s_ref.deselectByValue("merc");
		Thread.sleep(2000);
		s_ref.deselectByVisibleText("Jaguar");
		
	}

}
