import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ktm {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		String s="https://www.royalenfield.com/in/en/home/";
		
		driver.get("https://www.ktm.com/en-in.html");
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
