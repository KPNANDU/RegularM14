import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day22fbassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String given_url="https://www.facebook.com/";
		driver.get("https://www.facebook.com/");
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("you are in facebook page");
			driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("wertyuifd");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sdfghjkuytr");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("dinisaroo@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("dinisaroo@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("123456");
			WebElement day= driver.findElement(By.cssSelector("select[id='day']"));
			Select s_ref = new Select(day);
			s_ref.selectByVisibleText("11");
			Thread.sleep(2000);
			WebElement month = driver.findElement(By.cssSelector("select[id='month']"));
			Select s_ref1= new Select(month);
			s_ref1.selectByVisibleText("May");
			Thread.sleep(2000);
			WebElement year = driver.findElement(By.cssSelector("select[id='year']"));
			Select s_ref2= new Select(year);
			s_ref2.selectByValue("2010");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='1']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@name='websubmit']")).click();
			Thread.sleep(2000);
			driver.close();
			System.out.println("successfully login");
		}
		else
			System.out.println("you are not in facebook page");

}
}
