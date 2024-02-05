package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class day46DWSHomePage{
	public  day46DWSHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	//variable
	@FindBy(id = "small-searchterms")
	WebElement searchField;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement searchbutton;
	//methods
	 public void searchField(String value) {
		 searchField.sendKeys(value);
	 }
	 public void searchbutton() {
		 searchbutton.click();
	 }
}
	