package popupday30;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class day35assignmentdemoautomation {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("dinga");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("dingi");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("qwertyuikdfghjkcvbnm");
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("dinga@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("2345678876");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("checkbox2")).click();
		Actions a = new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/section/div/div/div[2]/form/div[7]/div/multi-select/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Arabic']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='English']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Italian']")).click();
		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		 Select s = new Select(skills);
		 s.selectByVisibleText("Adobe InDesign");
		WebElement single_select = driver.findElement(By.id("countries"));
		 Select s_ref=new Select(single_select);
		 s_ref.selectByVisibleText("Select Country");
		 driver.findElement(By.xpath("//span[@tabindex='-1']")).click();
		 Thread.sleep(5000);
	     driver.findElement(By.xpath("//li[text()='India']")).click();
	     WebElement year = driver.findElement(By.id("yearbox"));
		  Select y = new Select(year);
		  y.selectByVisibleText("1995");
		  driver.findElement(By.xpath("//select[@ng-model='monthbox']")).click();
		  driver.findElement(By.xpath("//option[@value='April']")).click();
		  driver.findElement(By.id("daybox")).click();
		  driver.findElement(By.xpath("//option[@value='25']")).click();
		  driver.findElement(By.id("firstpassword")).sendKeys("2345678jhg");
		  driver.findElement(By.id("secondpassword")).sendKeys("2345678jhg");
		  driver.findElement(By.id("submitbtn")).click();
		  
		  
		

	}

}
