package popupday30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day32simplepopupdismiss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		 Thread.sleep(2000);
		 Alert a =driver.switchTo().alert();
		 a.dismiss();
		 Thread.sleep(2000);
		 //driver.findElement(By.linkText("Widgets")).click();
		 driver.close();
	}

}
