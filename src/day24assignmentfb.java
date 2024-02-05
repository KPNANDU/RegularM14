import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class day24assignmentfb {
	public static WebDriver driver;
	public static void ChromeBrowser(){
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		}
	public static void closeBrowser() {
		driver.close();
	}
	public static void FaceBook() {
		driver.get("https://www.facebook.com/");
	}
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeBrowser();
		FaceBook();
		Thread.sleep(2000);
		String given_url="https://www.facebook.com/";
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("you are in facebook page");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		WebElement signup = driver.findElement(By.xpath("//div[@class='_6ltg'][2]"));
		if(signup.isDisplayed()) {
			System.out.println("create account page is displayed");
			 WebElement Day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
			 Select s_ref= new Select(Day);
			 s_ref.selectByIndex(21);
			 Thread.sleep(2000);
			WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
			Select s_ref1=new Select(Month);
			s_ref1.selectByVisibleText("Jul");
			 Thread.sleep(2000);
			WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
			Select s_ref2 =new Select(year);
			s_ref2.selectByValue("2000");
			 Thread.sleep(2000);
			closeBrowser();
			}
		else
			System.out.println("create account is not displayed");
		}
		else
			System.out.println("you are not in facebook page");
		}
}
