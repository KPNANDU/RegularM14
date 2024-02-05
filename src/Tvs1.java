import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Tvs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		String s="https://www.tvsmotor.com/";
		
		driver.get("https://www.tvsmotor.com/");
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
