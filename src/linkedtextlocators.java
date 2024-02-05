import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedtextlocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String given_url = "https://demowebshop.tricentis.com/";
		String given_loginTitle="Demo Web Shop. Login";
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String current_url =driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("successfully entered ");
			driver.findElement(By.linkText("Log in")).click();
			String currentLoginTitle = driver.getTitle();
			if (given_loginTitle.contains(currentLoginTitle))
			{
				System.out.println("you are in login page ");
				driver.close();
			}
			else
				System.out.println("you arenot in login page");
		}
		else
			System.out.println("unsuccessfull");
	}

}
