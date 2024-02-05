import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com/");
		String Current_titlrMyntra=driver.getTitle();
		driver.get("https://www.nykaa.com/");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
