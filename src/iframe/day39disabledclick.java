package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day39disabledclick {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement file = driver.findElement(By.linkText("jdk-11.0.21_windows-x64_bin.exe"));
	    js.executeScript("arguments[0].scrollIntoView(false);", file);
	    file.click();
	   WebElement disable_button = driver.findElement(By.linkText("Download jdk-11.0.21_windows-x64_bin.exe"));
	    js.executeScript("arguments[0].click();", disable_button);
	}

}
