import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day21independentanddependentpathsibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		WebElement sibling = driver.findElement(By.xpath("//a[text()='3rd Album']/../../h2/following-sibling::div[3]/div/span"));
		System.out.println(sibling.getText());
	}

}
