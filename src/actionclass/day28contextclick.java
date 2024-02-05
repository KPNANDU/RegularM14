package actionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class day28contextclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement double_click = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions a=new Actions(driver);
        a.contextClick(double_click).build().perform();
        Thread.sleep(2000);
        System.out.println("succesfull");
        

	}

}
