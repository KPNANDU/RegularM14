import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Royalenfield1 {

	public static void main(String[] args) {
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		String s="https://www.hondacarindia.com/";
		
		driver.get("https://www.royalenfield.com/in/en/home/");
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
