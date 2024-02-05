import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathassignbook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String given_url="https://demowebshop.tricentis.com/";
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		String current_url=driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			System.out.println("you are in demowebshop page ");
			driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/ul/li/a")).click();
			Thread.sleep(4000);
			WebElement bookpage = driver.findElement(By.cssSelector(".page-title"));
			Thread.sleep(4000);
			if(bookpage.isDisplayed()) {
				System.out.println("you are in bookpage");
			}
			else
				System.out.println("you are not in bookpage");
			driver.findElement(By.xpath("/html[1]/body/div/div[1]/div/ul/li[2]/a")).click();
			Thread.sleep(4000);
			WebElement computer_page = driver.findElement(By.cssSelector(".page-title"));
			if(computer_page.isDisplayed()) {
				System.out.println("you are in computerpage");
			}
			else
				System.out.println("you are not in computerpage");
			driver.findElement(By.xpath("/html[1]/body/div/div[1]/div/ul/li[3]/a")).click();
			Thread.sleep(4000);
			WebElement electronics_page=driver.findElement(By.cssSelector(".page-title"));
			if(electronics_page.isDisplayed()) {
				System.out.println("you are in electronics page");
			}
			else
				System.out.println("you are not in electronics page");
			driver.findElement(By.xpath("/html[1]/body/div/div[1]/div/ul/li[4]/a")).click();
			Thread.sleep(4000);
            WebElement  apparel_shoes=driver.findElement(By.cssSelector(".page-title"));
			if(apparel_shoes.isDisplayed()) {
				System.out.println("you are in apparel_shoes");
			}
			else
				System.out.println("you are not in apparel_shoes");
			driver.findElement(By.xpath("/html[1]/body/div/div[1]/div/ul/li[5]/a")).click();
			Thread.sleep(4000);
            WebElement  digital_downloads=driver.findElement(By.cssSelector(".page-title"));
			if(digital_downloads.isDisplayed()) {
				System.out.println("you are in digital_downlaods page");
			}
			else
				System.out.println("you are not in digital_downloads page");
			driver.findElement(By.xpath("/html[1]/body/div/div[1]/div/ul/li[6]/a")).click();
			Thread.sleep(4000);
            WebElement  jewelry=driver.findElement(By.cssSelector(".page-title"));
			if(jewelry.isDisplayed()) {
				System.out.println("you are in jewelry page");
			}
			else
				System.out.println("you are not in jewelry page");
			driver.findElement(By.xpath("/html[1]/body/div/div[1]/div/ul/li[7]/a")).click();
			Thread.sleep(4000);
            WebElement  giftscards=driver.findElement(By.cssSelector(".page-title"));
			if(giftscards.isDisplayed()) {
				System.out.println("you are in giftscard page");
			}
			else
				System.out.println("you are not in giftscard page");
			}
           driver.close();
	}

}
