import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchByUpcasting {

	public static void main(String[] args) {
		String s="https://www.qspiders.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qspiders.com/");

		String s1=driver.getCurrentUrl();
		if(s.equals(s1))
		{
			System.out.println("url is same");
		}
		else 
		{
			System.out.println("url is not same ");
		}
		driver.close();

	}

}
