package popupday30;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day33robotclassassignment {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		Thread.sleep(2000);
		 Robot r = new Robot();
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_TAB);
		 Thread.sleep(2000);
		 r.keyRelease(KeyEvent.VK_TAB);
		 Thread.sleep(2000);
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyPress(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_TAB);
		 r.keyRelease(KeyEvent.VK_TAB);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 driver.close();
	}

}
