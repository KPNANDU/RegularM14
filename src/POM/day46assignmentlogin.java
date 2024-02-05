package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class day46assignmentlogin {
	public day46assignmentlogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	@FindBy(className = "ico-login")
	WebElement login;
	@FindBy(id = "Email")
	WebElement email;
	@FindBy(id = "Password")
	WebElement password;
	@FindBy(id = "RememberMe")
	WebElement checkbox;
	@FindBy(xpath = "//input[@value='Log in']")
	WebElement loginbutton;

}
