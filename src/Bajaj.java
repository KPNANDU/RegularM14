import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bajaj {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		String s="https://global.globalbajaj.com/";
		
		driver.get("https://global.globalbajaj.com/");
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

