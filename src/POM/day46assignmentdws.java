package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class day46assignmentdws {
	public day46assignmentdws(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//values
	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	WebElement icon;
	@FindBy(className = "ico-register")
	WebElement register;
	@FindBy(className = "ico-login")
	WebElement login;
	@FindBy(xpath = "//span[text()='Shopping cart']")
	WebElement shoppingcart;
	@FindBy(className = "ico-wishlist")
	WebElement wishlist;
	@FindBy(id = "small-searchterms")
	WebElement searchField;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement searchbutton;
	@FindBy(xpath = "//a[contains(text(),'Computers')][1]")
	WebElement computer;
	@FindBy(xpath = "//a[contains(text(),'Electronics')][1]")
	WebElement electronics;
	@FindBy(xpath = "//a[contains(text(),'Apparel & Shoes')][1]")
	WebElement apparelandshoes;
	@FindBy(xpath = "//a[contains(text(),'Digital downloads')][1]")
	WebElement digitaldownloads;
	@FindBy(xpath = "//a[contains(text(),'Jewelry')][1]")
	WebElement jewelry;
	@FindBy(xpath = "//a[contains(text(),'Gift Cards')][1]")
	WebElement giftcard;
	@FindBy(id = "newsletter-email")
	WebElement newsletter;
	@FindBy(xpath = "//input[@value='Subscribe']")
	WebElement subscribe;
	@FindBy(xpath = "//label[text()='Excellent']")
	WebElement commmunitypoll1;
	@FindBy(xpath = "//label[text()='Good']")
	WebElement commmunitypoll2;
	@FindBy(xpath = "//label[text()='Poor']")
	WebElement commmunitypoll3;
	@FindBy(xpath = "//label[text()='Very bad']")
	WebElement commmunitypoll4;
	@FindBy(xpath = "vote-poll-1")
	WebElement votebutton;
	
	

}
