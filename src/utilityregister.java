import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class utilityregister {
	public static WebDriver driver;
		public static void ChromeBrowser(){
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			}
		public static void closeBrowser() {
			driver.close();
		}
		public static void openDWS() {
			driver.get("https://demowebshop.tricentis.com/");
		}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeBrowser();//precondition
		String given_url="https://demowebshop.tricentis.com/";
		openDWS();//TESTSCRIPT
		Thread.sleep(2000);
		String current_url = driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("you are in demowebshop");
			driver.findElement(By.cssSelector(".ico-register")).click();
			Thread.sleep(2000);
			WebElement current_title = driver.findElement(By.cssSelector("div[class='page-title']"));
				if(current_title.isDisplayed()) {
					System.out.println("you are in register page");
					driver.findElement(By.cssSelector("input[value='F']")).click();
					Thread.sleep(2000);
					driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys("nandini");
					Thread.sleep(2000);
					driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("kp");
					Thread.sleep(2000);
					driver.findElement(By.cssSelector("#Email")).sendKeys("dinisaroo@gmail.com");
					Thread.sleep(2000);
					driver.findElement(By.cssSelector("#Password")).sendKeys("1234567kjhgf");
					Thread.sleep(2000);
					driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("1234567kjhgf");
					Thread.sleep(2000);
					driver.findElement(By.cssSelector("input[value='Register']")).click();
					Thread.sleep(2000);
					closeBrowser();
					}
				else 
					System.out.println("you are not in register page");
				
			}
		else
			System.out.println("you are not in demowebshop");

}
}