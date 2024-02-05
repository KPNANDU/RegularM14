package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class day46assignmentregister {
	public day46assignmentregister(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(className = "ico-register")
	WebElement register;
	@FindBy(id = "gender-male")
	WebElement gendermale;
	@FindBy(id="gender-female")
	WebElement genderfemale;
	@FindBy(id="FirstName")
	WebElement firstname;
	@FindBy(id = "LastName")
	WebElement lastname;
	@FindBy(id = "Email")
	WebElement email;
	@FindBy(id = "Password")
	WebElement password;
	@FindBy(id="ConfirmPassword")
	WebElement confirmpassword;
	@FindBy(id = "register-button")
	WebElement registerbutton;
}
