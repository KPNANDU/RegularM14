import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class utilitylogin {
	public static WebDriver driver;
	public static void FireFoxBrowser(){
		driver =new FirefoxDriver();
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
		FireFoxBrowser();
		//ChromeBrowser();
		String given_url="https://demowebshop.tricentis.com/";
		openDWS();
		Thread.sleep(2000);
		String current_url = driver.getCurrentUrl();
		if(given_url.equals(current_url))
		{
			System.out.println("you are in demowebshop");
			driver.findElement(By.className("ico-login")).click();
			Thread.sleep(2000);
		    driver.findElement(By.cssSelector("#Email")).sendKeys("dinisaroo@gmail.com");
			Thread.sleep(2000);
		    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1234567kjhgf");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("#RememberMe")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
			Thread.sleep(2000);
			closeBrowser();
			System.out.println("logged in succesfully");
			}
		else
			System.out.println("you are not in demowebshop");
		
	}

}
