import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Refreshtask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String current_title=driver.getTitle();
		driver.navigate().to("https://www.abhibus.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		Thread.sleep(5000);
		String given_title="Demo Web Shop";
		
		if (current_title.equals(given_title))
		{
			System.out.println("you are in demo web shop webpage ");
		}
		else 
		{
			System.out.println("you are in abhibus webpage ");
		}
		 driver.close();
	}
	

}
