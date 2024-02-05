import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.ktmindia.com/");
		
		String Current_titleKtm=driver.getTitle();
		System.out.println(Current_titleKtm);
		driver.get("https://www.royalenfield.com/in/en/home/");
		driver.navigate().back();
		String given_titleKtm="KTM | READY TO RACE | Explore the range in India – Models, Features, Price, Colors";
		if(given_titleKtm.contains( Current_titleKtm))
		{
			System.out.println("you are in Ktm webpage");
		}
		else
		{
			System.out.println("you are in royalenfield webpage");
		}
		 driver.navigate().forward();
	}
}
