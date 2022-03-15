package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(xpath="//input[@type='email']")
	private WebElement useremail;
	@FindBy(xpath="//input[@type='password']")
	private WebElement Passwords;
	@FindBy(xpath="//*[contains(text(),'SIGN IN')]")
	private WebElement button;
	           

	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void email(String fn)
	{
		useremail.clear();
		useremail.sendKeys(fn);
	}

	public void password(String pass)
	{
		Passwords.clear();
		Passwords.sendKeys(pass);
	}
	public void siginbutton()
	{
		button.click();
	}
}
