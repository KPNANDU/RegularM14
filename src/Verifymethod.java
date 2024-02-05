import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String given_title=driver.getTitle();
		String Current_title=driver.getTitle();
		if(given_title.equals(Current_title))
		{
			System.out.println("the given and cuurent is same");
		}
		else
		{
			System.out.println("the given and current url is not same");
		}
		driver.close();
		
	}

}
