package paramaterized;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class differentBrowsers {
	WebDriver driver;
	@Parameters("DRIVER")
	@Test
	public void browsers(String div) {
		if(div.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
			System.out.println("hi iam from chromebrowser");
			Reporter.log("chromedriver");
		}
		else if(div.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
			System.out.println("hi iam from edgebrowser");
			Reporter.log("edgedriver");
			}
		else if(div.equalsIgnoreCase("firefox")) {
			driver= new FirefoxDriver();
			System.out.println("hi iam from firefoxbrowser");
			Reporter.log("firefoxdriver");
			
		}
	}

}
