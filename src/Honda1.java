import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Honda1 {

	public static void main(String[] args) 
	{
      WebDriver driver =new FirefoxDriver();
      driver.manage().window().maximize();
		String s="https://www.hondacarindia.com/";
		
		driver.get("https://www.hondacarindia.com/");
		String s1=driver.getCurrentUrl();
		if(s.equals(s1)) {
			System.out.println("url is same");
		}
		else 
		{
			System.out.println("url is not same");
		}
		driver.close();
	}

}
