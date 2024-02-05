import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day23multipleselectdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/nandu/Downloads/demo-1.html");
		WebElement multipledropdown = driver.findElement(By.id("multiple_cars"));
		Select s_ref = new Select(multipledropdown);
		s_ref.selectByIndex(8);
		s_ref.selectByValue("merc");
		s_ref.selectByVisibleText("Jaguar");
		

	}

}
