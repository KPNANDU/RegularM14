import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com/");
		String Current_titlrMyntra=driver.getTitle();
		driver.get("https://www.nykaa.com/");
		driver.navigate().back();
		String given_titleMyntra="Online Shopping for Women, Men, Kids Fashion &amp; Lifestyle - Myntra";
		if(Current_titlrMyntra.equals(given_titleMyntra))
		{
			System.out.println("you are in myntra webpage");
		}
		else
		{
			System.out.println("you are in nykaa webpage");
		}
		driver.navigate().forward();
		
	}

}
